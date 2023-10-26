/*
5. find the first non-repeating element:
	Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 }
	Ouput: 3
*/


package com.assignment01_05;

public class NonReapeatingEle 
{
	public static int FindFirstNonRepeatingEle(int[]arr)
	{
		for(int i = 0; i< arr.length; i++ )
		{
			for(int j = 0; j<arr.length; j++)
			{
				if(i != j && arr[i] == arr[j])
				{
					//arr[i] is repeating and moving to the next element.
					break;
				}
				if(j == arr.length)
				{
					return arr[i]; //arr[i] is non-repeating.
				}
			}	
		}
		
		return -1; //No non-repeating element found.
		
	}
	public static void main(String[] args) 
	{
		int arr [] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		
		int result = FindFirstNonRepeatingEle(arr);
		if(result != -1)
		{
			System.out.println("The first non-Reapiting element is : "+result);
		}
		else
		{
			System.out.println("No-Non repeating element element found");
		}
		
	}

}
