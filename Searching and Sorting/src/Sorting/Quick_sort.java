package Sorting;

import java.util.Scanner;

public class Quick_sort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	      arr[i] = s.nextInt();
	    }
	    quickSort(arr,0, arr.length-1);
	    print(arr);

	}
	
	 public static void quickSort(int[] arr, int lo, int hi) {
		 if(lo>hi) {
			 return;
		 }
		 
		 int pivot=arr[hi];                               //last element ko pivot banao ---> use pivot se chote ek side ho jayenge , pivot se badhe ek side ho jayenge .
		 partition(arr, pivot, lo, hi);                   // fir pivot se pehle ke array ko recusively sort kar do aur pivot ke baad wale arrau ko bi recusively sort kar do.
		 int pivotPos=0;
		 for(int i=0;i<arr.length;++i) {
			 if(arr[i]==pivot) {
				 pivotPos=i;
				 break;
			 }
		 }
		 quickSort(arr,lo,pivotPos-1);
		 quickSort(arr,pivotPos+1, hi);
		 
		    
		    
	}
	 
	 
	 public static void partition(int arr[], int pivot, int lo, int hi) {
		 
		 int i=lo;
		 int j=lo;
		 
		 while(i<=hi) {
			 if(arr[i]>pivot) {
				 i++;
			 }else {
				 swap(arr,i,j);
				 i++;
				 j++;
					
			}
		 }
	 }
	 
	 public static void swap(int arr[], int i, int j) {
		 int temp=arr[i];
		 arr[i]=arr[j];
		 arr[j]=temp;
	 }
	
	
	public static void print(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	  }

}
