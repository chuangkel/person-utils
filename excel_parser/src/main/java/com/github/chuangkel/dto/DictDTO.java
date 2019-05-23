package com.github.chuangkel.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * 字典项实体
 */
public class DictDTO {

    //字典父项code
    private String name;
    //字典父项中文名
    private String chineseName;

    private List<DictChildDTO> childDict = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public List<DictChildDTO> getChildDict() {
        return childDict;
    }

    public void setChildDict(List<DictChildDTO> childDict) {
        this.childDict = childDict;
    }
}
