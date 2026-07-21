/*Classes Inheritance_ClassA, Inheritance_ClassB and Inheritance_Child are all connected
*/

package basicSelenium;


//Common way to get method from Inheritance_Class A

/*
 * public class Inheritance_ClassB {
 * 
 * public static void main(String[] args) {
 * 
 * //Common way to get method from Inheritance_Class A
 * 
 * Inheritance_ClassA obj = new Inheritance_ClassA();
 * obj.methodfromInheritance_ClassA(); }
 * 
 * }
 */


//Using Inheritance

public class Inheritance_ClassB extends Inheritance_ClassA { //Inheritance_ClassB = Inheritance_ClassA + Inheritance_ClassB
	//Class A is parent and classB is child
	

	public static void main(String[] args) {
		
	
	Inheritance_ClassB obj = new Inheritance_ClassB();
	obj.methodfromInheritance_ClassA();
 System.out.println("Method from class B");




}

}