package basic;

public class Ternary_Operator {
	
	public static void ternary() {
		
		//short hand method to solve the if else statements in one line
		// data type variable = (condition) ? true statement : false statement
		// ? = ternary
		
		int time = 13;
		
		String result = (time < 12) ? "good morning" : "good evening";
		System.out.println(result);
	}
	
	public static void main (String [] args) {
		
		ternary();
		
		
	}

}
