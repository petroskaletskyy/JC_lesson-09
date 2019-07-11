/*
 * LOGOS IT ACADEMY
 * */

package ua.lviv.lgs.task001;

/*
 * Selfmade class to work with exception
 * */

public class WrongInputConsoleParametersException extends Exception {

	/**
	 * @param String message
	 * @return void;
	 */
	private String message;

	public WrongInputConsoleParametersException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
