package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import contactDetails.AddContact;

public class Database{

	private Connection con;
	private String user = "root";
	private String password = "RavindeR";
	
	public void connect() throws Exception{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Found");
		}catch(Exception e){
			System.out.println("Driver not found");
			e.printStackTrace();
		}

		String conUrl = "jdbc:mysql://localhost:3306/ContactInfo";
		con = DriverManager.getConnection(conUrl, user, password);
		System.out.println("Connected to "+con);
	}
	
	public void fetchData(){
		String fetchString = "select * from ContactDetails";
		try{
		PreparedStatement ps = con.prepareStatement(fetchString);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			String name = rs.getString(1);
			System.out.println(name);
			String address = rs.getString(2);
			System.out.println(address);
			String mobile = rs.getString(3);
			System.out.println(mobile);
			String email = rs.getString(4);
			System.out.println(email);
		}
		}
		catch(Exception e){
			
		}
	}
	
	public void insertData() throws Exception{
		AddContact ac = new AddContact();
		
		String namein = ac.getNameString();
		String addressin = ac.getAddressString();
		char[] mobilein = ac.getMobileString();
		String emailin = ac.getEmailString();
		System.out.println(namein+" "+addressin+" "+" "+mobilein+" "+emailin);
		
		try{
			connect();
			PreparedStatement psin = con.prepareStatement("INSERT INTO ContactInfo (Name,Address,MobileNumber,Email) VALUES ('"+namein+"','"+addressin+"','"+mobilein+"','"+emailin+"')");
			psin.executeUpdate();
		}catch(Exception e){
			
		}
	}
	
	public void disConnect(){
		try{
		con.close();
		System.out.println("Connection closed");
		}
		catch(Exception e){
			System.out.println("Cannot close the connection");
		}
	}
}