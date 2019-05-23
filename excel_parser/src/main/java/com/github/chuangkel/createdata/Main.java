package com.github.chuangkel.createdata;

import com.github.chuangkel.dto.DictDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * @program: demo1
 * @description: excel 将一定格式的excel 转换成java对象，再输出xml
 * @author: chuangkel
 * @create: 2019-05-07 16:31
 **/
public class Main {
    static FileInputStream in = null;
    public static void main(String[] args) throws IOException, ParseException {

        List<ObjDto> objDtos = Excel2Data.dealData(Excel2Data.getWorkbook(in));
        Java2Excel.java2Xml(objDtos);
    }
}
