package com.kesav.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class JdbConnection {

	public static HashMap<String, String> getSqlData() throws SQLException {
		String var = null;
		String var1 = null;
		String var2 = null;
		String var3 = null;
		String host="localhost";
		String port="3306";
		
	
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/SqlPrac", "root", "Kesav@1999");
		Statement s = con.createStatement();
		ResultSet rs= s.executeQuery("select * from infodata where cus_Name=\"Elavarasi\";");
		
		while(rs.next())
		{
		  var  = String.valueOf(rs.getString("cus_Name"));
		  var1 = String.valueOf(rs.getString("cus_Mob"));
		  var2 = String.valueOf(rs.getString("cus_email"));
		  var3 = String.valueOf(rs.getString("cus_Password"));
		}	
 
			 HashMap<String, String> userInfo = new HashMap<String, String>();
			 userInfo.put("1",var);
			 userInfo.put("2",var1);
			 userInfo.put("3",var2);
			 userInfo.put("4",var3);
			 return userInfo;
	
	}

}
