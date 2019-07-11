/*
 * LOGOS IT ACADEMY
 * */
package ua.lviv.lgs.task002;

public class Application  {

	public static void main(String[] args) throws MyException, IllegalAccessException {
		
		Methods x =  new Methods(5, 5);
		x.Addition();;
		x.Subtraction();
		x.Multiplication();
		x.Division();
	}
}
