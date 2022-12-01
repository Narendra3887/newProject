package com.jspiders.jdbcmusic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class Jdbc {
	static String FilePath="C:\\Users\\DELL\\eclipse-workspace\\JDBC\\Resources\\db_info.properties" ;
	static FileReader filereader;
	static String Path="com.mysql.cj.jdbc.Driver";
	static Properties properties=new Properties();
	static Connection connection;
	static PreparedStatement preparedStatement;
	static String query;
	static Scanner sc=new Scanner(System.in);
	static int resultInt;
	static ResultSet resultSet;
	public static void openConnection() {
		try {
			filereader=new FileReader(FilePath);
			properties.load(filereader);
			Class.forName(Path);
			connection=DriverManager.getConnection(properties.getProperty("dbPath"), properties);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	     public void chooseSongToPlay() {
	    	 System.out.println("Select 1 to play Particular Song \n Select 2 to Play All Song  \n Select 3 to Play Random Song");
			   int select =sc.nextInt() ;
			   switch (select) {
			case 1:
				showAllSongs();
				System.out.println("Enter Your Id to play Any one Song on the basis id");
				int ids=sc.nextInt();
				 openConnection();
				try {
					query="select * from musicplayer where id="+ids;
					preparedStatement=connection.prepareStatement(query);
					resultSet=preparedStatement.executeQuery();
					while(resultSet.next()) {
						System.out.println(resultSet.getInt(1)+"||"+resultSet.getString(2)+"||"+resultSet.getString(3)+"||"+resultSet.getString(4)+"||"+resultSet.getString(5)+"||"+resultSet.getString(6)+"||"+resultSet.getString(7));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}closeConnection();
			case 2:
				openConnection();
				try {
					query="select * from musicplayer";
					preparedStatement=connection.prepareStatement(query);
					resultSet=preparedStatement.executeQuery();
					while(resultSet.next()) {
						System.out.println(resultSet.getInt(1)+"||"+resultSet.getString(2)+"||"+resultSet.getString(3)+"||"+resultSet.getString(4)+"||"+resultSet.getString(5)+"||"+resultSet.getString(6)+"||"+resultSet.getString(7));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}closeConnection();
				break;
			case 3:
				
				break;
			default:
				System.out.println("Please Enter Valid Number");
				break;
			}
		
	}
	        public void playAllSongs(){
	        	 openConnection();
	        	query="select * from musicplayer";
	    		try {
	    			preparedStatement=connection.prepareStatement(query);
	    			resultSet=preparedStatement.executeQuery();
	    			while(resultSet.next()) {
	    				System.out.println(resultSet.getInt(1)+"||"+resultSet.getString(2)+"||"+resultSet.getString(3)+"||"+resultSet.getString(4)+"||"+resultSet.getString(5)+"||"+resultSet.getString(6)+"||"+resultSet.getString(7));
	    			}
	    		} catch (SQLException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}
	    		closeConnection();
	        }
	 
	       public void addSong() {
	    	   openConnection();
	    	   query="insert into musicplayer values(?,?,?,?,?,?,?)";
	    	   try {
				preparedStatement=connection.prepareStatement(query);
				System.out.println("Enter the value for id ");
				preparedStatement.setInt(1, sc.nextInt());
				System.out.println("Enter the value for Song Name ");
				preparedStatement.setString(2,sc.next());
				System.out.println("Enter the value for Singername ");
				preparedStatement.setString(3,sc.next());
				System.out.println("Enter the value for Moviename ");
				preparedStatement.setString(4,sc.next());
				System.out.println("Enter the value for Composer ");
				preparedStatement.setString(5,sc.next());
				System.out.println("Enter the value for Lyricsis ");
				preparedStatement.setString(6,sc.next());
				System.out.println("Enter the value for length ");
				preparedStatement.setDouble(7,sc.nextDouble());
				resultInt=preparedStatement.executeUpdate();
				System.out.println(resultInt+" Song Is Added...");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	   closeConnection();
	       }
	       public void removeSong() {
	    	   
	    	   showAllSongs();
	    	   openConnection();
	    	   System.out.println("Enter Your Id to Remove the Song ");
				int ids=sc.nextInt();
				
				try {
					query="DELETE FROM musicplayer WHERE id="+ids;
					preparedStatement=connection.prepareStatement(query);
					resultInt=preparedStatement.executeUpdate();
					System.out.println(resultInt+" Entity is Deleted Successfully");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				closeConnection();
				
	       }
	public void showAllSongs() {
		openConnection();
		query="select * from musicplayer";
		try {
			preparedStatement=connection.prepareStatement(query);
			resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+"||"+resultSet.getString(2)+"||"+resultSet.getString(3)+"||"+resultSet.getString(4)+"||"+resultSet.getString(5)+"||"+resultSet.getString(6)+"||"+resultSet.getString(7));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeConnection();
		}
	
	
	
	public void displaySong() {
		openConnection();
		showAllSongs();
		closeConnection();
	}
	
	public void closeConnection() {
		
		if (connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Connection is Not Close....");
			}
		}
	}
	
   
}
