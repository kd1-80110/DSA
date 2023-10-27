package com.sunbeam;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int arr[], int N) {
		int count = 0;
		int passes = 0;
		int flag;

		for (int i = 1; i < N; i++) {
			passes++;
			flag = 0;
			for (int j = 0; j < N - i; j++) {
				count++;
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
					System.out.println("No of comparisions " + count);
					System.out.println("No of passes " + passes);

				}
			}
			if (flag == 0)
				break;

		}
		

	}

	public static void main(String[] args) {
		int arr[] = { 33, 22, 66, 55, 44, 11 };
		System.out.println("Arrays before sort " + Arrays.toString(arr));
		bubbleSort(arr, arr.length);
		System.out.println("Arrays after sort " + Arrays.toString(arr));
	}

}
