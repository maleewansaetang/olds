package service;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;

	import model.RoomBean;
	



	public class RoomDAO {

		public static ArrayList<RoomBean> getALLRoom(){
			RoomBean bean = new RoomBean();
			ArrayList<RoomBean> Room = new ArrayList<RoomBean>();
			String sql = "SELECT * FROM room";
			try {
				Connection con = ConnectionManager.getConnection(); 
				Statement stmt = con.createStatement(); 
				ResultSet rs = stmt.executeQuery(sql); 
				
				while (rs.next()) {
					bean = new RoomBean();
					bean.setRoomName(rs.getString("RoomName"));
					bean.setRoomStatus(rs.getString("RoomStatus"));
					bean.setRoomPrice(rs.getString("RoomPrice"));
					bean.setRoomType(rs.getString("RoomType"));
					
					Room.add(bean);


				}

				rs.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			return Room;
			
		}

		

}
