package com.sunbeam;

import java.util.Arrays;
import java.util.Iterator;

public class DescInsertionSort {
	public static void descInsertionSort(int arr[], int N) {
		int count = 0;
		for (int i = 1; i < N; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] < temp) {
				count++;
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		System.out.println("Comparisions done " + count);
	}

	public static void main(String[] args) {
		int arr[] = { 55, 44, 22, 66, 11, 33 };

		System.out.println("Array before sort: " + Arrays.toString(arr));
		descInsertionSort(arr, arr.length);
		System.out.println("Array after sort: " + Arrays.toString(arr));

	}

}
