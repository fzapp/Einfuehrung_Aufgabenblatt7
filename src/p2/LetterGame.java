package p2;

public class LetterGame {
	public String keyString = "FRANZ JAGT IM KOMPLETT VERWAHRLOSTEN TAXI QUER DURCH BAYERN!";
	public String word = new String();
	
	public void setWord(int[] a) {
		String temp = new String();
		for(int i = 0; i < a.length; i++) {
			char naechstesZeichen;
			naechstesZeichen = keyString.charAt(i);
			temp = temp + naechstesZeichen;
		}
		word = temp;
	}

	
	public int[] findCode(String s) {
		int[] rueckgabe = new int[s.length()];
		for(int i=0; i<s.length(); i++) {
			char gesucht = s.charAt(i);
			int index = keyString.indexOf(gesucht);
			rueckgabe[i] = index;
		}
		return rueckgabe;
	}
}
