package basic;

public class Maths {
	
	public static void minimum() {
		System.out.println(Math.min(10,20));
		
	}

	public static void maximum() {
		System.out.println(Math.max(20,4));
	}
	
	public static void squareroot() {
		System.out.println(Math.sqrt(64));
	}
	
	public static void absolute() {
		
		// returns positive value
		System.out.println(Math.abs(-64.78));
	}
	
	public static void randomnum() {
		// from 0.0 to 1.0  it provide float
		System.out.println(Math.random());
	}
	
	public static void bigrandom () {
		// from 0 to 100
		// int is used to downcast from float to int
		//multiplication of 101 is used to give the range from 0 to 99 (100 exclusive)
		
		int randomnum = (int)(Math.random()*101);
		System.out.println(randomnum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		minimum();
		maximum();
		squareroot();
		absolute();
		randomnum();
		bigrandom();

	}

}
