package com.example.demo.models;

public class Course {
	
	// cid - course id
	private Long cid;
	private String coursename;
	
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", coursename=" + coursename + "]";
	}
}
