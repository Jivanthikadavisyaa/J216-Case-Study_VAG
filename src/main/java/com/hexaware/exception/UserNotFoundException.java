package com.hexaware.exception;
/**
 * Exception thrown when a user is not found.
 */

public class UserNotFoundException extends Exception {
	 /**
     * Constructs a UserNotFoundException with the specified detail message.
     * @param message the detail message
     */
	
	public UserNotFoundException(String message) {
	super(message);

}
}