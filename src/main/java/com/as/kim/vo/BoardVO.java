package com.as.kim.vo;

import java.sql.Date;

public class BoardVO {
	
	private Integer num;
    private String name;
    private String title;
    private String content;
    private Integer readCount;
    private Date writeDate;
    private Integer read_Count;
    private Date write_date;
    
	public Date getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}
	public Integer getRead_Count() {
		return read_Count;
	}
	public void setRead_Count(Integer read_Count) {
		this.read_Count = read_Count;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getReadCount() {
		return readCount;
	}
	public void setReadCount(Integer readCount) {
		this.readCount = readCount;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
    
}
