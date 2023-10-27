package com.sunbeam;

import java.util.Arrays;

public class EmployeeTest {
	 public static void insertionSort(Employee[] employees,int n) {
//	        int n = employees.length;
	        for (int i = 1; i < n; i++) {
	            Employee temp = employees[i];
	            int j = i - 1;
	            while (j >= 0 && employees[j].getSalary() > temp.getSalary()) {
	                employees[j + 1] = employees[j];
	                j--;
	            }
	            employees[j + 1] = temp;
	        }
	    }
	public static void main(String[] args) {
		Employee[] employees = new Employee[5];

		employees[0] = new Employee(1, "Suyash", 50000.0);
		employees[1] = new Employee(2, "Prasanna", 60000.0);
		employees[2] = new Employee(3, "Akash", 55000.0);
		employees[3] = new Employee(4, "Akhilesh", 62000.0);
		employees[4] = new Employee(5, "Pavan", 70000.0);
		
		insertionSort(employees, employees.length);
		System.out.println("Salary in sorted order "+Arrays.toString(employees));

	}

}
