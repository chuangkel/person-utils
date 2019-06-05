package com.github.chuangkel.utils;

import com.google.common.base.CaseFormat;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * javaBean 对象转换成hibernate的表结构对象
 * 驼峰 下划线转换
 */

public class JavaBean2DatabaseTable {

    public static void main(String[] args) {
        System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, "TopHoldingIndustry"));
        //contextLoads();
        contextLoads1();
    }

    public static void contextLoads() {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String s = scanner.nextLine();
            if (null == s || "".equals(s))
                continue;
            String [] arr = s.trim().split(" ");
            System.out.printf(" <outputParameters id=\"%s\"/>\n"
            , CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, arr[2].replace(";","")));
        }
    }

    /** 数据库表字段映射成ares工具 */
    public static void contextLoads1() {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String s = scanner.nextLine();
            if (null == s || "".equals(s))
                continue;
            String [] arr = s.trim().split(" ");
            System.out.printf(" <columns fieldName=\"%s\" nullable=\"false\"/>\n"
                    , CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, arr[0].replace("`","")));
        }
    }
}
