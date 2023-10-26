package com.sunbeam;

import java.util.Scanner;

public class BinarySearch {
	public static int binary_search(int arr[], int key) {
		int left = 0, right = arr.length - 1, mid;
		int count=0;

		while (left <= right) {
			count++;
			mid = (left + right) / 2;

			if (key == arr[mid]) {
				System.out.println("Comparisons done "+count);
				return mid;
			} else if (key < arr[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}
		System.out.println("Comparisons done "+count);
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key to be searched: ");
		int key = sc.nextInt();

		int index = binary_search(arr, key);
		if (index != -1)
			System.out.println("Key ids found at index " + index);
		else
			System.out.println("Key is not found");

	}

}
