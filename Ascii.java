package java_practice;
import java.util.*;
public class Ascii {
  public static void main(String arg[]) {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("enter a charracter:");
	  char ch=sc.next().charAt(0);
	  int chh=ch;
	  System.out.print("ascii value of given character :"+ chh);
  }
}
