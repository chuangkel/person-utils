package com.github.chuangkel.dto;

public class FieldDTO {
	private String name;
	private String chineseName;
	private String dataType;
	private String description;
	private String dictionaryType;

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

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDictionaryType() {
		return dictionaryType;
	}

	public void setDictionaryType(String dictionaryType) {
		this.dictionaryType = dictionaryType;
	}
}
