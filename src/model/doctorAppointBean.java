package model;

public class doctorAppointBean {
	String DoctorID;
	String DoctorName;
	String DoctorLastName;
	String DoctorAdress;
	String DoctorTel;
	public String getDoctorID() {
		return DoctorID;
	}
	public void setDoctorID(String doctorID) {
		DoctorID = doctorID;
	}
	public String getDoctorName() {
		return DoctorName;
	}
	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}
	public String getDoctorLastName() {
		return DoctorLastName;
	}
	public void setDoctorLastName(String doctorLastName) {
		DoctorLastName = doctorLastName;
	}
	public String getDoctorAdress() {
		return DoctorAdress;
	}
	public void setDoctorAdress(String doctorAdress) {
		DoctorAdress = doctorAdress;
	}
	public String getDoctorTel() {
		return DoctorTel;
	}
	public void setDoctorTel(String doctorTel) {
		DoctorTel = doctorTel;
	}
	@Override
	public String toString() {
		return "doctorAppointBean [DoctorID=" + DoctorID + ", DoctorName=" + DoctorName + ", DoctorLastName="
				+ DoctorLastName + ", DoctorAdress=" + DoctorAdress + ", DoctorTel=" + DoctorTel + ", getDoctorID()="
				+ getDoctorID() + ", getDoctorName()=" + getDoctorName() + ", getDoctorLastName()="
				+ getDoctorLastName() + ", getDoctorAdress()=" + getDoctorAdress() + ", getDoctorTel()="
				+ getDoctorTel() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public doctorAppointBean(String doctorID, String doctorName, String doctorLastName, String doctorAdress,
			String doctorTel) {
		super();
		DoctorID = doctorID;
		DoctorName = doctorName;
		DoctorLastName = doctorLastName;
		DoctorAdress = doctorAdress;
		DoctorTel = doctorTel;
	}
	public doctorAppointBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
