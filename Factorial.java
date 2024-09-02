package java_practice;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
	  int n,fact=1,i;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter a number: ");
	  n=sc.nextInt();
	  for(i=1;i<=n;i++) {
		  fact *=i;
	  }
	  System.out.println("Factorial of no "+ n+" = "+fact);
	  sc.close();
	}

}
