package javaClassEvening;


public class InnerClasses {//outer class...
	
	//method of outer class...
	static void m() {
		System.out.println("method of outerClass is m()");
	}
	
	
	
	static class A{//inner class...1 or outer-inner
	
		static void m1() {
			System.out.println("method of A is m1()");
		}
		
		class A_a{//inner class of A
			void m1_1() {
				System.out.println("method of inner class A_a is m1_1()");
			}
		}
	}
	
	class B{//inner class...2
		void m2() {
			System.out.println("method of B is m2()");
		}
	}

	
	public static void main(String args[]) {
			InnerClasses obj = new InnerClasses();
//			obj.m();
//		
//			obj.new B().m2();
//		 
//			obj.new A().m1();
			
//			InnerClasses.m();
//			
//			InnerClasses.A.m1();
			
//		A obj1 = new A();
//		
//		obj1.new A_a().m1_1();
	}
	
}
