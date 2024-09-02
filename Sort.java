package java_practice;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		int[] arr=new int[5];	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements in array:");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("array in ascending order:");
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
	    	}
		}
	  }
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
	}

}
