package com.codemind.springbot.learning.MyFirstSpringbootApp;


import org.springframework.stereotype.Component;

@Component
public class MyDataSource {
	
	
	//@Value("${app.database.url}")
	public String DataBaseURL ;
	//@Value("${app.username}")
	public String username ;
	//@Value("${app.pwd}")
	public String pwd ;
	
	
	//@Value("${GreetingEnable}")
	public boolean myflag;
	
	public void display() {
		
		if(myflag) {
			
			System.out.println("Hello how are you!!");
		} else {
			// NO Greeting msg
		}
	}
	
	public MyDataSource() {
		
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
		return "MyDataSource [DataBaseURL=" + DataBaseURL + ", username=" + username + ", pwd=" + pwd + "]";
	}
	
	
	
	

}
