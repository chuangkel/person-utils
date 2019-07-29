package com.github.chuangkel.createjson;

import com.google.common.base.CaseFormat;

import java.util.Map;
import java.util.Scanner;

/**
 * @program: personal-utils
 * @description:
 * @author: chuangkel
 * @create: 2019-07-25 11:27
 **/
public class CreateJson {
    //static Map<String,>
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (scanner.hasNext()){
            String line = scanner.nextLine();

            String column = line.split(";")[0].trim().split(" ")[2];
            String c = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, column);
            System.out.printf("    \"%s\":\"%s\",\n",c,1);
        }
    }
}
