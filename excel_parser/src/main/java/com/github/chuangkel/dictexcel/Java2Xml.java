package com.github.chuangkel.dictexcel;

import com.github.chuangkel.dto.DictChildDTO;
import com.github.chuangkel.dto.DictDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * @program: demo1
 * @description: java 对象转换成xml
 * @author: chuangkel
 * @create: 2019-05-07 16:28
 **/
public class Java2Xml {


    public static void main(String[] args) {

//        java2Xml();
    }

    public static void java2Xml(Map<String, DictDTO> map){

        List<Map.Entry<String,DictDTO>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<String, DictDTO>>() {
            @Override
            public int compare(Map.Entry<String, DictDTO> o1, Map.Entry<String, DictDTO> o2) {
                char[] s1 = o1.getKey().toCharArray();
                char[] s2 =  o2.getKey().toCharArray();
                int i = 0;
                while (i < s1.length && i < s2.length){
                    if(s1[i] < s2[i]) return -1;
                    if(s1[i] > s2[i]) return 1;
                    i++;
                }
                if(s1.length > s2.length){
                    return -1;
                }
                return 1;
            }
        });
        StringBuilder itemsSb = new StringBuilder();
        itemsSb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<metadata:DictionaryList xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:metadata=\"http://www.hundsun.com/ares/studio/jres/metadata/1.0.0\" xmlns:model=\"http://www.hundsun.com/ares/studio/core/1.0.0\">\n" +
                "  <histories modifiedDate=\"2013-06-20 13:27\" version=\"1.0.0.1\" modified=\"1111\" comment=\"\"/>\n" +
                "  <histories modifiedDate=\"2013-06-20 13:27\" version=\"1.0.0.1\" modified=\"2222\" comment=\"\"/>\n" +
                "  <root/>\n");
        for(Map.Entry<String,DictDTO> d : list){
            //获取一个字典
            DictDTO dictDTO = d.getValue();

            itemsSb.append("  <items xsi:type=\"metadata:DictionaryType\" name=\"@name\" chineseName=\"@chineseName\">\n" +
                    "    <data2 key=\"user\">\n" +
                    "      <value xsi:type=\"model:UserExtensibleProperty\"/>\n" +
                    "    </data2>\n");
            itemsSb = new StringBuilder(
                    itemsSb.toString()
                            .replace("@name", dictDTO.getName())
                            .replace("@chineseName", dictDTO.getChineseName())
            );
            //对字典子项组装成xml
            List<DictChildDTO> dictChildDTOS = dictDTO.getChildDict();
            for (DictChildDTO temp : dictChildDTOS) {
	        	itemsSb.append("    <items value=\"@value\" chineseName=\"@chineseName\">\n" +
                        "      <data2 key=\"user\">\n" +
                        "        <value xsi:type=\"model:UserExtensibleProperty\"/>\n" +
                        "      </data2>\n" +
                        "    </items>\n");

	            itemsSb = new StringBuilder(
            			itemsSb.toString()
            			.replace("@value", temp.getValue())
            			.replace("@chineseName", temp.getChineseName())
            			);
	        }
            itemsSb.append("  </items>\n");
        }
        itemsSb.append("</metadata:DictionaryList>\n");
        System.out.println(itemsSb.toString());
    }
}
