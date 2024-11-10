package com.model;

public class User {
	   private String name;
	   private String email;
	   private String diachi;
	   private String password;
	   private String sex;
	   private String[] loaiship;
	  
	   
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public  void setEmail(String Email) {
			this.email = Email;
		}
		public String getDiachi() {
			return diachi;
		}
		public void setDiachi(String diachi) {
			this.diachi = diachi;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String[] getLoaiship() {
			return loaiship;
		}
		public void setLoaiship(String[] loaiship) {
			this.loaiship = loaiship;
		}
		
		public User(String email, String name, String password, String sex, String diachi, String[] loaiship) {
			super();
			this.email = email;
			this.name = name;
			this.password = password;
			this.sex = sex;
			this.diachi = diachi;
			this.loaiship = loaiship;
		}
		public User() {
			// TODO Auto-generated constructor stub
		}
}