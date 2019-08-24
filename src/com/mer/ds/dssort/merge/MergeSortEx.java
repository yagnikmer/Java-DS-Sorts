package com.mer.ds.dssort.merge;

public class MergeSortEx {
	public static void main(String[] args) {
		int[] list = { 52, 36, 50, 25, 32 };
		int n = list.length;

		for (int i = 0; i < n; i++) {
			System.out.print(list[i] + "  ");
		}
		System.out.println("\nMerge Sort");
		list = mergeSort(list);
		for (int i = 0; i < n; i++) {
			System.out.print(list[i] + "  ");
		}
	}

	public static int[] mergeSort(int[] list) {
		int middleIndex = 0;
		int[] newList = null, leftList = null, rightList = null;

		if (list.length <= 1)
			return list;

		// Initialize all arrays
		newList = new int[list.length];
		middleIndex = list.length / 2;
		leftList = new int[middleIndex];
		if (list.length % 2 == 0)
			rightList = new int[middleIndex];
		else
			rightList = new int[middleIndex + 1];

		// divide list items in to two arrays
		for (int i = 0; i < leftList.length; i++)
			leftList[i] = list[i];
		for (int i = 0; i < rightList.length; i++)
			rightList[i] = list[middleIndex + i];

		// do recursive process until list becomes single item
		leftList = mergeSort(leftList);
		rightList = mergeSort(rightList);

		// do recursive merge list
		newList = merge(leftList, rightList);
		return newList;
	}

	public static int[] merge(int[] leftList, int[] rightList) {

		int newListLength = leftList.length + rightList.length;
		int newListIndex = 0, leftIndex = 0, rightIndex = 0;
		int[] newList = new int[newListLength];

		// search smallest item from both the list add in to new list
		for (int i = 0; i < newListLength; i++) {
			if (leftIndex < leftList.length && rightIndex < rightList.length) {
				if (leftList[leftIndex] < rightList[rightIndex]) {
					newList[newListIndex] = leftList[leftIndex];
					newListIndex++;
					leftIndex++;
				} else {
					newList[newListIndex] = rightList[rightIndex];
					newListIndex++;
					rightIndex++;
				}
			} else if (leftIndex < leftList.length) {
				newList[newListIndex] = leftList[leftIndex];
				newListIndex++;
				leftIndex++;
			} else if (rightIndex < rightList.length) {
				newList[newListIndex] = rightList[rightIndex];
				newListIndex++;
				rightIndex++;
			}
		}
		return newList;
	}
}
