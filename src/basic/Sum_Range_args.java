package basic;

public class Sum_Range_args {
	/*
	Scanner s = new Scanner (System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	*/
	static int myNum(int a, int b) {
		
		if(b>a) {
		return b+myNum(a,b-1); 
		}
		else
			return b;
	}
	
	public static void main(String[] args) {
		int result = myNum(6,10);
		System.out.println(result);
	}

}
