package basic;

public class Prime_Number {

	public static void prime() {
		
		for(int i=1;i<=100;i++)
		{
			int count = 0;
			for (int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}}
				if (count == 2)
				{
					System.out.println("Prime number : "+i);
				
			}
		}
	}
	
	public static void main(String[] args) {
		prime();
		
	}
	
}
