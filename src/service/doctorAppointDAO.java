package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.PackageBean;
import model.doctorAppointBean;

public class doctorAppointDAO {
	public static ArrayList<doctorAppointBean> getALLDoctor() {
		doctorAppointBean bean = null;
		ArrayList<doctorAppointBean> Doctor = new ArrayList<doctorAppointBean>();
		String sql = "SELECT * FROM `doctor`";
		try {
			Connection con = ConnectionManager.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				bean = new doctorAppointBean();
				bean.setDoctorID(rs.getString("DoctorID"));
				bean.setDoctorName(rs.getString("DoctorName"));
				bean.setDoctorLastName(rs.getString("DoctorLastName"));
				bean.setDoctorAdress(rs.getString("DoctorAdress"));
				bean.setDoctorTel(rs.getString("DoctorTel"));

				Doctor.add(bean);

			}

			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Doctor;

	}

}
