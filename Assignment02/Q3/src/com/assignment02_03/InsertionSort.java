/*
3. Write a insertion sort function to sort array
and returns no of comparisions.
*/

package com.assignment02_03;

import java.util.Arrays;

public class InsertionSort
{
	static int count = 0;
	public static void insertionSort(int arr[],int N)
	{
		for(int i = 1; i<N ; i++)
		{
			int temp = arr[i];
			int j = i-1;
			
			while(j>= 0 && arr[j] > temp)
			{
				count++;
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = temp;
		}
		System.out.println("Comparission : "+count);
	}
	
	public static void main(String[] args)
	{
		int arr[] = {55,44,22,66,11,33};
		
		System.out.println("Array before sort : "+Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("Array after Sort :" +Arrays.toString(arr));

	}

}
