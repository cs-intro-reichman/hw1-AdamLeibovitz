// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		int huns = num/100;
		int tens = (num-(huns*100))/10;
		int ones = num-(huns*100)-(tens*10);
		System.out.println(huns+" hundreds, "+tens+" tens, and "+ones+" ones.");
	}
}
