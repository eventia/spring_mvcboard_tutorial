package com.wind.webmyboard;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class mysqlTest1 {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/test1"; 
	private static final String USER = "scott"; 
	private static final String PW = "tiger";  

		
	@Test
	public void testConnection() throws Exception{

		Class.forName(DRIVER);

		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println("... Connected : SUCCESS");
			System.out.println(con);
		}catch (Exception e) {
			System.out.println("... Error ...");
			e.printStackTrace();
		}
	}
}
