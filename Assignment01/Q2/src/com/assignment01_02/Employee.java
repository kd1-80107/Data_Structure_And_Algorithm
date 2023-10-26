package com.assignment01_02;

import java.util.Scanner;

public class Employee 
{
	
	int empid;
	String name;
	double salary;
	
	public Employee(int empid, String name, double salary)
	{
		
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	public static Employee searchByEmpid(Employee[] emp,int empid)
	{
		for(int i = 0; i<emp.length; i++)
		{
			if(emp[i].empid == empid)
			{
				return emp[i];
			}
		}
			return null;
		
	}
	
	public static Employee searchBySalary(Employee[] emp, double salary)
	{
		for(int i = 0; i<emp.length; i++)
		{
			if(emp[i].salary == salary)
			{
				return emp[i];
			}
		}
		return null;
	}
	
	public static Employee searchByName(Employee[] emp, String name)
	{
		for(int i = 0; i<emp.length; i++ )
		{
			if(emp[i].name == name)
			{
				return emp[i];
			}
		}
		return null;
	}


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//adding employing.
		Employee[]emp = { 
						new Employee(01,"Anil",50000),
						new Employee(02, "Aniket", 60000),
						new Employee(03, "Manas", 100000)
						};
		System.out.println("Enter EmpId to Search Employee : ");
		int empIdToSearch = sc.nextInt();
		Employee result = searchByEmpid(emp, empIdToSearch);
			if(result != null)
			{
				System.out.println("Employee found by EmpId : "+result.name);
			}
			else
			{
				System.out.println("Employee not found by Empid : "+empIdToSearch);
			}
			
			System.out.println("Enter salary to Search Employee : ");
			double salaryToSearch = sc.nextDouble(); 
			Employee result1 = searchBySalary(emp, salaryToSearch);
			if(result != null)
			{
				System.out.println("Employee found by salary : "+result1.name);
			}
			else
			{
				System.out.println("Employee not found by Empid : " +salaryToSearch);
			}
			
			System.out.println("Enter name to Search Employee : ");
			String nameToSearch = sc.next();
			Employee result2 = searchByName(emp, nameToSearch);
			if(result2 != null)
			{
				System.out.println("Emp is found by name & his id is : " + result2.empid);
			}
			else
			{
				System.out.println("Emp not found");
			}
			
			
			
	}

}
