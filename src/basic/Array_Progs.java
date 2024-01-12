package basic;

public class Array_Progs {
	
	public static void arrayprogs()
	{
		String[] cars = {"BMW","Volvo","Mercidies","MG"};
		System.out.println(cars[1]);
	}
	
	public static void allcars()
	{
		String[] friends = {"Anil","Rahul","Zams"};
		for(int i=0; i <= 2;i++)
		{
			System.out.println(friends[i]);
		}
	}
	
	public static void froeach()
	{
		String[] fruits= {"sapple","banana","pomogranade"};
		for(String i : fruits)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		arrayprogs();
		allcars();
		froeach();
		
	}
	
}
