/*
 * LOGOS IT ACADEMY
 * */

package ua.lviv.lgs.task002;

/*
 * Selfmade class to work with exception
 * */

public class MyException extends Exception {

	/**
	 * @param String message
	 * @return void;
	 */
	private String message;

	public MyException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
