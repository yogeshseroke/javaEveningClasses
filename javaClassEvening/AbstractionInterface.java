package javaClassEvening;

public class AbstractionInterface implements AbstractionInterfaceExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractionInterface obj = new AbstractionInterface();
		obj.m3();
		obj.m1();
		
		AbstractionInterfaceExample.m2();
		
	}

	@Override
	public void m3() {
	  System.out.println("abstract method");
	}

}
