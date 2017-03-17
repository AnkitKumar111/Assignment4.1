
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Child();
		p.method2();
	}
}


/*correct option is c:
 
            explanation:
            
p.method2();
is a call of method2() using a Parent reference that refers to a Child object.
Since Child did not implement a method2() the only one that we have was inherited 
from Parent, so it gets called and we get the printout 
"Parent's method2()".
 After the print a call is made to method1(). The question is, which one?
 the method1() in Parent is private so Child can NOT inherit it. 
 However, Child has implemented a method1() with the same signature, same return type,
 but it is marked public.
 so this is NOT overriding.As we can not override a private method.

 */
             