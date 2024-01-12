package advance;

public class final_ex {
	
		  final int x = 10;
		  final double PI = 3.14;

		  public static void main(String[] args) {
		    final_ex myObj = new final_ex();
		   /* myObj.x = 50; // will generate an error: cannot assign a value to a final variable
		    myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
		    */
		    System.out.println(myObj.x);
		  }
		}