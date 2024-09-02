package java_practice;
import java.util.*;
public class Circumference {

	public static void main(String[] args) {
		 int r;
		 final double pi=3.14 ;
		 double circum;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		r=sc.nextInt();
		circum=2*pi*r;
		System.out.println("circumference of circle  :"+circum);
	}

}
