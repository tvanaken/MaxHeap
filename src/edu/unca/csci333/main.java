package edu.unca.csci333;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {

		int[] arr1 = {6,3,9,2,6,7,2,6,5,3,10};
		int[] arr2 = {45,67,12,3,56,99,10};
		int[] arr3 = {1,4,3,7,5,8,1,5,3,99,24,35,77};
		int[] arr4 = {12,15,43,12,12,12,34,77,8,1,0};
		int[] arr5 = {1,5,3,4,4,2,1,7,6,5,4};
		
		maxHeap heap1 = new maxHeap(arr1);
		maxHeap heap2 = new maxHeap(arr2);
		maxHeap heap3 = new maxHeap(arr3);
		maxHeap heap4 = new maxHeap(arr4);
		maxHeap heap5 = new maxHeap(arr5);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		
		heap1.printMaxHeap();
	}

}
