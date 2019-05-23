package com.github.chuangkel.findexcel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * 搜索excel 如果某个单元格与目标匹配，则输出整行
 *
 * @author chuangkel
 */
public class ExcelSearcher {

    /**
     * 输入excel
     */
    private static final String SOURCE_FILE_PATH = "E:\\资管业委会\\svn\\trunk\\Documents\\D2.Designs\\组合管理2.0接口文档V1.0.xlsm";

    /**
     * 输出excel
     */
    private static final String WRITE_FILE_PATH = "E:\\资管业委会\\字典字段汇总.xls";
    /**
     * 自定义sheet名字
     */
    private static final String SHEET_NAME = "sheet";

    /**
     * 文件读取流
     */
    private static FileInputStream in = null;

    public static void main(String[] args) throws IOException {
        in = new FileInputStream(SOURCE_FILE_PATH);
        Set<String> target = new HashSet<>();
        //建立匹配目标
        for (int i = 1; i < 30; i++) {
            target.add("100" + i + ".0");
        }

        //处理数据
        List<List<String>> list = dealData(getWorkbook(in), target);

        writeWorkbook(list);
        in.close();
    }


    /**
     * 写工作簿
     *
     * @throws FileNotFoundException
     */
    public static void writeWorkbook(List<List<String>> list) throws FileNotFoundException {
        Workbook workbook = new HSSFWorkbook();
        FileOutputStream fileOut = new FileOutputStream(WRITE_FILE_PATH);
        //添加sheet
        Sheet sheet1 = workbook.createSheet(SHEET_NAME);
        //将二维数组写入excel
        for (int i = 0; i < list.size(); i++) {
            List<String> li = list.get(i);
            //创建一行
            Row row = sheet1.createRow(i);
            for (int j = 0; j < li.size(); j++) {
                Cell cell = row.createCell(j);
                cell.setCellValue(li.get(j));
            }
        }

        try {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 读取工作簿
     *
     * @throws IOException
     */
    public static XSSFWorkbook getWorkbook(FileInputStream in) throws IOException {
        //读取工作簿
        XSSFWorkbook workbook = new XSSFWorkbook(in);
        return workbook;
    }

    /**
     * 处理数据
     *
     * @param workbook 完整的 Workbook 对象
     *                 返回<code></code>
     */
    public static List<List<String>> dealData(Workbook workbook, Set<String> target) {
        List<List<String>> list = new ArrayList<>();

        //去重set
        Set<String> removeDuplite = new HashSet<>();

        int number = workbook.getNumberOfSheets();
        for (int index = 2; index < number - 2; index++) {
            Sheet sheet = workbook.getSheetAt(index);
            //获取总行数
            int rows = sheet.getPhysicalNumberOfRows();

            //去除表头，可以从第 1 行开始打印
            for (int i = 0; i < rows; i++) {
                Row row = sheet.getRow(i);
                if (row == null) {
                    continue;
                }
                //获取总列数
                int cols = row.getPhysicalNumberOfCells();
                //if 与目标匹配
                if (null != row.getCell(9) && target.contains(row.getCell(9).toString())
                        && !removeDuplite.contains(row.getCell(2).toString())) {
                    removeDuplite.add(row.getCell(2).toString());
                    List<String> li = new ArrayList<>();
                    //遍历一行
                    for (int j = 0; j < cols; j++) {
                        li.add(row.getCell(j) == null ? "" : row.getCell(j).toString());
                    }
                    list.add(li);
                }
            }
        }
        return list;
    }
}
