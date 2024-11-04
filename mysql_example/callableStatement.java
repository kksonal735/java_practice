package sql_assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class callableStatement {
    static Connection con=null;
    static CallableStatement cst=null;
    static ResultSet r;
    static {
    	con=DBUtil.getConnection();
    	if(con!=null) {
    		System.out.println("jdbc connection is taken");
    	}
    }
    public static void selectdata() {
    	try {
			cst=con.prepareCall("{call showdata()}");
			ResultSet r=cst.executeQuery();
			while(r.next()) {
				System.out.println(r.getInt("accno")+" "+r.getString("name")+ " "+r.getInt("tno")+" "+r.getString("type")+" "+r.getDouble("amt")+" "+r.getDate("dot")+" "+r.getString("address"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	finally {
            // Clean up resources
            try {
                if (r != null) r.close();
                if (cst!= null) cst.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    
	public static void main(String[] args) {
     selectdata();

	}

}
