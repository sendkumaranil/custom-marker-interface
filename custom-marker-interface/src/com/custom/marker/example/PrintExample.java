package com.custom.marker.example;

public class PrintExample {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpid(1001);
		emp.setEmpname("Anil Kumar");
		
		PrintData print=new PrintData();		
		try {			
			print.printData(emp);			
		} catch (PrintAccessNotFound e) {
			e.printStackTrace();
		}
	}
}
