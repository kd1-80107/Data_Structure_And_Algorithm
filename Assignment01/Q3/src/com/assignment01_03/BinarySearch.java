//3. Implement binary search algorithm if array is sorted in descending order.

package com.assignment01_03;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int arr[],int size,int key)
	{
		int left = 0;
		int right = size-1;
		int mid;
		
		while(left<= right)
		{
			mid =(left+right)/2;
			if(key == arr[mid])
			{
				return mid;
			}
			else if(key<arr[mid])
			{
				left = mid+1;
			}
			else
			{
				right = mid -1;
			}
			
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int arr[] = {66,55,44,33,22,11};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a key for search : ");
		int key = sc.nextInt();
		
		int index = binarySearch(arr, arr.length, key);
		if(index != -1)
		{
			System.out.println("Key is found at index :" +index);
		}
		else
		{
			System.out.println("Key is not found");
		}

	}

}
