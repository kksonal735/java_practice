package sql_assignment;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Driver_main {
public static void main(String arg[]) {
	
	 preparationstationtpck pk=new  preparationstationtpck();
	 String l="2024-09-29";
	 Date ld = null;
	try {
	ld = new SimpleDateFormat("yyyy-mm-dd").parse(l);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 java.sql.Date sqlDate =new java.sql.Date(ld.getDate()); 

	//pk.addBankHolder(1,"Bharti",707,"Withdraw",3000,sqlDate,"sangamner");
	 //pk.deleteUser(3);
	 //pk.validateuser1();
	 //pk.closeConnection();
	 pk.updateUsername(5,"Bhumi");
	// pk.showUser();
}

}
