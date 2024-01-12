package advance;

public class Obj_Word {
	static void myWord() {
		System.out.println("Vaazid");
	}
	
	public void myNum() {
		System.out.println(20);
	}
	
	public int mySenese(int a) {
		return 5+a;
	}
	
	
	public static void main(String[] args) {
		
		//no object needed for static method
		myWord();
		
		//Object needed for non static
		//class name reference variable = new Class name
		Obj_Word num = new Obj_Word();
		//reference variable.method
		num.myNum();
		
		Obj_Word sense = new Obj_Word();
		int b = sense.mySenese(10);
		System.out.println(b);
	}

}
