package java_practice;
import java.util.*;
public class Swap {
    public void Swap_callByValue(int num1,int num2) {
    	System.out.println("numbers after swapping:  "+num1+"  "+num2);
    	int temp=num1;
    	num1=num2;
    	num2=temp;
    	System.out.println("numbers before swapping: "+num1+"  "+num2);
    }
	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		Swap s=new Swap();
        s.Swap_callByValue(10,20);
        System.out.println("enter 2 numbers: ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("numbers after swapping:  "+num1+"  "+num2);
        num1=num1-num2;
        num2=num1+num2;
        num1=num2-num1;
        System.out.println("numbers before swapping: "+num1+"  "+num2);
	}

}
