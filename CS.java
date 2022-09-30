package com.Question9;

import java.util.Arrays;

public class CS {

	public static void main(String[] args) {
		
		int[] arr = {4,0,2,1,6,3};
		
		int n = arr.length;
		
		cs(arr,n);
	}

	private static void cs(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		int i=0;
		
		while(i<n)
		{
			int correct = arr[i];
			if(arr[i] != arr[correct])
			{
				swap(arr, i, correct);
			}
			else
			{
				i++;
			}
		}
//		System.out.println(Arrays.toString(arr));
		
		for(int j=0; j<n; j++)
		{
			if(arr[j] !=j )
			{
				System.out.println(arr[j]);
				break;
			}
		}
		
	}

	private static void swap(int[] arr, int i, int correct) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[correct];
		arr[correct] = temp;
		
	}
}
