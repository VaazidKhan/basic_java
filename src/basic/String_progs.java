package basic;

public class String_progs {
	
	public static void length()
	{
		//I am using length method 
		String myWord = "GJMNBGYJNBVFHNBGHNH";
		System.out.println("Length of the word is :" + myWord.length());
	}
	
	public static void upper()
	{
		String myLow = "hello ji sasriyakal";
		System.out.println(myLow.toUpperCase());
	}
	
	public static void lower()
	{
		String myUp = "HI I AM A TESTER";
		System.out.println(myUp.toLowerCase());
	}
	
	public static void indexing()
	{
		String myText = "Hello please locate tester index";
		System.out.println(myText.indexOf("please"));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		length();
		upper();
		lower();
		indexing();

	}

}
