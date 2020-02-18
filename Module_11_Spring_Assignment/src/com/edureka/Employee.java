package com.edureka;


import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

 
public class Employee {
private int empno;
private String ename;
private int basic;
private int hra;
private int da;
private int deductions;

public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getBasic() {
	return basic;
}
public void setBasic(int basic) {
	this.basic = basic;
}
public int getHra() {
	return hra;
}
public void setHra(int hra) {
	this.hra = hra;
}
public int getDa() {
	return da;
}
public void setDa(int da) {
	this.da = da;
}
public int getDeductions() {
	return deductions;
}
public void setDeductions(int deductions) {
	this.deductions = deductions;
}
 


}
