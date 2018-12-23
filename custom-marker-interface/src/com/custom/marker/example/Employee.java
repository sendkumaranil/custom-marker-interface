package com.custom.marker.example;

/*here if we won't implement marker interface then exception will throw in PrintExample*/
/*if you want to test then remove implements Printable and again run PrintExample*/
public class Employee implements Printable  {

	private int empid;
	private String empname;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
}
