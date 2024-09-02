package java_practice;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int sum=0;
		float average=0;
		int[] arr=new int[5];	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements in array:");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
		     sum += arr[i];
		     average=sum/5;
		}
		System.out.println("sum of array:"+sum);
		System.out.println("average of array:"+average);
		System.out.println("reversed array:");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
	}
}
