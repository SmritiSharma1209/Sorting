package Sorting;
import java.util.Scanner;

public class Partition_in_array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	      arr[i] = s.nextInt();
	    }
	    int pivot = s.nextInt();
	    partition(arr,pivot);
	    print(arr);

	}
	
	public static void swap(int arr[], int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	 public static void partition(int[] arr, int pivot){
		 
		 // 0- j-1 => <=pivot
		 // j- i-1 => >pivot
		 // i - end => unknown
		 
		 int i=0;
		 int j=0;
		 
		 
		 while(i<arr.length) {
		 if(arr[i]>pivot) {
			 i++;
		 }else {
			 swap(arr, i,j);
			 i++;
			 j++;
		 }


		 }	    
		  
	 }
	 
	 
	
	 public static void print(int[] arr) {
		    for (int i = 0; i < arr.length; i++) {
		      System.out.print(arr[i] + " ");
		    }
		    System.out.println();
		  }

}
