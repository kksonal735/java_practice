package banking_system;
import java.util.*;
public class Bank_info {
   int userId,balance,acc_no;
   static int cnt=100300;
   String name,password,acc_type;
  public String getPassword() {
	return password;
  }
 public void setPassword(String password) {
	this.password = password;
  }
 public  Bank_info() {}
public Bank_info(int userId, String name, String password, String acc_type,int acc_no) {
	this.userId = userId;
	this.name = name;
	this.password = password;
	this.acc_type = acc_type;
    this.acc_no= cnt++;
    this.balance=0;
}
 public void show() {
	 System.out.println("User Id: "+userId);
	 System.out.println("User name: "+name);
	 System.out.println("Account no: "+cnt);
	 System.out.println("account Type: "+acc_type);
	 
 }
 public void deposit(int amount) {
	 if(amount>0) {
	 balance+=amount;
	 System.out.println("amount is deposited succesfully\n");
	 }
	 else {
		 System.out.println(" please enter valid amount"); 
	 }
 }
 public void Withdraw(int amount) {
	 if(amount>0 && amount<balance) {
	 balance -=amount;
	 System.out.println("amount is withdraw succesfully\n");
	 }
	 else {
		 System.out.println(" your balance is zero or you enter more amount than your balance"); 
	 }
 }
 public void Show_balance() {
	 	 System.out.println("Your total balance: "+balance);
 }
   
}
