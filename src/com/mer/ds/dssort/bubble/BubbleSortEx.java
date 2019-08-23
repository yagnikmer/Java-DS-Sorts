package com.mer.ds.dssort.bubble;

public class BubbleSortEx {
	public static void main(String[] args) {
		int[] list = { 52, 36, 50, 25, 32 };
		int n = list.length - 1;

		for (int i = 0; i <= n; i++) {
			System.out.print(list[i] + "  ");
		}
		System.out.println("\nBubble Sort");

		for (int i = 0; i < n; i++) { // 0 to 3
			for (int j = 0; j < n - i; j++) { // 0 to 
				if (list[j] > list[j + 1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i <= n; i++) {
			System.out.print(list[i] + "  ");
		}
	}
}