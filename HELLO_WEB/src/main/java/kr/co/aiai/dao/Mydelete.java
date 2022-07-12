package kr.co.aiai.dao;
import java.sql.*;

public class Mydelete {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3305/python", "root", "python");
		String sql ="delete from emp where e_id =3";
		PreparedStatement ps = conn.prepareStatement(sql);
		int result = ps.executeUpdate();
		
		System.out.println("result" + result);

		
		ps.close();
		conn.close();
	}

}



