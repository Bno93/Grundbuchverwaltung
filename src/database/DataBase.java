package database;

import java.net.UnknownHostException;

import com.mongodb.DBCursor;
import com.mongodb.MongoException;

public class DataBase {
	private String hostname;
	private int portnumber;
	private String databaseName;
	private String username;
	private char[] password;
	private DatabaseConnector connector;

	public DataBase(String hostname, int portnumber, String databaseName, String username, char[] password) throws UnknownHostException, MongoException, Exception {
		this.databaseName = databaseName;
		this.hostname = hostname;
		this.password = password;
		this.portnumber = portnumber;
		this.username = username;
		this.connector = new DatabaseConnector(hostname,portnumber,databaseName, username,password);
	}

	public void loadData(){
		System.out.println("start loding Data");
		DBCursor cursor = this.connector.getGrundbuchCollection().find();
		while(cursor.hasNext()){
			System.out.println(cursor.next().get("name"));
		}
	}

}
