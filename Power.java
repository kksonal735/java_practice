package java_practice;
import java.util.*;
public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number 1");
		int num1=sc.nextInt();
		System.out.println("enter the number 2");
		int num2=sc.nextInt();
		System.out.println("power of given number:"+ Math.pow(num1,num2));
	    sc.close();
	}

}
