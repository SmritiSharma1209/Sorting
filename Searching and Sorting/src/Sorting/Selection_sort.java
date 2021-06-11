package Sorting;

import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
		 
		// n elements ke liye (n-1) iterations.
		
		 Scanner s = new Scanner(System.in);
		    int n = s.nextInt();
		    int[] arr = new int[n];
		    for (int i = 0; i < n; i++) {
		      arr[i] = s.nextInt();
		    }
		    selectionSort(arr);
		    print(arr);

	}
	
	
	public static void Swap(int arr[], int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	}
	
	
	public static boolean isSmaller(int arr[] ,int i, int j) {
		System.out.println("Comparing " + arr[i] + " and " + arr[j]);
		if(arr[i]<arr[j]) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void  selectionSort(int arr[]) {
		for(int itr=0; itr<arr.length-1; ++itr) {
			int min=itr;
			
			for(int j=itr+1; j<arr.length;++j) {                     // agar j position wala element min se chota hai, toh min ke andar j wala element dal do
				if(isSmaller(arr,j,min )==true) {
					min=j;
					
				}
			}
			
			Swap(arr,itr, min);                                     //last mai uss particular position se swap kar do.
			
		}
		
	}
	
	
	
	public static void print(int arr[]) {
		 for (int i = 0; i < arr.length; i++) {
		      System.out.println(arr[i]);
		    }
	}

}
