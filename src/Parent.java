
public class Parent {
	private void method1(){
		 System.out.println ("Parent's method1()");
		}
		public void method2() {
		 System.out.println ("Parent's method2()");
		method1();
		}
		}
		class Child extends Parent {
		 public void method1() {
		 System.out.println ("Child's method1()");
		} 
		}
		
		

