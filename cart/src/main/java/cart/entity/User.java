package cart.entity;

public class User {
	private int userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	private int userPhone;
	private String userPic;
	private String userAddress;
	
	public User(int userId, String userName, String userEmail, String userPassword, int userPhone, String userPic,
			String userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userPic = userPic;
		this.userAddress = userAddress;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserPic() {
		return userPic;
	}
	public void setUserPic(String userPic) {
		this.userPic = userPic;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", userPhone=" + userPhone + ", userPic=" + userPic + ", userAddress=" + userAddress
				+ "]";
	}
	
	
}
