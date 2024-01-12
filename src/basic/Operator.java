package basic;

public class Operator {
	
	/*
	 * 3)10(3
	 * 	 9
	 * -----
	 *   1
	 * -----
	 */
	
	public static void division()
	{
		int a=3,b=10;
		System.out.println(b/a);
		
	}
	
	public static void divisor()
	{
		int a=3,b=10;
		System.out.println(b%a);
	}
	
	public static void newman()
	{
		int x=5;
		x += 3;
		System.out.println(x);
		int y = 7;
		y -= 3;
		System.out.println(y);
		int a = 4;
		a *= 2;
		System.out.println(a);
		int b = 6;
		b /= 2;
		System.out.println(b);
		int c = 3;
		c %= 2;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		division();
		divisor();
		newman();
		
	

	}

}
