package com.github.chuangkel.dictexcel;

import com.github.chuangkel.dto.DictChildDTO;
import com.github.chuangkel.dto.DictDTO;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * excel 转换成java对象
 * @author chuangkel
 */
public class Excel2Java {

    /** Excel 文件位置 */
    private static final String FILE_PATH = "E:\\资管业委会\\数据字典.xlsx";
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
    public void writeWorkbook() throws FileNotFoundException {
        //新建工作簿 workbook.xls
        Workbook workbook = new HSSFWorkbook();
        FileOutputStream fileOut = new FileOutputStream("workbook.xls");
        //添加sheet
        Sheet sheet1 = workbook.createSheet("new sheet");
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
    public static Map<String,DictDTO> dealData(Workbook workbook) {
        //数据模型
        Map<String,DictDTO> map = new HashMap<>();

        Sheet sheet = workbook.getSheetAt(0);
        //获取总行数
        int rows = sheet.getPhysicalNumberOfRows();

        //去除表头，从第 1 行开始打印
        for (int i = 0; i < rows; i++) {
            Row row = sheet.getRow(i);
            //获取总列数
            int cols = row.getPhysicalNumberOfCells();

            // 装配一行
            String temp = row.getCell(0).toString();
            String code = temp.contains(".")?temp.split("\\.")[0]:temp;
            DictDTO dictDTO = null;
            if(!map.containsKey(code)){
                //新建父字典项
                dictDTO = new DictDTO();
                dictDTO.setName(code);
                dictDTO.setChineseName(row.getCell(1).toString());
                map.put(code,dictDTO);
            }else{
                dictDTO = map.get(code);
            }
            DictChildDTO dictChildDTO = new DictChildDTO();
            dictChildDTO.setValue(row.getCell(2).toString());
            dictChildDTO.setChineseName(row.getCell(3).toString());
            //把子项加入父项
            dictDTO.getChildDict().add(dictChildDTO);

            //遍历一行
//            for (int j = 0; j < cols; j++) {
//                System.out.print(row.getCell(j) + "\t");
//            }
//            System.out.println();

        }
        return map;
    }

}
