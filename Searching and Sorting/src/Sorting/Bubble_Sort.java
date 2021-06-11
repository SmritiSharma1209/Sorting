package Sorting;
import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		
		
		//Bubble Sort mai element apne pichle wale se compare hota h  n elements ke liye (n-1) iterations hongi.
		
		 Scanner s = new Scanner(System.in);
		    int n = s.nextInt();
		    int[] arr = new int[n];
		    for (int i = 0; i < n; i++) {
		      arr[i] = s.nextInt();
		    }
		    bubbleSort(arr);
		    print(arr);
		  }
	
	
	public static void Swap(int arr[], int i, int j) {
		System.out.println("Swapping " + arr[i] + " and " + arr[j]);
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	
	public static boolean Issmaller(int arr[], int i, int j) {
		System.out.println("Comparing " + arr[i] + " and " + arr[j]);
		if(arr[i]<arr[j]) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	 public static void bubbleSort(int[] arr) {                         //bubble mai one after another compare karo agar j+1 pr jo element h woh j se chota hai toh swap kar do.
		 for(int itr=0; itr<arr.length-1;++itr) {                        // greatest element last mai aa jayega.
			 for(int j=0;j<arr.length-itr-1;++j) {
				 if(Issmaller(arr, j+1, j)) {
					 Swap(arr, j+1, j);
				 }
				 
			 }
			 
		 
		
	 }
	 }
	 public static void print(int[] arr) {
		    for (int i = 0; i < arr.length; i++) {
		      System.out.println(arr[i]);
		    }
		  }
		
		 
		


	

}

