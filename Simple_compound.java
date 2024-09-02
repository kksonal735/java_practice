package java_practice;
import java.util.*;
public class Simple_compound {

		 public static void main(String arg[]){
				int principle,rate_of_intrest,year,n;
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the principle");
				principle=sc.nextInt();
				System.out.println("enter the rate_of_intrest");
				rate_of_intrest=sc.nextInt();
				System.out.println("enter the year");
				year=sc.nextInt();
				System.out.println("enter the no of interest appied per time");
				n=sc.nextInt();

				float si=principle*rate_of_intrest*year/100;
			    float cm=principle*(1+ rate_of_intrest/n)*rate_of_intrest*year;
			    System.out.println("simple intrest " +si);
				System.out.println("compound intrest "+ cm);
				sc.close();

	}

}
