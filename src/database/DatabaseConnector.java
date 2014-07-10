package database;

import java.lang.reflect.Constructor;
import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

public class DatabaseConnector {
	/**
	 * host of the connection
	 */
	private final String host;
	/**
	 * Port of the connection
	 */
	private final int portNumber;
	/**
	 * DB-Name of the connection
	 */
	private final String databaseName;
	/**
	 * MongoClient for the connection
	 */
	private MongoClient mongoClient;
	/**
	 * Database of the connection
	 */
	private DB database;
	/**
	 * MasterDocument of the connection
	 */
	private DBObject searchedGrundbuch;
	/**
	 * MasterCollection of the connection
	 */
	private DBCollection userCollection;
	/**
	 * ContentCollection of the connection
	 */
	private DBCollection grundbuchCollection;
	private DBCollection grundbuchblattCollection;

	/**
	 * {@link Constructor} for creating a DatabaseConnection
	 *
	 * @param hostNumber MongoDB-Server address
	 * @param portNumber MongoDB-Server port
	 * @param databaseName Name of the database
	 * @param userName for database, empty for database use without
	 *            authentication
	 * @param pwd password for authentication
	 * @throws UnknownHostException invalid indicate that the IP address of a
	 *             host could not be determined
	 * @throws MongoException if authentication is invalid
	 * @throws Exception if connection lost between start and close
	 */
	public DatabaseConnector( String hostNumber, int portNumber, String databaseName, String userName, char[] pwd )
			throws UnknownHostException, MongoException, Exception {

		this.host = hostNumber;
		this.portNumber = portNumber;
		this.databaseName = databaseName;

		// start the Connection to MongoDB-Server with authentication
		this.startConnection( userName, pwd );

		//test connection with a findOne()
		this.testConnection();


	}

	/**
	 * Close the connection
	 */
	public void closeDBConnection() {
		this.mongoClient.close();
	}

	/**
	 * Get database
	 * @return the used database a
	 */
	public DB getDatabase() {
		return this.database;
	}

	/**
	 * Get datanbaseName
	 * @return the name of the used database
	 */
	public String getDatabaseName() {
		return this.databaseName;
	}

	/**
	 * @return the grundbuchblattCollection
	 */
	public DBCollection getGrundbuchblattCollection() {
		return this.grundbuchblattCollection;
	}

	/**
	 * @return the grundbuchCollection
	 */
	public DBCollection getGrundbuchCollection() {
		return this.grundbuchCollection;
	}

	/**
	 * Get hostname
	 * @return the host of the connection
	 */
	public String getHost() {
		return this.host;
	}

	/**
	 * Get MasterCollection of the database
	 * @return the MasterCollection
	 */
	public DBCollection getMasterCollection() {
		return this.userCollection;
	}

	/**
	 * Get MongoClient
	 * @return the used MongoClient
	 */
	public MongoClient getMongoClient() {
		return this.mongoClient;
	}

	/**
	 * Get portnumber
	 * @return the portnumber
	 */
	public int getPortNumber() {
		return this.portNumber;
	}

	/**
	 * Get used MasterDocument
	 * @return the used MasterDocument
	 */
	public DBObject getSearchedGrundbuch() {
		return this.searchedGrundbuch;
	}

	/**
	 * @return the userCollection
	 */
	public DBCollection getUserCollection() {
		return this.userCollection;
	}

	/**
	 * @param database the database to set
	 */
	public void setDatabase(DB database) {
		this.database = database;
	}

	/**
	 * @param grundbuchblattCollection the grundbuchblattCollection to set
	 */
	public void setGrundbuchblattCollection(DBCollection grundbuchblattCollection) {
		this.grundbuchblattCollection = grundbuchblattCollection;
	}

	/**
	 * @param grundbuchCollection the grundbuchCollection to set
	 */
	public void setGrundbuchCollection(DBCollection grundbuchCollection) {
		this.grundbuchCollection = grundbuchCollection;
	}

	/**
	 * @param mongoClient the mongoClient to set
	 */
	public void setMongoClient(MongoClient mongoClient) {
		this.mongoClient = mongoClient;
	}

	/**
	 * @param userCollection the userCollection to set
	 */
	public void setUserCollection(DBCollection userCollection) {
		this.userCollection = userCollection;
	}

	/**
	 * starts a connection to MongoDB-Server
	 *
	 * @param username username for Database, empty for Database use without
	 *            authentication
	 * @param pwd password for authentication
	 * @throws UnknownHostException invalid indicate that the IP address of a
	 *             host could not be determined
	 * @throws MongoException if authentication is invalid
	 */
	private void startConnection( String userName, char[] pwd ) throws UnknownHostException, MongoException {
		this.mongoClient = new MongoClient( this.host, this.portNumber );
		this.database = this.mongoClient.getDB( this.databaseName );
		if( userName.length() > 0 ){
			boolean authOk = this.database.authenticate( userName, pwd );
			if( authOk ){
				System.out.println( "Authentication successfully!" );
			}
			else{
				System.out
				.println( "Error by Authentication! Check Password and Username!\nMake sure that the User can read on: "
						+ this.databaseName );
			}
		}
		//		System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHH");
		this.userCollection = this.database.getCollection( "User" );
		this.grundbuchCollection = this.database.getCollection("Grundbuch" );
	}

	/**
	 * test the connection with a findOne() because MongoDB connect lazy
	 * MongoDB throws exception if something goes wrong (there is no other way for testing the connection from mongo-driver)
	 *
	 * @throws UnknownHostException invalid indicate that the IP address of a
	 *             host could not be determined
	 * @throws MongoException if authentication is invalid
	 */
	private void testConnection() throws UnknownHostException, MongoException {
		this.searchedGrundbuch = this.grundbuchCollection.findOne();
		if(this.searchedGrundbuch == null){
			//			this.closeDBConnection();
			throw new MongoException( "Cube File MasterCollection not found!" );
		}
	}


}
