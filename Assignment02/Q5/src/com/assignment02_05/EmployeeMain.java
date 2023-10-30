/*
5. Write a function to sort employees by their salary.
*/

package com.assignment02_05;

import java.util.Scanner;

public class EmployeeMain 
{
	public static void selectSort(Employee arr[], int N)
	{
		for(int i =0 ; i > N-1; i++)
		{
			for(int j = i+1; j<N; j++)
			{
				if(arr[i].getSalary() > arr[j].getSalary())
				{
					Employee temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		Employee e2 = new Employee(2, "Scott", 80000);
		Employee e5 = new Employee(5, "Emy", 40000);
		Employee e3 = new Employee(3, "Jack", 600000);
		Employee e1 = new Employee(1,"John", 100000);
		Employee e4 = new Employee(4, "Lee",50000 );
		
		
				Employee arr[] = {e1,e2,e3,e4};
		
		selectSort(arr, arr.length);
		System.out.println("Employee after sort using insertion sort");
		for (Employee emp : arr) 
		{
			System.out.println(emp);
		}
	}

}
