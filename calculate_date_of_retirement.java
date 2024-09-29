package assignment_2;
import java.time.LocalDate;
import java.util.Scanner;

public class calculate_date_of_retirement {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the joining date of the employee (yyyy-mm-dd): ");        
	        String joiningDateInput = sc.nextLine();
	        System.out.print("Enter the date of birth of the employee (yyyy-mm-dd): ");
	        String DateOfBirth = sc.nextLine();
	        try {
	            LocalDate joiningDate = LocalDate.parse(joiningDateInput);
	            LocalDate DOB  = LocalDate.parse(DateOfBirth);
	            LocalDate retirementDate =DOB.plusYears(58);
	            
	            System.out.println("The retirement date of the employee is: " + retirementDate);
	       
	        } catch (Exception e) {
	            System.out.println("Invalid date format. Please enter the date in yyyy-mm-dd format.");
	        }
	    }
	}
