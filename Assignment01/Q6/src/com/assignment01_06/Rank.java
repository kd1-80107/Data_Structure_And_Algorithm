/*
6. to find rank of an element in a stream of integers.
rank: rank of a given integer "x", in stream is "total no. of ele's less than or equal to x (including x).
	
	Input: { 10, 20, 15, 3, 4, 4, 1 }
	Ouput: Rank of 4 is: 4
*/

package com.assignment01_06;

import java.util.Arrays;
import java.util.Scanner;

public class Rank 
{
	public static int findRank(int []arr, int x)
	{
		//sorting array for Binary search
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length-1;
		
		while(left <= right)
		{
			int mid = (left + right)/2;
			
			if(arr[mid] <= x)
			{
			//if middle element is <= x
			//search in right partition.
			
			left = mid + 1;
			
			}
			else
			{
			 //if middle element is <= x
			 //search in right partition.
				
				right = mid -1;
			}
		}
		
		return left;
	//rank of x is index where it should be inserted.	
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int [] arr = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Enter a value : ");
		int x = sc.nextInt();
		int rank = findRank(arr, x);
		
		System.out.println("Rank of "+ x + " is : "+rank);

	}

}
