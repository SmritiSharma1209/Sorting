package Sorting;

import java.util.Scanner;

public class Insertion_sort {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		    int n = s.nextInt();
		    int[] arr = new int[n];
		    for (int i = 0; i < n; i++) {
		      arr[i] = s.nextInt();
		    }
		    insertionSort(arr);
		    print(arr);

	}
	
	
	public static boolean Isgreater(int arr[], int i, int j) {
		System.out.println("Comparing " + arr[i] + " and " + arr[j]);
		if(arr[i]>arr[j]) {
			return true;
			
		}else {
			return false;
		}
	}
	
	
	public static void swap(int arr[], int i, int j ) {
		System.out.println("Swapping " + arr[i] + " and " + arr[j]);
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	
	public static void insertionSort(int arr[]) {               //Reverse bubbling
		
		for(int i=1;i<arr.length;++i) {      
			for(int j=i-1;j>=0;--j) {                         //agar j pr jo element h woh j+1 se badha hai to swap kar do;
				if(Isgreater(arr,j,j+1)) {
					swap(arr, j, j+1);
					
				}else{
					break;
				}
			}
		}
	}
	
	
	
	
	
	public static void print(int arr[]) {
		 for (int i = 0; i < arr.length; i++) {
		      System.out.println(arr[i]);
		    }
	}


}
