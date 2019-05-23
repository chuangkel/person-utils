package com.github.chuangkel.personalutils.test;

import com.google.common.base.CaseFormat;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * javaBean 对象转换成hibernate的表结构对象
 * 驼峰 下划线转换
 */

public class JavaBean2TableBean {

    public static void main(String[] args) {
        System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, "TopHoldingIndustry"));
        contextLoads();
    }

    public static void contextLoads() {

        Map<String, String> map = new HashMap<>();
        map.put("String", "MySqlTypeConstant.VARCHAR");
        map.put("Integer", "MySqlTypeConstant.INT");
        map.put("Double", "MySqlTypeConstant.DOUBLE");
        map.put("char","MySqlTypeConstant.CHAR");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            String s = scanner.nextLine();

            String[] arr = s.split(";")[0].trim().split(" ");
            StringBuilder sb = new StringBuilder();
            sb.append("@Column(name = \"@name\",type = @type,length = @length,decimalLength = @decimalLength)");
            sb = new StringBuilder(sb.toString()
                    .replace("@name", CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, arr[4]))
                    .replace("@type", map.get(arr[1]))
                    .replace("@length",arr[2])
                    .replace("@decimalLength", arr[3]));
            System.out.println(sb.toString());
            System.out.println(s.replace(arr[2],"").replace(arr[3],""));
        }
    }

}
