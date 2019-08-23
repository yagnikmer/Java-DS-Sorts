package com.mer.ds.dssort.selection;

public class SelectionSortEx {
	public static void main(String[] args) {
		int[] list = { 52, 36, 50, 25, 32 };
		int n = list.length;

		for (int i = 0; i < n; i++) {
			System.out.print(list[i] + "  ");
		}
		System.out.println("\n Selection Sort");

		for (int outer =0; outer < n - 1; outer++) {
			int minIndex = outer;
			// search index of minimum value from array

			for (int inner = outer + 1; inner < n; inner++) {
				if (list[inner] < list[minIndex]) {
					minIndex = inner;
				}
			}
			// swap current value with minimum value from array
			int minValueOfArray = list[minIndex];
			list[minIndex] = list[outer];
			list[outer] = minValueOfArray;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(list[i] + "  ");
		}
	}
}



// for understanding
//52  36  50  25  32  
//Selection Sort
//Test : 25  36  50  52  32  
//Test : 25  32  50  52  36  
//Test : 25  32  36  52  50  
//Test : 25  32  36  50  52  
//25  32  36  50  52  