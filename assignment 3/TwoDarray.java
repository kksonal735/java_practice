package assignment3;

import java.util.Scanner;

public class TwoDarray {

	public static void main(String[] args) {
		int [][] arr=new int[3][3];
		int search,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements in array:");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter no to search in 2D array:");
		search=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++) {
				if(search==arr[i][j]) {
					flag=1;
				}
				else {
					flag=0;
				}
			}
		}
		if(flag==1) {
			System.out.println("no is found");
		}
		else {
			System.out.println("no is not found...");
		}
	 }	
}