package com.sunbeam;

public class RankOfNumber {
	public static int rankingOfNumber(int arr[], int key) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (key >= arr[i])
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		int key = 4;
		int ranking = rankingOfNumber(arr, key);
		System.out.println("Ranking of the key(" + key + ") is : " + ranking);
	}
}