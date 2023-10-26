package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {

	public static int linear_Search(int arr[], int key) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
			if (arr[i] == key) {
				System.out.println("Comparisions done: " + count);
				return i;
			}
		}
		System.out.println("Comparisons done: " + count);
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 30, 50, 10, 90, 20, 70, 60, 100 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to be searched : ");
		int key = sc.nextInt();

		int index = linear_Search(arr, key);
		if (index != -1) {
			System.out.println("Key is found at index : " + index);
		} else {
			System.out.println("Key is not found");
		}
//		sc.close();

	}

}
