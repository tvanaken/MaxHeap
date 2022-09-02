package edu.unca.csci333;

import java.util.Arrays;

//Taylor Van Aken
//8/26/2022
//Homework 1

/**
 * Class to create and manipulate a binary max heap using an array
 * @author Taylor Van Aken
 */
public class maxHeap {

	private int[] arr;
	private int heapSize;
	
	/**
	 * Constructor used to build the binary max heap
	 * @param arr the integer array used to build the heap with.
	 */
	public maxHeap(int[] arr) {
		
		super();
		this.arr = arr;
		heapSize = arr.length;
		buildMaxHeap();
	}
	
	/**
	 * Returns index of left child of certain heap index
	 * @param index index of the array
	 * @return index of left child of param
	 */
	private int leftChildOf(int index) {
		
		int child = (index*2) + 1;
		
		if (child > heapSize) {
			
			return -1;
		}
		
		return child;
	}
	
	/**
	 * Returns index of right child of certain heap index
	 * @param index index of the array
	 * @return index of right child of param
	 */
	private int rightChildOf(int index) {
		
		int child = (index*2) + 2;
		
		if (child > heapSize) {
			
			return -1;
		}
		
		return child;
	}
	
	/**
	 * Prints the heap as an array
	 */
	public void printMaxHeap() {
	
		System.out.println("Heapsize: " + heapSize);
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * Restores max heap property of index's subtree
	 * @param index of array subtree wanting to apply max heap property to
	 */
	public void maxHeapify(int index) {
		
		int left = leftChildOf(index);
		int right = rightChildOf(index);
		int largest = index;
		
		try {
			if (left < 0 || left >= heapSize) {
				
			} else if (left <= heapSize && arr[left] > arr[index] && left != -1) {
				
				largest = left;
			}
			if (right < 0 || right >= heapSize) {
				
			} else if (right <= heapSize && arr[right] > arr[index] && arr[right] > arr[left]) {
				
				largest = right;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			
		}
		
		if (largest != index) {
			
			int temp = arr[index];
			arr[index] = arr[largest];
			arr[largest] = temp;
			maxHeapify(largest);
		}
	}
	
	/**
	 * Builds array into a max heap tree from bottom up
	 */
	private void buildMaxHeap() {
		
		for (int i = heapSize/2; i >= 0; i--) {
			maxHeapify(i);
		}
	}
	
	/**
	 * Sorts array from largest to smallest by continuously removing the root
	 */
	public void heapSort() {
	
			buildMaxHeap();
			int copySize = heapSize;
			
			for (int i = heapSize - 1; i > 0; i--) {
				
				int temp = arr[0];
				arr[0] = arr[i];
				arr[i] = temp;
				heapSize--;
				maxHeapify(0);
			}
			
			heapSize = copySize;
	}
}
