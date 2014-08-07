/* Provides connectivity to DB
 * 
 */

package com.sivid.ORM.dbside;
// import java.sql.*;
// import java.util.*;
import java.io.*;

public class DatabaseConn {

	public DatabaseConn() {
		// TODO Auto-generated constructor stub
	}
	
	public static java.sql.Connection getConnection() throws Exception{
		java.util.Properties props = new java.util.Properties();
		FileInputStream in = new FileInputStream("res/database.properties");
		props.load(in);
		in.close();
		String driver_name = props.getProperty("jdbc.driver");
		String url = props.getProperty("jdbc.url");
		String username = props.getProperty("jdbc.username");
		String password = props.getProperty("jdbc.password");
		Class.forName(driver_name);
		return java.sql.DriverManager.getConnection(url, username, password);
	}

}
