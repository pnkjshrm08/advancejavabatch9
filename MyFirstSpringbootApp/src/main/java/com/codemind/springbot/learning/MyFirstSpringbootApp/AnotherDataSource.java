package com.codemind.springbot.learning.MyFirstSpringbootApp;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class AnotherDataSource {

	
	//@Value("${app.database.url}")
	public String DataBaseURL ;
	//@Value("${app.username}")
	public String username ;
	//@Value("${app.pwd}")
	public String pwd ;
	

	public AnotherDataSource() {
		
		System.out.println("DataBase URL :"+ DataBaseURL + "User Name+"+username
				+ "Password :" + pwd);
		
	}
	public String getDataBaseURL() {
		return DataBaseURL;
	}
	public void setDataBaseURL(String dataBaseURL) {
		DataBaseURL = dataBaseURL;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return "AnotherDataSource [DataBaseURL=" + DataBaseURL + ", username=" + username + ", pwd=" + pwd + "]";
	}
	
	
}
