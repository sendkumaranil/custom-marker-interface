package com.custom.marker.example;

public class PrintData {

	
	public void printData(Object data) throws PrintAccessNotFound {
		if(data instanceof Printable) {
			System.out.println("Data is being printing");
			if(data instanceof Employee) {
				Employee emp=(Employee)data;
				System.out.println("Emp ID:"+emp.getEmpid());
				System.out.println("Emp Name:"+emp.getEmpname());
			}
		}else {
			throw new PrintAccessNotFound("Implement Printable");
		}
	}
}
