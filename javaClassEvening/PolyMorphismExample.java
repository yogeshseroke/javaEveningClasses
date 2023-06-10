package javaClassEvening;

public class PolyMorphismExample extends PolyMorphismOverridingExample{

	/*
	 *     polymorphism :- reusability
	 *     
	 *     static/compile time polymorphism :- overloading
	 *     
	 *     (1)method name = same
	 *     
	 *     (2)parameter different
	 *     
	 *     void logic(int a, int b){
	 *          a+b;
	 *     }
	 *     void logic(float a, int b){
	 *          a+b;
	 *     }
	 *     void logic(int a, float b){
	 *          a+b;
	 *     }
	 *     void logic(float a, float b){
	 *          a+b;
	 *     }
	 *     
	 *     non-static/run time polymorphism :- overriding
	 * 
	 * 		class A{
	 * 			
	 * 			void logic(){
	 *             a+b;
	 *     		}
	 *     
	 * 		}	
	 * 		class B extends A{
	 * 			void logic(){
	 * 				a*b;
	 * 			} 
	 * 		}
	 * */
	
	//overloading....
	
	
	
	void logic(int a, int b) {
		
		System.out.println(a+b);
	}
	
    void logic(int p, int r, int t) {
		
		System.out.println((p*r*t)/100);		
	}
    void logic(float a, int b) {
		
		System.out.println(a*b);
	}
    
    //=============================================
    	
    //overriding....
    
    void logic() {
    	System.out.println("child method");
    }
    
    public static void main(String args[]) {
    	
    	PolyMorphismExample obj = new PolyMorphismExample();
//    	obj.logic(20000, 2, 1);
//    	obj.logic(2, 2);
//    	obj.logic(2.3f, 45);
    	
    	//overriding....
    	
//    	PolyMorphismOverridingExample obj1 = new PolyMorphismOverridingExample();
//    	obj1.logic();
    	obj.logic();
    }
}
