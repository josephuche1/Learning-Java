
public class C extends A{
   public B newB = new B();
   
   public void b() {
	   System.out.println("I am the overridden method of class B");
   }
   
   public void a() {
	   System.out.println("I am the overridden method of class A");
   }
}
