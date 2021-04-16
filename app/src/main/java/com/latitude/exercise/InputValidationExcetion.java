package com.latitude.exercise;

public class InputValidationExcetion extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4393149630518709061L;

	/**
     * Constructs a new exception with {@code null} as its detail message.
     */
	InputValidationExcetion() {
		super();
	}
	
	/**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param   message   the detail message.
     */
	InputValidationExcetion(String message) {
        super(message);
    }
	
}
