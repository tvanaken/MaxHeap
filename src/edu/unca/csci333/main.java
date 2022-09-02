package edu.unca.csci333;

import java.util.Arrays;

//Taylor Van Aken
//8/26/2022
//Homework 1

/**
 * Main class for testing maxHeap properties
 * @author Taylor Van Aken
 */
public class main {

	public static void main(String[] args) {

		int[] arr1 = {6,3,9,2,6,4};
		int[] arr2 = {45,67,12,3,56,99,10};
		int[] arr3 = {1,4,3,7,5,8,1,5,3,99,24,35,77};
		int[] arr4 = {12,15,43,12,12,12,34,77,8,1,0};
		int[] arr5 = {1,5,3,4,4,2,1,7,6,5,4};
		
		System.out.println("Starting arrays:");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println();
		
		maxHeap heap1 = new maxHeap(arr1);
		maxHeap heap2 = new maxHeap(arr2);
		maxHeap heap3 = new maxHeap(arr3);
		maxHeap heap4 = new maxHeap(arr4);
		maxHeap heap5 = new maxHeap(arr5);

		System.out.println("After heap constructor call:");
		heap1.printMaxHeap();
		heap2.printMaxHeap();
		heap3.printMaxHeap();
		heap4.printMaxHeap();
		heap5.printMaxHeap();
		System.out.println();
		
		heap1.heapSort();
		heap2.heapSort();
		heap3.heapSort();
		heap4.heapSort();
		heap5.heapSort();
		
		System.out.println("After Heapsort:");
		heap1.printMaxHeap();
		heap2.printMaxHeap();
		heap3.printMaxHeap();
		heap4.printMaxHeap();
		heap5.printMaxHeap();
		System.out.println();
	}

}
