package com.github.chuangkel.hold_type;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

/**
 * @program: demo1
 * @description: java 对象转换成xml
 * @author: chuangkel
 * @create: 2019-05-07 16:28
 **/
public class Java2Excel {


    public static void main(String[] args) throws ParseException {
//        java2Xml(null);
    }

    public static void java2Xml(List<ObjDto> objDtos) throws ParseException, FileNotFoundException {
        //新建工作簿 workbook.xls
        Workbook workbook = new HSSFWorkbook();
        FileOutputStream fileOut = new FileOutputStream("pms_holder_type.xls");
        //添加sheet
        Sheet sheet1 = workbook.createSheet("pms_holder_type");

        LocalDate localDate = LocalDate.of(2018,05,12);

        int r = 0;
        BigDecimal ten = new BigDecimal("100");
        for (int i = 0; i < 386; i++) {
            //日期加一天 对应的时间可以加一个小时
            LocalDate plusDay = localDate.plusDays(i);
            //将二维数组写入excel

            BigDecimal ratio = ten.multiply(new BigDecimal(Math.random()));
            for (int j = 0; j < objDtos.size(); j++) {
                ObjDto objDto = objDtos.get(j);
                //创建一行
                Row row = sheet1.createRow(r ++ );
                Cell cell = row.createCell(0);
                cell.setCellValue("1");

                Cell cell1 = row.createCell(1);
                cell1.setCellValue(plusDay.toString().replace("-",""));

                Cell cell2 = row.createCell(2);
                cell2.setCellValue(objDto.getFund_account());

                Cell cell3 = row.createCell(3);
                cell3.setCellValue(objDto.getHolder_name());

                Cell cell4 = row.createCell(4);
                switch (j){
                    case 0:
                        cell4.setCellValue(ratio.toString());
                        break;
                    case 1:
                        cell4.setCellValue(new BigDecimal("100").subtract(ratio).toString());
                        break;
                    case 2:
                        cell4.setCellValue(new BigDecimal("100").toString());
                        break;

                }
                Cell cell5 = row.createCell(5);
                cell5.setCellValue(ratio.multiply(new BigDecimal("100000")).toString());

            }

        }
        try {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
