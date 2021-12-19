package com.great.learning.lab.session.question2.service;

public class InsertionSortDescending {
	public static int[] insertionSortDescending(int[] arr) {
		int i, j, element;
		int size = arr.length;
		for(i = size - 2; i >= 0 ; --i) {
			element = arr[i];
			for(j = i + 1; j <= size - 1 && (element < arr[j]); ++j) {
				arr[j-1] = arr[j];
			}
			arr[j-1] = element;
		}
		return arr;
	}
}
