package com.assignment01_01;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class LinearSearch 
{
	public static int linear_search(int arr[], int size, int key) {
		int count = 0;
        for(int i = 0 ; i < size ; i++)
        {
        	count++;
        	if(arr[i] == key)
        	{
        		System.out.println("Comparison :" +count);
        		return i;
        	}
        }
        
        System.out.println("Comparison :" +count);
        return -1;
	}

	public static void main(String[] args) {
		int arr[] = {66, 11, 33, 88, 22, 99, 77, 33};
		
		// take key from user
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter key to be searched : ");
		System.out.println("--------------------------");
		int key = sc.nextInt();
		
		int index = linear_search(arr, arr.length, key);
		if(index != -1)
			System.out.println("Key is found at index : " + index);
		else
			System.out.println("Key is not found");
			//sc.close();
		}
	}

}
