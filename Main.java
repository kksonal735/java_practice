package banking_system;
import banking_system.Bank_info;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int userId=0,ch=0,n,amt;
		String name="",password="",acc_type="";
	    int acc_no=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many record you want to insert: ");
		n=sc.nextInt();
		Bank_info []bank=new Bank_info[n];
		
		for(int i=0;i<n;i++) {
		System.out.println("enter user id:");
		userId=sc.nextInt();
		System.out.println("enter user Name:");
		name=sc.next();
		System.out.println("enter Password:");
		password=sc.next();
		System.out.println("enter Account type:");
		acc_type=sc.next();
        
		bank[i]=new Bank_info(userId,name,password,acc_type,acc_no);

		bank[i].show();
		do {
		System.out.println("1.Deposit");
		System.out.println("2.withdraw");
		System.out.println("3.Show balance");
		System.out.println("4.Exit");
		System.out.println("******************");
		System.out.println("enter your choice:");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("enter amount you want to deposit:");
			amt=sc.nextInt();
			bank[i].deposit(amt);
			break;
		case 2:
			System.out.println("enter amount you want to Withdraw:");
			amt=sc.nextInt();
			bank[i].Withdraw(amt);
			break;
		case 3:
			bank[i].Show_balance();
			break;
		case 4:
			System.out.println("Exit...");
			break;
		default:
			System.out.println(".....Invalid choice....");
		}
	  }while(ch!=4);
	}
  }
}
