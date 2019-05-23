package com.github.chuangkel.dictexcel;

import com.github.chuangkel.dto.DictDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/**
 * @program: demo1
 * @description: excel 将一定格式的excel 转换成java对象，再输出xml
 * @author: chuangkel
 * @create: 2019-05-07 16:31
 **/
public class Main {
    static FileInputStream in = null;
    public static void main(String[] args) throws IOException {

        Map<String, DictDTO> map = Excel2Java.dealData(Excel2Java.getWorkbook(in));

        Java2Xml.java2Xml(map);
        System.out.println();

    }
}
