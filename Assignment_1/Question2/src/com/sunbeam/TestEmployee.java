package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class TestEmployee {

	public static Employee linearSearchById( Employee[] employees, int empId) {
		for (Employee employee : employees) {
			if (employee.getEmpid() == empId) {
				return employee;
			}
		}
		return null;// Emp not found
	}

	public static Employee linearSearchByName(Employee[] employees, String empName) {
		for (Employee employee : employees) {
			if (employee.getName() == empName) {
				return employee;
			}
		}
		return null;// Emp not found
	}
	
	public static int binarySearchBySalary(Employee[] employees,double salary) {
		int left=0,right=employees.length-1,mid;
		
		while(left<=right) {
			mid=(left+right)/2;
			
			if(salary==employees[mid].getSalary()) {
				return mid;
			}else if(salary <employees[mid].getSalary()) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Employee[] employees = new Employee[5];

		employees[0] = new Employee(1, "Suyash", 50000.0);
		employees[1] = new Employee(2, "Prasanna", 60000.0);
		employees[2] = new Employee(3, "Akash", 55000.0);
		employees[3] = new Employee(4, "Akhilesh", 62000.0);
		employees[4] = new Employee(5, "Pavan", 70000.0);

//		int searchId = 1;
//		Employee searchById = linearSearchById(employees, searchId);
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter Id to search");
		int searchId=sc.nextInt();
		
		Employee searchById = linearSearchById(employees, searchId);

		if (searchById != null) {
			System.out.println("Employee found by ID = " + searchById);
		} else {
			System.out.println("Employee not found by ID");
		}
		
		String searchName = "Prasanna";
		Employee searchByName = linearSearchByName(employees, searchName);

//		System.out.println("Enter Name to search");
//		String searchName=sc.next();
		
//		Employee searchByName = linearSearchByName(employees, searchName);
		
		if (searchByName != null) {
			System.out.println("Employee found by Name = " + searchByName.getName());
		} else {
			System.out.println("Employee not found by Name");
		}
		
		
		Arrays.sort(employees,(a,b)->Double.compare(a.getSalary(), b.getSalary()));
		System.out.println("Enter the salary to search");
		double searchSalary=sc.nextDouble();
		
		int searchBySalary=binarySearchBySalary(employees, searchSalary);
		
		if(searchBySalary!=-1) {
			System.out.println("Employee found by salary");
		}else {
			System.out.println("Employee not found by salary");
		}
		


	}

}
