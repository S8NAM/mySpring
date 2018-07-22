package com.ss.sh.faq.model;

import java.util.Date;

public class FaqVO {
	private int faqNo;
	private String adminId;
	private String category; 
	private String faqTitle;
	private String faqContent;
	private Date faqRegdate; 
	private String delflag;
	public int getFaqNo() {
		return faqNo;
	}
	public void setFaqNo(int faqNo) {
		this.faqNo = faqNo;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getcategory() {
		return category;
	}
	public void setcategory(String category) {
		this.category = category;
	}
	public String getFaqTitle() {
		return faqTitle;
	}
	public void setFaqTitle(String faqTitle) {
		this.faqTitle = faqTitle;
	}
	public String getFaqContent() {
		return faqContent;
	}
	public void setFaqContent(String faqContent) {
		this.faqContent = faqContent;
	}
	public Date getFaqRegdate() {
		return faqRegdate;
	}
	public void setFaqRegdate(Date faqRegdate) {
		this.faqRegdate = faqRegdate;
	}
	public String getDelflag() {
		return delflag;
	}
	public void setDelflag(String delflag) {
		this.delflag = delflag;
	}
	
	@Override
	public String toString() {
		return "FaqVO [faqNo=" + faqNo + ", adminId=" + adminId + ", category=" + category + ", faqTitle=" + faqTitle
				+ ", faqContent=" + faqContent + ", faqRegdate=" + faqRegdate + ", delflag=" + delflag + "]";
	}
	
	
}
