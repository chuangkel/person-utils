package com.github.chuangkel.dto;

/**
 * 字典子项
 */
public class DictChildDTO {
    //子项code
    private String value;
    //子项中文名
    private String chineseName;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }
}
