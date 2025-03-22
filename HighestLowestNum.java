package com.string;
//Write a java program to find the maximum and minimum number
public class HighestLowestNum {
	public static int findHighest(int []arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}		}
		return max;
		
	}
	public static int findLowest(int arr[]) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {10,45,56,456,7};
		System.out.println("Maximum Number is :"+findHighest(num));
		System.out.println("Minimum Number is :"+findLowest(num));
	}

}
