
/*Example for method overriding
Method_Overriding_Vehicle and Method_Overriding_Benz are connected*/

package basicSelenium;

public class Method_Overriding_Benz extends Method_Overriding_Vehicle {
	
	public void make() {
		 System.out.println("Mercedes Benz");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_Overriding_Benz b = new Method_Overriding_Benz();
		b.make();
		b.year();
		
	}

}
