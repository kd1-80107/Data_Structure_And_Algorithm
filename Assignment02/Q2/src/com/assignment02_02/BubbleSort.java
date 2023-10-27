/*
2. Write a bubble sort function to sort array and 
returns no of comparisions.
*/

package com.assignment02_02;

import java.util.Arrays;

public class BubbleSort 
{
	public static void bubbleSort(int arr[], int N)
	{
		int count = 0;
		for(int i = 1; i < N ; i++ )
		{
			for(int j = 0; j < N - i ; j++)
			{
				count++;
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Comparision : " +count);
	}
	public static void main(String[] args)
	{
		int arr[] = {33,22,66,55,44,11};
		System.out.println("Array before sort : "+Arrays.toString(arr));
		bubbleSort(arr, arr.length);
		System.out.println("Array after sort : "+Arrays.toString(arr));
		

	}

}
