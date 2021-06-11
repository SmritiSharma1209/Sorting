package Sorting;
import java.util.Scanner;

public class Count_sort {
	
	//find max, min in array
	//define the range of frequency array
	//traverse through main array and count the frequency of each element and put it in the frequency array.. frequency of min element is at 0 position
	//create prefix array by i=i+(i-1) , this tells upto which  last position the element would be present
	//now create the ans array .
	// now traverse from the last element in the main array  and see the element find its frequency in the prefix array and place the element at (freq-1) in ans array and decrement the value in frequency array.

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
	    countSort(arr,min,max);
	    print(arr);
	  }

	public static void countSort(int[] arr, int min, int max) {
		int range=max-min+1;                         //range for frequency array
		int farr[]= new int[range];
		
		for(int i=0;i<arr.length;++i) {                  // frequency array declared with frequency of each element
			int indx=arr[i]-min;
			farr[indx]++;
		}
		
		for(int i=1;i<farr.length;++i) {                  // prefix array created by adding previous value to present value
			farr[i]=farr[i]+farr[i-1];
		}
		 
		int ans[]= new int[arr.length];                  //array peeche se chalaya aur usse piche se place karte rahe
		for(int i=arr.length-1;i>=0;i--) {
			int value=arr[i];
			int pos=farr[value-min];
			ans[pos-1]=value;
			farr[value-min]--;
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
