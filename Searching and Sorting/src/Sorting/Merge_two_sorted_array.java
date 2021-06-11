package Sorting;
import java.util.Scanner;

public class Merge_two_sorted_array {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		    int n = s.nextInt();
		    int[] a = new int[n];
		    for(int i = 0 ; i < n; i++){
		      a[i] = s.nextInt();
		    }
		    int m = s.nextInt();
		    int[] b = new int[m];
		    for(int i = 0 ; i < m; i++){
		      b[i] = s.nextInt();
		    }
		    int[] mergedArray = mergeTwoSortedArrays(a,b);
		    print(mergedArray);
		  }

	public static int[] mergeTwoSortedArrays(int[] a, int[] b){
	   int res[]= new int[a.length+b.length];
	   int i=0;
	   int j=0;
	   int k=0;
	   
	   while(i<a.length && j<b.length) {           //jo bhi  element chota h woh dal do.
		   if(a[i]<b[j]) {
			   res[k]=a[i];
			   i++;
			   k++;
			   
		   }else {
			   res[k]=b[j];
			   j++;
			   k++;
		   }
	   }
	   while(i<a.length) {
		   res[k]=a[i];
		   i++;
		   k++;
	   }
	   while(j<b.length) {
		   res[k]=b[j];
		   j++;
		   k++;
	   }
	   return res;
	  }

	  public static void print(int[] arr){
	    for(int i = 0 ; i < arr.length; i++){
	      System.out.println(arr[i]);
	    }
	  }

}
