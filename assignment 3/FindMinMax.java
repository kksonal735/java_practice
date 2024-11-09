package assignment3;
import java.util.*;
public class FindMinMax {
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter how many elements in array:");
	    int n=sc.nextInt();
	    int []arr=new int[n];
	    int max=arr[0];
	    System.out.println("enter the elements in an array: ");
	    for(int i=0;i<n;i++){
	    	arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	    	if(max<arr[i]) {
	    		max=arr[i];
	    	} 
	    }
	    int min=arr[0];
	    for(int i=0;i<n;i++){
	    	if(min>arr[i]){
	    		min=arr[i];
	    	}
	    }
	    System.out.println("max: "+max+ " min: "+min);
	}
}
