package com.zensar.core;

public class SortingImpl {
	public Integer[] bubbleSort(Integer data[]){
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length-1; j++) {
				
				if(data[j]>data[j+1]){
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		
		return data;
	}
	
	public Integer[] insertionSort(Integer[] data){
		
		for (int i = 0; i < data.length; i++) {
			   int j = i;
			   while (j > 0 && data[i] < data[j - 1])
			      j--;
			   int tmp = data[i];
			   for (int k = i; k > j; k--)
			      data[k] = data[k - 1];
			   data[j] = tmp;
			}
		
		return data;
	}
	
	public Integer[] mergeSort(){
		
		
		return null;
	}
	
	public static void main(String[] args) {
		SortingImpl impl = new SortingImpl();
		long start  =System.currentTimeMillis();
		Integer sortedArray[] =  impl.bubbleSort(new Integer[] {12,3,21,4,5,1,45,2,76});
		long end = System.currentTimeMillis();
		System.out.println("Buble Sort Time="+(end-start));
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
		
		System.out.println("************INSERTION SORTING**********************");
		start  =System.currentTimeMillis();
		sortedArray =  impl.insertionSort(new Integer[] {12,3,21,4,5,1,45,2,76});
		end = System.currentTimeMillis();
		System.out.println("Insertion Sort Time="+(end-start));
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
		
		
	}
}


