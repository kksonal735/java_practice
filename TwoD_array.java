package java_practice;
import java.util.Scanner;
public class TwoD_array {
  public static void main(String arg[]) {
	  int[][] arr1=new int[2][2];
	  int[][] arr2=new int[2][2];
	  int[][] arrSum=new int[2][2];
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the no in first matrix:");
	  for(int i=0;i<arr1.length;i++) {
		  for(int j=0;j<arr1.length;j++) {
			  arr1[i][j]=sc.nextInt();
		  }
	  }
	  System.out.println("enter the no in second matrix:");
	  for(int i=0;i<arr1.length;i++) {
		  for(int j=0;j<arr2.length;j++) {
			  arr2[i][j]=sc.nextInt();
		  }
	  }
	  System.out.println("sum of matrix:");
	  for(int i=0;i<arr1.length;i++) {
		  for(int j=0;j<arr1.length;j++) {
			  arrSum[i][j]=arr1[i][j]+ arr2[i][j];
		  }
	  }
	  for(int i=0;i<arr1.length;i++) {
		  for(int j=0;j<arr1.length;j++) {
			  System.out.print("  "+arrSum[i][j]);
		  }
		  System.out.println(" ");
	  }
  }
}
