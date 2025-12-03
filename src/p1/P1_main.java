package p1;

public class P1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void multFrac(int z1, int n1, int z2, int n2) {
		int zaehlerGesamt = z1*z2;
		int nennerGesamt = n1*n2;
		System.out.println(zaehlerGesamt + ":" + nennerGesamt);
	}

	
	public static void multFrac(bruch a, bruch b) {
		int zaehlerGesamt = a.z*b.z;
		int nennerGesamt = a.n*b.n;
		System.out.println(zaehlerGesamt + ":" + nennerGesamt);
	}
}
