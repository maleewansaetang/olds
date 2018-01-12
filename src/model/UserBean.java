package model;

import java.sql.Date;

public class UserBean {
	String UserID;
	String UserName;
	String Passwords;
	String UserAdress;
	String UserTel;
	String UserStatus;
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserBean(String userID, String userName, String passwords, String userAdress, String userTel,
			String userStatus) {
		super();
		UserID = userID;
		UserName = userName;
		Passwords = passwords;
		UserAdress = userAdress;
		UserTel = userTel;
		UserStatus = userStatus;
	}
	@Override
	public String toString() {
		return "UserBean [UserID=" + UserID + ", UserName=" + UserName + ", Passwords=" + Passwords + ", UserAdress="
				+ UserAdress + ", UserTel=" + UserTel + ", UserStatus=" + UserStatus + ", getUserID()=" + getUserID()
				+ ", getUserName()=" + getUserName() + ", getPasswords()=" + getPasswords() + ", getUserAdress()="
				+ getUserAdress() + ", getUserTel()=" + getUserTel() + ", getUserStatus()=" + getUserStatus()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPasswords() {
		return Passwords;
	}
	public void setPasswords(String passwords) {
		Passwords = passwords;
	}
	public String getUserAdress() {
		return UserAdress;
	}
	public void setUserAdress(String userAdress) {
		UserAdress = userAdress;
	}
	public String getUserTel() {
		return UserTel;
	}
	public void setUserTel(String userTel) {
		UserTel = userTel;
	}
	public String getUserStatus() {
		return UserStatus;
	}
	public void setUserStatus(String userStatus) {
		UserStatus = userStatus;
	}
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}
	public void setRegistrationdate(java.util.Date registrationdate) {
		// TODO Auto-generated method stub
		
	}

}