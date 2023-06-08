package javaClassEvening;

public class C implements A,B{

	
	
	public static void main(String[] args) {
		C obj = new C();
		obj.logic();
	}

	@Override
	public void logic() {
		
		System.out.println("child class method");
	}

}
