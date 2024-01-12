package basic;

public class Method_Overloading {
	
	static int myNum(int x, int y) {
		
		return x+y;
	}
	
	static double myNum(double x, double y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		int z= myNum(5,10);
		System.out.println(z);
		double a = myNum(5.10,6.32);
		System.out.println(a);
	
	}

}
