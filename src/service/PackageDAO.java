package service;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;

import model.PackageBean;

	



	public class PackageDAO {

		public static ArrayList<PackageBean> getALLPackage(){
			PackageBean bean = null;
			ArrayList<PackageBean> Package = new ArrayList<PackageBean>();
			String sql = "SELECT * FROM `package`";
			try {
				Connection con = ConnectionManager.getConnection(); 
				Statement stmt = con.createStatement(); 
				ResultSet rs = stmt.executeQuery(sql); 
				
				while (rs.next()) {
					bean = new PackageBean();
					bean.setPackageName(rs.getString("PackageName"));
					bean.setPackageDetail(rs.getString("PackageDetail"));
				
					Package.add(bean);


				}

				rs.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			return Package;
			
		}

		

}
