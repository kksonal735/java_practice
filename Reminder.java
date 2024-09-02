package java_practice;

import java.util.Scanner;

public class Reminder {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for num1: ");
		num1=sc.nextInt();
		System.out.println("enter value for num2: ");
		num2=sc.nextInt();
		int reminder=num1-(num1/num2)*num2;
		System.out.println("reminder of "+ num1+"/"+num2+"is:  "+reminder);
	}

}
