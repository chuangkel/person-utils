package com.github.chuangkel.createdata;

import com.github.chuangkel.dto.DictChildDTO;
import com.github.chuangkel.dto.DictDTO;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * excel 转换成java对象
 * @author chuangkel
 */
public class Excel2Data {

    /** Excel 文件位置 */
    private static final String FILE_PATH = "E:\\资管业委会\\pms_topn_holder.xlsx";
    /** 文件读取流 */
    static FileInputStream in = null;
    public static void main(String[] args) throws IOException {
        //处理数据
        dealData(getWorkbook(in));
        in.close();
    }


    /**
     * 写工作簿
     * @throws FileNotFoundException
     */
    public static Sheet writeWorkbook() throws FileNotFoundException {
        //新建工作簿 workbook.xls
        Workbook workbook = new HSSFWorkbook();
        FileOutputStream fileOut = new FileOutputStream("pms_topn_holder.xls");
        //添加sheet
        Sheet sheet1 = workbook.createSheet("pms_topn_holder");

        return sheet1;
    }

    /**
     * 读取工作簿
     * @throws IOException
     */
    public static XSSFWorkbook getWorkbook(FileInputStream in) throws IOException {
        in = new FileInputStream(FILE_PATH);
        XSSFWorkbook workbook = new XSSFWorkbook(in);
        return workbook;
    }

    /**
     * 处理数据
     * @param workbook 完整的 Workbook 对象
     * 返回<code></code>
     */
    public static List<ObjDto> dealData(Workbook workbook) {
        List<ObjDto> objDtos = new ArrayList<>();
        //数据模型
        Map<String,DictDTO> map = new HashMap<>();

        Sheet sheet = workbook.getSheetAt(0);
        //获取总行数
        int rows = sheet.getPhysicalNumberOfRows();


        //去除表头，从第 1 行开始打印
        for (int i = 1; i < rows; i++) {
            ObjDto obj = new ObjDto();
            Row row = sheet.getRow(i);
            //获取总列数
            int cols = row.getPhysicalNumberOfCells();
            // 装配一行
            obj.setPort_id((int)Float.parseFloat(row.getCell(0).toString()));
            obj.setBusiness_date((int)Float.parseFloat(row.getCell(1).toString()));
            obj.setFund_account(String.valueOf((int)Float.parseFloat(row.getCell(2).toString())));
            obj.setHolder_name(row.getCell(3).toString());
            obj.setShare_ratio(new BigDecimal(row.getCell(4).toString()));
            obj.setHolding_amount(new BigDecimal(row.getCell(5).toString()));
            objDtos.add(obj);
        }

        return objDtos;
    }

}
