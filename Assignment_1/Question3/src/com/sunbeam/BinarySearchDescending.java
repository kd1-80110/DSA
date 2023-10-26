package com.sunbeam;

import java.util.Scanner;

public class BinarySearchDescending {
	public static int binary_search_descending(int arr[], int key) {
		int left = 0, right = arr.length - 1, mid;

		while (left <= right) {
			mid = (left + right) / 2;

			if (key == arr[mid]) {
				return mid;
			} else if (key > arr[mid])//search in descending order
				right = mid - 1;
			else
				left = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 99, 88, 77, 66, 55, 44, 33, 22, 11 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key to be searched: ");
		int key = sc.nextInt();

		int index = binary_search_descending(arr, key);
		if (index != -1)
			System.out.println("Key ids found at index " + index);
		else
			System.out.println("Key is not found");

	}

}
