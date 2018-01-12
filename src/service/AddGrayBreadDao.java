package service;



import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import service.ConnectionManager;
import model.GrayBreadBean;


public class AddGrayBreadDao {
	Connection con;
	ResultSet rs;
	public int addGrayBeard(GrayBreadBean grayBreadBean) {
		int addResult = 0;	
		String sql = "INSERT INTO graybeard( GraybeardID,UserID,GraybeardName,GraybeardLastName,GraybeardOld,Cult,FoodAllergy,DrugAllergy,GraybeardAdress,DoctorID) VALUE (?,?,?,?,?,?,?,?,?,?)";
		try {
			con = ConnectionManager.getConnection(); 
			PreparedStatement ppt = con.prepareStatement(sql);
			ppt.setString(1, grayBreadBean.getGraybeardID());
			ppt.setString(2, grayBreadBean.getUserID());
			ppt.setString(3, grayBreadBean.getGraybeardName());
			ppt.setString(4, grayBreadBean.getGraybeardLastName());
			ppt.setString(5, grayBreadBean.getGraybeardOld());
			ppt.setString(6, grayBreadBean.getCult());
			ppt.setString(7, grayBreadBean.getFoodAllergy());
			ppt.setString(8, grayBreadBean.getDrugAllergy());
			ppt.setString(9, grayBreadBean.getGraybeardAdress());
			ppt.setString(10, grayBreadBean.getDoctorID());
			addResult = ppt.executeUpdate();

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return addResult;

	}
	

	
		

		
	
	
	public ArrayList<GrayBreadBean> getGrayBread(Object string) {
		// TODO Auto-generated method stub
		return null;
	}

}

