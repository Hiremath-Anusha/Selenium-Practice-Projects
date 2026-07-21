package basicSelenium;

public class Inheritance_ClassC extends Inheritance_ClassB{
	// Class B is parent and Class C is child
	
	public void methodfromInheritance_ClassC() {
		
		System.out.println("Method from Inheritance_ClassC");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance_ClassC obj = new Inheritance_ClassC();
		obj.methodfromInheritance_ClassA();
		
	
	}

}
