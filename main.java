package demo;

import java.beans.Statement;

public class Hello {
	
	public static void main(String [] args) {
		try {
			class.forName("com.mysql.cj.jdbc.Driver");
			connection con = DriverManager.getConnection("path of db", "user", "pass");
			Statement at = con.createStatement();
			ResultSet rs = st.executeQuery("select * from emp");
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" " + " " + rs.getString(2)+ " " + " " =rs.getString(3));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
