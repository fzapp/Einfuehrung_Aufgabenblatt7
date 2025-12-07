package h2;
import java.util.Arrays;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[] change(int[] a, int[] b, int start, int end) {
		if(end <= start) {
			int[] empty = new int[0];
			return empty;
		}
		
		if(a.length != b.length) {
			
			return createIdenticalArray(a);
		}
		
		boolean identical = true;
		for(int i=0; i<a.length; i++) {
			if(a[i] != b[i]) {
				identical = false;
			}
		}
		
		if(!identical) {
			return createIdenticalArray(a);
		}
		
		Arrays.sort(a);
		int[] ergebnis = new int[end-start];
		ergebnis = Arrays.copyOfRange(a, start, end-1);
		return ergebnis;		
	}
	
	public static int[] createIdenticalArray(int [] a) {
		int[] newArray = new int[a.length];
		for(int i=0; i<a.length; i++) {
			newArray[i] = a[i];
		}
		return newArray;
		
		
	}

}
