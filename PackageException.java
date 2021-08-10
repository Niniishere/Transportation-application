package assignment2;
/**
 *The class must be public in order to be used outside of the package 
 *
 */
public class PackageException extends Exception {
	/**
     *The accessor method must be public in order to be used outside of the package 
     *
     *it refers to the message displayed in the parent class
     *
     *@param message
     *takes in a value of the message in string
     */
	public PackageException(String message) {
		
		super(message);
	}
	

}