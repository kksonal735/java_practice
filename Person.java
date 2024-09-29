package assignment_2;

import java.time.*;
import java.util.*;

public class Person {
	static int D,M,Y;
	
	public static void CalculateAge()throws DateTimeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Birth date :");
		D=sc.nextInt();
		System.out.println("enter month:");
		M=sc.nextInt();
		System.out.println("enter year:");
		Y=sc.nextInt();

		LocalDate Bdate=LocalDate.of(Y, M, D);
		LocalDate currentDate= LocalDate.now();
		Period p=Period.between(Bdate, currentDate);
		System.out.println("your age is : year "+ p.getYears()+" month "+p.getMonths()+" days "+p.getDays());
	}

	public static void main(String[] args) {
		CalculateAge();
	}
}
