/*
4. Implement linear search algorithm to find the nth occurence
of the given element. If nth occurrence is not found, return -1.
*/

package com.assignment01_03;

import java.util.Scanner;

public class LinearSearch 
{
	public static int linearSearch(int arr[], int size, int key,int n)
	{
		int count =0;
		for(int i = 0; i<size; i++)
		{
			if(arr[i] == key)
			{
				count++;
				if(count == n)//found the nth occur.
				{			  //return its index.
				return i;
				}
			}
		}
		return -1; //nth occurrence not found
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,35,98,10,84,10,9,63,10};
		
		System.out.println("Enter a key to find :");
		int key = sc.nextInt();
		
		System.out.println("Enter nth occurence :");
		int n = sc.nextInt();
		
		int result = linearSearch(arr, arr.length, key, n);
		if(result != -1)
		{
			System.out.println("The index of the " + n + "th occurrence of " + key + " is: " + result);
		}
		else
		{
			System.out.println("The index of the " + n + "th occurrence of " + key + " is not found in array");
		}	
	}

}
