// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int a = (int) (Math.random()*100);
		int b = (int) (Math.random()*100);
		int c = (int) (Math.random()*100);
		System.out.println(a+" "+b+" "+c);
		int min = Math.min(a,Math.min(c,b));
		int max = Math.max(a,Math.max(c,b));
		System.out.println(min+" "+(a+b+c-min-max)+" "+max);
	}
}
