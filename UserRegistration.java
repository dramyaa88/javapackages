package com.abc.bank.model;

public class UserRegistration {
	private String username;
	private String useraddress;
	private String phnno;
	private String password;
	private String loginId;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((loginId == null) ? 0 : loginId.hashCode());
		System.out.println("result: "+result);
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		System.out.println("result: "+result);
		result = prime * result + ((phnno == null) ? 0 : phnno.hashCode());
		System.out.println("result: "+result);
		result = prime * result + ((useraddress == null) ? 0 : useraddress.hashCode());
		System.out.println("result: "+result);
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		System.out.println("result: "+result);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserRegistration other = (UserRegistration) obj;
		if (loginId == null) {
			if (other.loginId != null)
				return false;
		} else if (!loginId.equals(other.loginId))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phnno == null) {
			if (other.phnno != null)
				return false;
		} else if (!phnno.equals(other.phnno))
			return false;
		if (useraddress == null) {
			if (other.useraddress != null)
				return false;
		} else if (!useraddress.equals(other.useraddress))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public String getPhnno() {
		return phnno;
	}
	public void setPhnno(String phnno) {
		this.phnno = phnno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
}
	
	public static void main(String[] args) {
		UserRegistration obj = new UserRegistration();
		obj.setUseraddress("chennai");
		obj.setLoginId("I056");
		obj.setPassword("abc");
		obj.setPhnno("9876543210");
		obj.setUsername("ramyaa");
		
		
		System.out.println("Getclass "+obj.getClass());
		System.out.println("class "+obj.getClass().getSimpleName());
		System.out.println("hashcode "+obj.hashCode());
		
	}

}
