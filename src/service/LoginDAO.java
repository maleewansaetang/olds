package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;



import model.UserBean;

public class LoginDAO {
	static Connection currentCon = null;
	static ResultSet rs = null;
    static PreparedStatement prepareStatement = null;
	public static UserBean login(String userName, String password) throws SQLException {
		Statement stmt = null; 
		UserBean userBean = null;		
		String searchQuery = "SELECT * FROM users WHERE UserName =? AND Passwords =? ";
		// System.out.println("Query: " + searchQuery);
		try {
			// connect to DB
			currentCon = ConnectionManager.getConnection();
			PreparedStatement pos = currentCon.prepareStatement(searchQuery);
			pos.setString(1, userName);
			pos.setString(2, password);
			rs = pos.executeQuery(); 
			if (rs.next()) {
				String UserID = rs.getString("UserID");
				String UserName = rs.getString("UserName");
				String Passwords = rs.getString("Passwords");
				

				userBean = new UserBean();
				userBean.setUserID(UserID);
				userBean.setUserName(UserName);
				userBean.setPasswords(password);
			
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs.close();
			currentCon.close();
		}
		return userBean;
	}
}