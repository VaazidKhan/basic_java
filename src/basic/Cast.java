package basic;
public class Cast {
	
	public static void upcast()
	{
		int myMarks = 10;
		double myPercent = myMarks;
		
		System.out.println(myPercent);
	}
	
	public static void downcast()
	{
		double myPercent1 = 9.78d;
		int myMarks1 = (int) myPercent1;
		System.out.println(myMarks1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		upcast();
		downcast();

	}

}
