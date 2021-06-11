package Sorting;
import java.util.Scanner;

public class Merge_sort {
	public static void main(String[] args) {
		
		  Scanner s = new Scanner(System.in);
		    int n = s.nextInt();                           //recusion use kari.. faith rakha ki array ko mid se break karke jo do array milenge hai woh sort hokar aayenge.
		    int[] arr = new int[n];                         // aab jab dono array sorted hai hamare pass toh dono ko haam merge kar skte hai.
		    for (int i = 0; i < n; i++) {
		      arr[i] = s.nextInt();
		    }
		    
		    int sortArr[]= merge_sort(arr, 0, arr.length-1);
		    System.out.println("Sorted Array is:");
		    print(sortArr);
		
	}
	
	
	
	public static int[] mergeTwoSortedArray(int a[], int b[]) {
		int result[]=new int[a.length+b.length];
		int k=0;
		int i=0;
		int j=0;
		
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				result[k]=a[i];
				k++;
				i++;
			}
			else {
				result[k]=b[j];
				k++;
				j++;
			}
		}
		while(i<a.length) {
			result[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length) {
			result[k]=b[j];
			j++;
			k++;
		}
		return result;
		
		
		
	}
	
     public static int[] merge_sort(int arr[], int low ,int high) {
    	 
    	 if(low==high) {
    		 int barr[]= new int[low];
    		 barr[0]=arr[low];
    		 return barr;
    		
    	 }
    	 
    	 int mid=(low+high)/2;
    	 int fsh[]=merge_sort(arr, low, mid);
    	 int ssh[]=merge_sort(arr, mid+1, high);
    	 
    	 int mergedArr[]=mergeTwoSortedArray(fsh,ssh);
    	 return mergedArr;
    	 
    	 
   }
	
	public static void print(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	  }

}
