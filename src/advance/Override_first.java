package advance;

public class Override_first {
	
	public static void main(String[] args) {
		First myObj1 = new First();
		//first x was 5 now 10
		myObj1.x = 10;
		
		First myObj2 = new First();
		myObj2.x = 50;
		
		System.out.println(myObj1.x);
		System.out.println(myObj2.x);
		
	}

}
