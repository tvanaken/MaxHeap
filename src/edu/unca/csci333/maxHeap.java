package edu.unca.csci333;

import java.util.Arrays;

public class maxHeap {

	private int[] arr;
	private int heapSize;
	
	public maxHeap(int[] arr) {
		
		super();
		this.arr = arr;
		heapSize = arr.length - 1;
		buildMaxHeap();
	}
	
	private int leftChildOf(int index) {
		
		int child = (index*2) + 1;
		
		if (child > heapSize) {
			
			return -1;
		}
		
		return child;
	}
	
	private int rightChildOf(int index) {
		
		int child = (index*2) + 2;
		
		if (child > heapSize) {
			
			return -1;
		}
		
		return child;
	}
	
	public void printMaxHeap() {
	
		System.out.println("Heapsize: " + heapSize);
		System.out.println(Arrays.toString(arr));
	}
	
	public void maxHeapify(int index) {
		
		int left = leftChildOf(index);
		int right = rightChildOf(index);
		int largest = index;
		
		while(true) {
		
			if (left == -1) {
				break;
			}
			if (right == -1) {
				break;
			}
			if (left <= heapSize && arr[left] > arr[index] && left != -1) {
				
				largest = left;
			}
			if (right <= heapSize && arr[right] > arr[index] && right != -1) {
				
				largest = right;
			}
			if (largest != index) {
				
				int temp = arr[index];
				arr[index] = arr[largest];
				arr[largest] = temp;
				maxHeapify(largest);
			}
		}
	}
	
	private void buildMaxHeap() {
		
		for (int i = heapSize/2; i >= 1; i--) {
			maxHeapify(i);
		}
	}
	
	public void heapSort() {
	
			buildMaxHeap();
			int copySize = heapSize;
			
			for (int i = heapSize; i > 1; i--) {
				
				int temp = arr[0];
				arr[0] = arr[i];
				arr[i] = temp;
				heapSize--;
				maxHeapify(0);
			}
			
			heapSize = copySize;
	}
}