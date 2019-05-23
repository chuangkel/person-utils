package com.github.chuangkel.replace;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 替换字符串
 * @author yaoqb23911
 */
public class ReplaceString {

    public static void main(String[] args) {

        contextLoads();
    }

	public static void contextLoads() {

	    Map<String,String> map = new HashMap<>();
	    map.put("String","MySqlTypeConstant.VARCHAR");
	    map.put("Integer","MySqlTypeConstant.INT");
	    map.put("DOUBLE","MySqlTypeConstant.DOUBLE");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){

            String s = scanner.next();

            String [] arr = s.split(";")[0].split(" ");
            StringBuilder sb = new StringBuilder();
            sb.append("@Column(name = \"@name\",type = @type)");
            sb = new StringBuilder(sb.toString()
                    .replace("@name",arr[2])
                    .replace("@type",map.get(arr[1])));
            System.out.println(sb.toString());
        }
	}

}
