package javaClassEvening;

public class AbstractionExample extends AbstractionClassExample{

	
	/*
	 *   Abstraction :- Data Hiding...
	 *   
	 *   We can implement abstraction using three different ways...
	 *   
	 *    (1) Access specifier :- public, private, protected, default 
	 *
	 *    (2) Abstract class :- abstract class A{
	 *    
	 *    							abstract void method();
	 *    
	 *    							static void method(){
	 *    
	 *    							}
	 *    
	 *    							void method(){
	 *    
	 *    							}			
	 *    
	 *    						}
	 *    
	 *    (3) Interface... :- pure abstract class....
	 *                     :- implements keyword
	 *                     only abstract method...
	 *               before jdk-(1.8)...                  
	 *                     interface A{
	 *                         void method();
	 *                     }
	 *                     
	 *               after jdk-(1.8)...
	 *               
	 *                     interface A{
	 *                       void method();
	 *                       
	 *                       default void method(){
	 *                       
	 *                       }
	 *                       
	 *                       static void method(){
	 *                       
	 *                       }
	 *                     }
	 * 				
	 *     note:- we can't create object for interface and abstract class.
	 * */
	
	//public :- global
	//private :- within a class
	//default :- within a same package
	//protected :- same package, different package(only sub/child-class)
	
//	public void m1() {
//		System.out.println("public method");
//	}
//	
//	private void m2() {
//		System.out.println("private method");
//	}
//	
//	void m3() {
//		System.out.println("default method");
//	}
//	
//	protected void m4() {
//		System.out.println("protected method");
//	}
	
	public static void main(String args[]) {
	
		AbstractionExample obj = new AbstractionExample();
		obj.m3();
	}

	@Override
	void m3() {
		System.out.println("abstract method..");
	}
}
