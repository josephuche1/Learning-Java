
public class TestOverloadOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        C newC = new C();
        
        newC.b();
        newC.a();
	}

}


// Result 1
// I am class A

// Tried creating and object of class B in class C. Here is the result:
// I am class A
// I am class B

// Result after overriding the method
// I am class A
// I am the overridden method of class B
// I am the overridden method of class A