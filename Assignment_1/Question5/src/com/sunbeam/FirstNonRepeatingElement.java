package com.sunbeam;

public class FirstNonRepeatingElement {
	
	public static void findFirstNonRepeatingElement(int arr[]) {
//        
	
		for (int i=0;i<arr.length;i++) {
			int count =0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
				count++;
				break;
				}
			}
			if(count==0) {
				System.out.println("The first non-repeating element is: " + arr[i]);
			}
			
		}
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
        findFirstNonRepeatingElement(arr);

        

	}

}
