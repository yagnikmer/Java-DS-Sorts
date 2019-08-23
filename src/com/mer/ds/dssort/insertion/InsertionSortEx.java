package com.mer.ds.dssort.insertion;

public class InsertionSortEx {
	public static void main(String[] args) {
		int[] list = { 52, 36, 50, 25, 32 };
		int n = list.length;

		for (int i = 0; i < n; i++) {
			System.out.print(list[i] + "  ");
		}
		System.out.println("\nInsertion Sort");

		for (int outer = 1; outer < n; outer++) {
			int key = list[outer];
			int inner;
			for (inner = outer - 1; (inner > -1) && list[inner] > key; inner--) {
				list[inner + 1] = list[inner];
			}
			list[inner + 1] = key;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(list[i] + "  ");
		}
	}
}

// understanding purpose
// 52 36 50 25 32
// Insertion Sort
// i : 0 Key : 36 updated:(36,52)
// 52 52 50 25 32
// Last j:1 inner : -1 key : 36
//
// i : 1 Key : 50 updated:(50,52)
// 36 52 52 25 32
// Last j:2 inner : 0 key : 50
//
// i : 2 Key : 25 updated:(25,52)
// 36 50 52 52 32
// i : 1 Key : 25 updated:(52,50)
// 36 50 50 52 32
// i : 0 Key : 25 updated:(50,36)
// 36 36 50 52 32
// Last j:3 inner : -1 key : 25
//
// i : 3 Key : 32 updated:(32,52)
// 25 36 50 52 52
// i : 2 Key : 32 updated:(52,50)
// 25 36 50 50 52
// i : 1 Key : 32 updated:(50,36)
// 25 36 36 50 52
// Last j:4 inner : 0 key : 32
//
// 25 32 36 50 52 