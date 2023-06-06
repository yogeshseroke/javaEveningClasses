package javaClassEvening;

public class InheritanceExampleMain extends InheritanceExample2{

	void c() {
		System.out.println("method of sub child ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//before inheritance..
//		InheritanceExample1 obj = new InheritanceExample1();
//		obj.a();
		
//		obj.b(); wrong
		
		//InheritanceExample2 obj1 = new InheritanceExample2();
		//obj1.b();
		
//		obj1.a();wrong
		
		//after inheritance...
		//obj1.a();
		//obj1.b();
		
		InheritanceExampleMain obj = new InheritanceExampleMain();
		obj.a();
		obj.b();
		obj.c();
	}

}
