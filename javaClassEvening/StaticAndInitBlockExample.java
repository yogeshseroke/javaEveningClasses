package javaClassEvening;

public class StaticAndInitBlockExample {

	
	//Init block.... -> non-static variable initialize or value assignment
	
	//int a, b, c;// declaration
	
	//init block
//	{
//		a = 1;//value assign
//		b = 2;
//	}
//	
//	void add() {
//		c = a + b;
//	}
//	
//	void display() {
//		System.out.println(c);
//	}
	
	
	//===============================================
	
	//static block... -> static variable initialize or value assignment
	
//	static int a,b,c;//declaration
//	
//	static  //static block...
//	{
//		a=1;//value assignment
//		b=2;
//	}
//	
//	void add() {
//		c = a+b;
//	}
//	
//	void display() {
//		System.out.println(c);
//	}
	
	//============================================
	//(smic)s,m,i,c
	//4 constructor, 1 | 2 | 2 | 4 
	//1 static block,3 | 4 | 3 | 3
	//3 init block,  4 | 3 | 4 | 2
	//2 main()       2 | 1 | 1 | 1
//	static
//	{
//		System.out.println("static block...");
//	}
//	
//	{
//		System.out.println("init block...");
//	}
//	
//	StaticAndInitBlockExample() {
//		System.out.println("constructor...");
//	}
//	
//	static {
//		System.out.println("static 2...");
//	}
	public static void main(String[] args) {


		
		//static int a,c,b;
//	System.out.println("main method...");
//		
//	StaticAndInitBlockExample obj = new StaticAndInitBlockExample();

	
	
	//	obj.add();
//	obj.display();
		
	}
	
//	static {
//		System.out.println("static 3...");
//	}

}
