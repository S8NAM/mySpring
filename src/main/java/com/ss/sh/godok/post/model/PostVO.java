package com.ss.sh.godok.post.model;

import java.sql.Timestamp;

public class PostVO {
	private int no         ;    
	private int threadNo    ;
	private int postNo;
	
	public int getPostNo() {
		return postNo;
	}

	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}

	private  String pwd        ; 
	private Timestamp regdate ;
	private  String fileName	;
	private  long fileSize 	;
	private  String originalFileName;

	private  String	delFlag  ;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getThreadNo() {
		return threadNo;
	}

	public void setThreadNo(int threadNo) {
		this.threadNo = threadNo;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public String getOriginalFileName() {
		return originalFileName;
	}

	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	@Override
	public String toString() {
		return "PostVO [no=" + no + ", threadNo=" + threadNo + ", pwd=" + pwd + ", regdate=" + regdate + ", fileName="
				+ fileName + ", fileSize=" + fileSize + ", originalFileName=" + originalFileName + ", delFlag="
				+ delFlag + "]";
	}
	
	
}