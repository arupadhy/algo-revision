package com.ds.algo;

public class SelectionSortStrategy<T extends Comparable<T>> implements SortingStrategy<T> {

	@Override
	public void sort(T[] input) {
		for(int i=0;i<input.length-1;i++) {
			int keyIndex = i;
			int j;
			for(j=i+1;j<input.length;j++) {

				if(input[j].compareTo(input[keyIndex]) < 0){
					keyIndex = j;
				}
			}
			swap(input,keyIndex,j);
		}

	}

	private void swap(T[] input, int keyIndex,int i) {
		T temp = input[keyIndex];
		input[keyIndex]=input[i];
		input[i] = temp;
	}
	
	private void swap(int[] input, int keyIndex,int i) {
		int temp = input[keyIndex];
		input[keyIndex]=input[i];
		input[i] = temp;
	}

	@Override
	public void sort(int[] input) {
		for(int i=0;i<input.length-1;i++) {
				int keyIndex = i;
				int j = i+1;
			while(j<input.length) {
				if(input[j]<input[keyIndex]) {
					keyIndex = j;
				}
				j++;
			}
			swap(input,keyIndex,i);
		}
	}
}



