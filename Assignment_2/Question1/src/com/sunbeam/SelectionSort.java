package com.sunbeam;

import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionSort(int arr[],int N) {
		int count=0;
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				count++;
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					System.out.println("Comparisons done "+count);
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {44,11,55,22,66,33};
		
		System.out.println("Array Before Sort : "+ Arrays.toString(arr));
		selectionSort(arr, arr.length);
		System.out.println("Arrays After Sort : "+ Arrays.toString(arr));

	}

}
