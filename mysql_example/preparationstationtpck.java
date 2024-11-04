package sql_assignment;
import java.sql.*;
import java.time.LocalDate;
public class preparationstationtpck 
{
  static Connection Cn;
  static  PreparedStatement pst;
  static {
	  Cn=DBUtil.getConnection();
	  if(Cn!=null) {
		  System.out.println("jdbc connection is taken");
	  } 
  } 	  
	  public static int addBankHolder(int accno, String name,int tno,String type,double amt,Date dot,String address)
	  {
		int n=0;
		try {
			pst=Cn.prepareStatement("Insert into bank values(?,?,?,?,?,?,?)");
			pst.setInt(1,accno);
			pst.setString(2,name);
			pst.setInt(3,tno);
			pst.setString(4,type);
			pst.setDouble(5,amt);
			pst.setDate(6,dot);
			pst.setString(7,address);
			
			n=pst.executeUpdate();
			System.out.println("insert entry successfully");
		}catch(SQLException e) {
			System.out.println("error"+ e.getMessage());
			n=0;
		}
	  return n;  
	  }
	  public static int validateUser(int accno)
	  {
		  int n=0;
		  try {
				pst=Cn.prepareStatement("SELECT * FROM bank WHERE accno="+ accno);
				ResultSet r=pst.executeQuery();
				if(r.next()) {
					if(r.getInt(1)!=0)
						n=1;
					System.out.println("valid user");
				}
		  }catch(SQLException e) {
			System.out.println("error"+ e.getMessage());
			n=0;
	  }
	 return n;
	  }
	  public static boolean deleteUser(int accno) {
		  boolean status=false;
		  try {
			  int n=validateUser(accno);
			  if(n==1) {
				  pst=Cn.prepareStatement("DELETE FROM bank WHERE accno="+accno);
				  pst.executeUpdate();
				  status=true;
				  System.out.println("delete record..");
			  }
		  }catch(SQLException e) {
				System.out.println("error"+ e.getMessage());
				
		  }
		  return status; 
	  }
	  
	  public static boolean updateUsername(int accno,String name) {
		  boolean status=false;
		  try {
			  if(validateUser(accno)==5) {
				  pst=Cn.prepareStatement("UPDATE bank SET name='"+name+"' where accno="+ accno);  
				  ResultSet r=pst.executeQuery();
				  if(r.next()) {
					  int n;
					  if(r.getInt(1)!=0)
							n=1;
					  System.out.println("update record successfully");
				  }
				  status=true;
				  }else 
					  System.out.println("No such bank records");
				    }catch(SQLException e) {
						System.out.println("error"+ e.getMessage());
						e.printStackTrace();
				  }
		  return status;
	  }
	  public static void showUser() {
		  try {
			  pst=Cn.prepareStatement("SELECT * FROM bank");
			  ResultSet r=pst.executeQuery();
			  if(r.next()) {
				while(r.next()) {
					System.out.println(r.getInt(1)+"\t"+r.getString(2)+"\t"+r.getInt(3)+"\t"+r.getString(4)+r.getDouble(5)+"\t"+r.getDate(6)+"\t"+r.getString(7));
				}
			  
		  }	else
			  System.out.println("No such user records");
			  r.close();
			  
		  }catch(SQLException e) {
				System.out.println("error"+ e.getMessage());
		  }
	  }
	  public void closeConnection() {
		  try {
			  pst.close();
			  Cn.close();
		  }
		  catch(SQLException e) {
			  e.printStackTrace();
		  }
	  }
}

	  

