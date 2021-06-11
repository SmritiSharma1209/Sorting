package Sorting;
import java.util.Scanner;

public class Quick_select {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		    int n = s.nextInt();
		    int[] arr = new int[n];
		    for (int i = 0; i < n; i++) {
		      arr[i] = s.nextInt();
		    }
		    int k = s.nextInt();
		    System.out.println(quickSelect(arr,0,arr.length - 1,k - 1));
		  }

	 
	public static void swap(int arr[], int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static int partition(int arr[], int pivot, int lo, int hi) {
		
		
		int i=lo;
		int j=lo;
		
		while(i<=hi) {
			if(arr[i]>pivot) {
				i++;
			}else {
				swap(arr,i,j);
				j++;
				i++;
			}
		}
		return (j-1);                      //if value <= pivot region is 0-(j-1) so all the values less than or equal to pivot you be last at j-1
		
	}
	
	

	  public static int quickSelect(int[] arr, int lo, int hi, int k) {  //last element ko pivot mann kar partition kara.pivot ki position nikali aur hamre k ko usse compare kara
	                                                                     // agar k chota hai toh woh pivot ke left side lie karega otherwise right side lie karega
		  int pivot=arr[hi];
		  int pivotPos=partition(arr, pivot, lo, hi);
		  if(k>pivotPos) {
			  return quickSelect(arr, pivotPos+1, hi, k);
			  
		  }else if(k<pivotPos) {
			  return quickSelect(arr, lo, pivotPos-1, k);
		  }else {
			  return arr[pivotPos];
		  }
		  
	  }

	
	public static void print(int[] arr) {
		    for (int i = 0; i < arr.length; i++) {
		      System.out.print(arr[i] + " ");
		    }
		    System.out.println();
		  }

}
