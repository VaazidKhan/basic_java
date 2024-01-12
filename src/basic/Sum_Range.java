package basic;

public class Sum_Range {
	
	static int myNum(int k) {
		
		if (k>0) {
			return k + (myNum(k-1));
			
		}
		else 
			return 0;
	}
	public static void main(String[] args) {
		int result = myNum(1000);
		System.out.println(result);
	}

}
