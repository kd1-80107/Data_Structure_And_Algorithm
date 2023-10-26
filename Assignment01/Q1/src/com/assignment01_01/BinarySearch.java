package com.assignment01_01;

import java.util.Scanner;

public class BinarySearch 
{
	public static int binarySearch(int arr[],int size, int key)
	{
		int left = 0;
		int right = size -1;
		int mid;
		int count = 0;
		
		while(left <= right)
		{
			count++;
			mid = (left+right)/2;
			if(key == arr[mid])
			{
				System.out.println("Comparisons: "+count);
				return mid;
			}
			else if(key < arr[mid])
			{
				right = mid -1;
			}
			else
			{
				left = mid +1;
			}
		}
		
		System.out.println("Comparisons: "+count);
		return -1;

			
	}

	public static void main(String[] args)
	{
		int arr[] = {11,22,33,44,55,66};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to be searched :");
		int key = sc.nextInt();
		
		int index = binarySearch(arr, arr.length, key);
		if(index != -1)
			System.out.println("Key is found at index " + index);
		else
			System.out.println("Key is not found");
		

	}

}
