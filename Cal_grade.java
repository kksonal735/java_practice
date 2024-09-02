package java_practice;
import java.util.Scanner;
public class Cal_grade {
	int id,avg;
	String name;
	String grade;
	int []marks=new int[5];
    
	public Cal_grade(int id, int marks[], String name) {
		this.id = id;
		this.marks = marks;
		this.name = name;
	}
	public void Grade(int total) {
	        avg = total/5;
	        System.out.print("The student Grade is: ");
	        if(avg>=90)
	        {
	            grade="A+";
	        }
	        else if(avg>=70 && avg<90)
	        {
	        	 grade="A";
	        } 
	        else if(avg>=50 && avg<70)
	        {
	        	 grade="B+";
	        }
	        else if(avg>=40 && avg<50)
	        {
	        	 grade="B";
	        }
	        else if(avg>=35 && avg<40)
	        {
	        	 grade="C";
	        }
	        else
	        {
	        	grade="Fail";
	        }
	    }
    public void display(int total) {
    	System.out.println("id: "+id+"\n name: "+name+"\n total marks:"+total+ "\n Grade: "+grade);
		}

	public static void main(String[] args) {
		int id,total=0;
		String name;
		int []marks=new int[5];
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter id of student: ");
	    id=sc.nextInt();
	    System.out.println("enter of name student: ");
	    name=sc.next();
	    for(int i=0; i<5; i++) { 
	           System.out.print("Enter Marks of Subject"+(i+1)+":");
	           marks[i] = sc.nextInt();
	           total = total + marks[i];
		 }

	    Cal_grade c=new Cal_grade(id,marks,name);
	    c.Grade(total);
	    c.display(total);
	    
	}

}
