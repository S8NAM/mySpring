package com.ss.sh.godok.model;

import java.sql.Timestamp;

public class GodokVO {
	private int no;
	private String title;
	private String pwd;
	private String notice;
	private Timestamp regdate;
	private String delFlag;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	public String getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	@Override
	public String toString() {
		return "GodokVO [no=" + no + ", title=" + title + ", pwd=" + pwd + ", notice=" + notice + ", regdate=" + regdate
				+ ", delFlag=" + delFlag + "]";
	}
	
	
}
