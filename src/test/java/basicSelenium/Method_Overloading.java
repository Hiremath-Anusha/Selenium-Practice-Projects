/*Polymorphism example
Method Overloading: Calculate simple interest*/

package basicSelenium;

public class Method_Overloading {

	public void calc(int principle, int interest_rate) {

		int Simple_Interest = (principle * interest_rate * 1) / 100;
		System.out.println("Simple Interest for the period of 1 year = " + Simple_Interest);

	}

	public void calc(int principle, int interest_rate, int tenure_years) {

		int Simple_Interest = (principle * interest_rate * tenure_years) / 100;
		System.out.println("Simple Interest for the period " + tenure_years + " years = " + Simple_Interest);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_Overloading m = new Method_Overloading();

		m.calc(20000, 4, 5);

	}

}
