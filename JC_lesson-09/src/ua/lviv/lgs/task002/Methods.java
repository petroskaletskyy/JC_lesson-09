/*
 * LOGOS IT ACADEMY
 * */
package ua.lviv.lgs.task002;

public class Methods {

	// Local variables
	static double a;
	static double b;

	// Constructor
	public Methods(double a, double b) throws MyException {
		super();
		this.a = a;
		this.b = b;
	}

	// Exceptions
	public static void choice() throws MyException, IllegalAccessException {

		if ((a < 0) && (b < 0)) {
			throw new IllegalArgumentException();
		}

		if (((a == 0) && (b != 0)) || ((a != 0) && (b == 0))) {
			throw new ArithmeticException();
		}

		if ((a == 0) && (b == 0)) {
			throw new IllegalAccessException();
		}

		if ((a > 0) && (b > 0)) {
			throw new MyException("Parameters do not match the input data...");
		}
	}

	// Class that make the addition
	/**
	 * @param double a,
	 * @param double b,
	 * @return void
	 * @throws MyException
	 * @throws IllegalAccessException 
	 */
	public void Addition() throws MyException, IllegalAccessException {
		Methods.choice();
		System.out.println("a + b = " + (a + b));
	}

	// Class that make the substraction
	/**
	 * @param double a,
	 * @param double b,
	 * @return void
	 * @throws MyException
	 * @throws IllegalAccessException 
	 */
	public void Subtraction() throws MyException, IllegalAccessException {
		Methods.choice();
		System.out.println("a - b = " + (a - b));
	}

	// Class that make the multiplication
	/**
	 * @param double a,
	 * @param double b,
	 * @return void
	 * @throws MyException
	 * @throws IllegalAccessException 
	 */
	public void Multiplication() throws MyException, IllegalAccessException {
		Methods.choice();
		System.out.println("a * b = " + (a * b));
	}

	// Class that make the division
	/**
	 * @param double a,
	 * @param double b,
	 * @return void
	 * @throws IllegalAccessException 
	 * @throws MyException
	 */
	public void Division() throws IllegalAccessException, MyException {
		Methods.choice();
		System.out.println("a / b = " + (a / b));
	}

}
