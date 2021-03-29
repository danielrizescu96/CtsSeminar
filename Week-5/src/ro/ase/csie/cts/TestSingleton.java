package ro.ase.csie.cts;

public class TestSingleton {

	public static void main(String[] args) {
		//DbConnection con1 = new DbConnection("1.2.3.44", "cts");
		
		DbConnection con1 = DbConnection.getConnection("2.3.45.5:66", "cts");
		DbConnection con2 = DbConnection.getConnection("2.3.45.5:66", "cts");
		
		
		DbConnection con3 = DbConnection.getConnection("2.32.345.5:66", "cts123");

		if(con1 == con2) {
			System.out.println("They point to the same db");
		}
	}

}
