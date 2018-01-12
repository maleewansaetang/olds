package model;

public class GrayBreadBean {
	String GraybeardID; 
	String UserID; 
	String GraybeardName; 
	String GraybeardLastName; 
	String GraybeardOld; 
	String Cult ;
	String FoodAllergy ;
	String DrugAllergy; 
	String GraybeardAdress ;
	String DoctorID ;
	public String getGraybeardID() {
		return GraybeardID;
	}
	public void setGraybeardID(String graybeardID) {
		GraybeardID = graybeardID;
	}
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getGraybeardName() {
		return GraybeardName;
	}
	public void setGraybeardName(String graybeardName) {
		GraybeardName = graybeardName;
	}
	public String getGraybeardLastName() {
		return GraybeardLastName;
	}
	public void setGraybeardLastName(String graybeardLastName) {
		GraybeardLastName = graybeardLastName;
	}
	public String getGraybeardOld() {
		return GraybeardOld;
	}
	public void setGraybeardOld(String graybeardOld) {
		GraybeardOld = graybeardOld;
	}
	public String getCult() {
		return Cult;
	}
	public void setCult(String cult) {
		Cult = cult;
	}
	public String getFoodAllergy() {
		return FoodAllergy;
	}
	public void setFoodAllergy(String foodAllergy) {
		FoodAllergy = foodAllergy;
	}
	public String getDrugAllergy() {
		return DrugAllergy;
	}
	public void setDrugAllergy(String drugAllergy) {
		DrugAllergy = drugAllergy;
	}
	public String getGraybeardAdress() {
		return GraybeardAdress;
	}
	public void setGraybeardAdress(String graybeardAdress) {
		GraybeardAdress = graybeardAdress;
	}
	public String getDoctorID() {
		return DoctorID;
	}
	public void setDoctorID(String doctorID) {
		DoctorID = doctorID;
	}
	@Override
	public String toString() {
		return "GrayBreadBean [GraybeardID=" + GraybeardID + ", UserID=" + UserID + ", GraybeardName=" + GraybeardName
				+ ", GraybeardLastName=" + GraybeardLastName + ", GraybeardOld=" + GraybeardOld + ", Cult=" + Cult
				+ ", FoodAllergy=" + FoodAllergy + ", DrugAllergy=" + DrugAllergy + ", GraybeardAdress="
				+ GraybeardAdress + ", DoctorID=" + DoctorID + "]";
	}
	public GrayBreadBean(String graybeardID, String userID, String graybeardName, String graybeardLastName,
			String graybeardOld, String cult, String foodAllergy, String drugAllergy, String graybeardAdress,
			String doctorID) {
		super();
		GraybeardID = graybeardID;
		UserID = userID;
		GraybeardName = graybeardName;
		GraybeardLastName = graybeardLastName;
		GraybeardOld = graybeardOld;
		Cult = cult;
		FoodAllergy = foodAllergy;
		DrugAllergy = drugAllergy;
		GraybeardAdress = graybeardAdress;
		DoctorID = doctorID;
	}
	public GrayBreadBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}