package ro.ase.csie.cts.staticAttributes;

import ro.ase.csie.cts.DbConnection;

public class TestSingleton {

	public static void main(String[] args) {
		DbConnection con1 = DbConnection.connection;
		DbConnection con2 = DbConnection.connection;
		

	}

}
