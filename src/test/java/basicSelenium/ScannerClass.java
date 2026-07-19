/*Scanners are used to read inputs from the console*/
package basicSelenium;


import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner myscanobj = new Scanner(System.in); // creates scanner object
	
	System.out.println("Enter your Name");	
	String myname = myscanobj.nextLine();
	System.out.println("Your Name is "+myname);
	
	System.out.println("Enter your age");
	int myage = myscanobj.nextInt();
	System.out.println("Your age = "+myage);
	}

}
