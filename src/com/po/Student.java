package com.po;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
  private Integer stuid;
  private String sname;
  private String sex;
  private String address;
  private Date birthday;
  private Integer classid;
  private String cname;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(Integer stuid, String sname, String sex, String address, Date birthday, Integer classid, String cname) {
	super();
	this.stuid = stuid;
	this.sname = sname;
	this.sex = sex;
	this.address = address;
	this.birthday = birthday;
	this.classid = classid;
	this.cname = cname;
}
public Student(String sname, String sex, String address, Date birthday, Integer classid) {
	super();
	this.sname = sname;
	this.sex = sex;
	this.address = address;
	this.birthday = birthday;
	this.classid = classid;
}

public Student(Integer stuid, String sname, String sex, String address, Date birthday, Integer classid) {
	super();
	this.stuid = stuid;
	this.sname = sname;
	this.sex = sex;
	this.address = address;
	this.birthday = birthday;
	this.classid = classid;
}
public Integer getStuid() {
	return stuid;
}
public void setStuid(Integer stuid) {
	this.stuid = stuid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Date getBirthday() {
	return birthday;
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
public Integer getClassid() {
	return classid;
}
public void setClassid(Integer classid) {
	this.classid = classid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
@Override
public String toString() {
	return "Student [stuid=" + stuid + ", sname=" + sname + ", sex=" + sex + ", address=" + address + ", birthday="
			+ birthday + ", classid=" + classid + ", cname=" + cname + "]";
}
  
}
