package assignment_2;
import java.util.*;

class Employee implements Comparable<Employee>
{
	int empid,salary;
	String location,empname;
	

	public Employee(int empid, int salary, String location, String empname) {
		this.empid = empid;
		this.salary = salary;
		this.location = location;
		this.empname = empname;
	}


	@Override
	public String toString() {
		return "empid=" + empid + ", salary=" + salary + ", location=" + location + ", empname=" + empname;
	
}
	@Override
	public int compareTo (Employee o) {
		return this.empname.compareTo(o.empname);
	}

}

public class EmployeeManagement {
	public static ArrayList<Employee> emp=new ArrayList<Employee>();
	static int empid,salary;
	static String location,empname;

	public static void Search() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee id to search:");
		int searchId=sc.nextInt();
		for(Employee e:emp) {
		if(e.empid==searchId) {
			System.out.println("employee found: "+e);
			return;
		 }	
		}
	}
	
	public static void main(String[] args) {
		int ch=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("===================");
			System.out.println("1.Accept employee details");
			System.out.println("2.Display employee details");
			System.out.println("3.Search employee");
			System.out.println("4.Sort employee details");
			ch=sc.nextInt();
			switch(ch) { 
			   case 1:
					System.out.println("Enter employee id:");
					empid=sc.nextInt();
					System.out.println("Enter employee Name:");
					empname=sc.next();
					System.out.println("Enter employee location:");
					location=sc.next();
					System.out.println("Enter employee Salary:");
					salary=sc.nextInt();
				   emp.add(new Employee(empid,salary,location,empname)); 
				   break;
			   case 2:
				   System.out.println(emp);
				   break;
			   case 3:
				   Search();
				   break;
			   case 4:
				Collections.sort(emp);
				   for(Employee e:emp) {
					   System.out.println(e);
				   }
				   break;
			   case 5:
				   System.out.println("Exiting...");
				   return;
			   default:
				   System.out.println("Invalid choice. Please enter valid choice.....");
				   
			}
		}while(ch !=5);
	}
}


