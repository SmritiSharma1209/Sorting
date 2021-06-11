package Sorting;

import java.util.Scanner;

public class Radix_sort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int[] arr = new int[n];
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    for (int i = 0; i < n; i++) {
	      arr[i] = s.nextInt();
	      max = Math.max(max, arr[i]);
	      min = Math.min(min, arr[i]);
	    }
	    radixSort(arr);
	    print(arr);

	}
	
	public static void radixSort(int[] arr) {               //POSITION WISE COUNT SORT..
	    int max=Integer.MIN_VALUE;                       //max value mai jitni digits hongi utni baar chalega count sort.
	    for(int i=0;i<arr.length;++i) {
	    	if(arr[i]>max) {
	    		max=arr[i];
	    	}
	    }
	    
	    int exp=1;
	    while(exp<=max) {
	    	countSort(arr,exp);
	    	exp=exp*10;
	    }
	    
	    
	    
	  }
	
	public static void countSort(int[] arr, int exp) {
	                        
		int farr[]= new int[10];
		
		for(int i=0;i<arr.length;++i) {                  // frequency array declared with frequency of each element
			int indx= (arr[i] /exp) %10;
			farr[indx]++;
		}
		
		for(int i=1;i<farr.length;++i) {                  // prefix array created by adding previous value to present value
			farr[i]=farr[i]+farr[i-1];
		}
		 
		int ans[]= new int[arr.length];                  //array peeche se chalaya aur usse piche se place karte rahe
		for(int i=arr.length-1;i>=0;i--) {
			int value=(arr[i]/exp)%10;
			int pos=farr[value];
			ans[pos-1]=value;
			farr[value]--;
		}
		
		for(int i=0;i<ans.length;++i) {
			arr[i]=ans[i];
		}
		   
		   
    }
	
	public static void print(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	      System.out.println(arr[i]);
	    }
	  }

}
