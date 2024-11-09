package assignment3;

import java.util.Scanner;

public class MoveZeroAtEndOFArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter how many elements in array:");
	    int n=sc.nextInt();
	    int []arr=new int[n];
	    int count=0;
	    for (int i = 0; i < arr.length; i++) {
		     arr[i]=sc.nextInt();
	     }
	    for (int i = 0; i < arr.length; i++) {
	  
		      if(arr[i]!=0) {
			    arr[count++]=arr[i];
		      }
	     }
	    while(count<arr.length) {
	    	arr[count++]=0;
	    }
	    
	    for (int i = 0; i < arr.length; i++) {
		     System.out.println(arr[i]);
	     }
    }
}
