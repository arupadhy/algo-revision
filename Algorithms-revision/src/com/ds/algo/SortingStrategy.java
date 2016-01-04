package com.ds.algo;

public interface SortingStrategy<T extends Comparable<T>> {
	
	public void sort(T[]input);
	
	public void sort(int[] input);

}
