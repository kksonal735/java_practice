package java_practice;
import java.util.*;
public class Palindrom {
    public void Check_palindrom() {
    	String num;
    	String rev="";
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter number");
    	num=sc.next();
    	for(int i=num.length()-1;i>=0;i--) {
    	   rev += num.charAt(i);
    	}
    	if(rev.equals(num)){
    		System.out.println("Number is palindrom"); 
    	}
    	else {
    		System.out.println("Number is not palindrom");
    	}
    	sc.close();
    }
	public static void main(String[] args) {
		
           Palindrom p=new Palindrom();
           p.Check_palindrom();
	}

}
