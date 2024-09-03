package com.example.demo;

public class Response {
	
	private String fileName;
	private String dounloadUrl;
	private String fileType;
	private Long fileSize;
	public Response(String fileName, String dounloadUrl, String fileType, Long fileSize) {
		super();
		this.fileName = fileName;
		this.dounloadUrl = dounloadUrl;
		this.fileType = fileType;
		this.fileSize = fileSize;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getDounloadUrl() {
		return dounloadUrl;
	}
	public void setDounloadUrl(String dounloadUrl) {
		this.dounloadUrl = dounloadUrl;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public Long getFileSize() {
		return fileSize;
	}
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}
	

}
