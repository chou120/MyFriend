package com.yuanren.friend.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConn {	
	/**
	 * 通过JNDI连接池的方式
	 * */
	/*public static Connection getConnection(){
		try {			
			InitialContext context = new InitialContext();
			DataSource dSource = (DataSource) context.lookup("java:comp/env/jdbc/onlinefriend");
			Connection conn = dSource.getConnection();
			
			return conn;						
		} catch (Exception e) {			
			e.printStackTrace();
		}		
		return null;
	}*/
	
	/**
	 * 最基本的方式
	 * */
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://192.168.1.55:3306/onlineFriend?useUnicode=true&characterEncoding=utf-8";
	private static String user = "root";
	private static String passwd = "zhou";

	public static Connection getConnection(){
		try {
			//加载驱动
			Class.forName(driver);
			//连接数据库
			Connection conn = DriverManager.getConnection(url,user,passwd);

			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	
}

