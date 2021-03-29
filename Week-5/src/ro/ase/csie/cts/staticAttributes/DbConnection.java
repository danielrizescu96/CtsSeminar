package ro.ase.csie.cts.staticAttributes;



public class DbConnection {

	String connString;
	String schema;
	
	public final static DbConnection connection = new DbConnection();
	
	static {
		//called only once before the class is loaded by the JVM
		System.out.println("Hello, DbConnection is loaded");
		connection.connString = "12.12.4:55";
		connection.schema = "tempData";
		
	}
	
	{
		
	}
	
	private DbConnection() {
		System.out.println("creating a connection object");
		System.out.println("loading..");
		this.connString = "2.3.1.321.:32";
		this.schema = "schemaa";
		
	}


	private DbConnection(String connString, String schema) {
		super();
		this.connString = connString;
		this.schema = schema;
	}
	//Singleton-constructors private!!
	
	
	//its not clean
	//its misleading-others will think they have multiple connections
	public static DbConnection getConnection(String connString, String schema) {
		if(DbConnection.connection == null) {
			connection = new DbConnection(connString, schema);
		}
		return DbConnection.connection;
	}
}
