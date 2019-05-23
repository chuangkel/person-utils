package com.github.chuangkel.columnparser;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * excel 转换成java对象
 *
 * @author chuangkel
 */
public class ReadColumnType {

    /**
     * Excel 文件位置
     */
    private static final String FILE_PATH = "E:\\资管业委会\\字段类型.xlsx";
    /**
     * 文件读取流
     */
    static FileInputStream in = null;

    public static void main(String[] args) throws IOException {
        //处理数据
        readColumnType(getWorkbook(in));
        in.close();
    }


    /**
     * 写工作簿
     *
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
     *
     * @throws IOException
     */
    public static XSSFWorkbook getWorkbook(FileInputStream in) throws IOException {
        in = new FileInputStream(FILE_PATH);
        XSSFWorkbook workbook = new XSSFWorkbook(in);
        return workbook;
    }

    /**
     * 处理数据
     *
     * @param workbook 完整的 Workbook 对象
     *                 返回<code></code>
     */
    public static Map<String, String> readColumnType(Workbook workbook) {
        //数据模型
        Map<String, String> map = new HashMap<>();

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
            String temp1 = row.getCell(2).toString();
            temp1.replace("STD", "");
            if (temp1.contains("str")) {
                map.put(temp, "String");
            } else if (temp1.contains("double")) {
                map.put(temp, "String");
            } else if (temp1.contains("int")) {
                map.put(temp, "Integer");
            } else if (temp1.contains("datetime")) {
                map.put(temp, "Integer");
            } else if (temp1.contains("char")) {
                map.put(temp, "char");
            } else {
            }
        }
        return map;
    }

}
