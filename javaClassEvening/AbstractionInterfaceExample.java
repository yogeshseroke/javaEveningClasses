package javaClassEvening;

public interface AbstractionInterfaceExample {

	//default method
	default void m1() {
		System.out.println("default method");
	}
	
	//static method
	static void m2() {
		System.out.println("static method");
	}
	
	//abstract method
	void m3();
}
