package model;

public class RoomBean {
	String RoomName;
	String RoomStatus;
	String RoomPrice;
	String RoomType;
	public String getRoomName() {
		return RoomName;
	}
	public void setRoomName(String roomName) {
		RoomName = roomName;
	}
	public String getRoomStatus() {
		return RoomStatus;
	}
	public void setRoomStatus(String roomStatus) {
		RoomStatus = roomStatus;
	}
	public String getRoomPrice() {
		return RoomPrice;
	}
	public void setRoomPrice(String roomPrice) {
		RoomPrice = roomPrice;
	}
	public String getRoomType() {
		return RoomType;
	}
	public void setRoomType(String roomType) {
		RoomType = roomType;
	}
	@Override
	public String toString() {
		return "RoomBean [RoomName=" + RoomName + ", RoomStatus=" + RoomStatus + ", RoomPrice=" + RoomPrice
				+ ", RoomType=" + RoomType + ", getRoomName()=" + getRoomName() + ", getRoomStatus()=" + getRoomStatus()
				+ ", getRoomPrice()=" + getRoomPrice() + ", getRoomType()=" + getRoomType() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public RoomBean(String roomName, String roomStatus, String roomPrice, String roomType) {
		super();
		RoomName = roomName;
		RoomStatus = roomStatus;
		RoomPrice = roomPrice;
		RoomType = roomType;
	}
	public RoomBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}