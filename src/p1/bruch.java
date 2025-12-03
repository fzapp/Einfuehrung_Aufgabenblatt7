package p1;

public class bruch {
	public int z;
	public int n;
	
	public bruch(int zaehler, int nenner) {
		z = zaehler;
		n = nenner;
	}
	
	public String toString() {
		String Inhalt = z + ":" + n;
		return Inhalt;
	}

}
