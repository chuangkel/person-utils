package com.github.chuangkel.columnparser;

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

        Map<String, String> map = ReadColumnType.readColumnType(ReadColumnType.getWorkbook(in));

        ReadBusinessColumn.readBussiness(ReadBusinessColumn.getWorkbook(in),map);

    }
}
