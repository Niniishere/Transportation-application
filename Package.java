package assignment2;
/**
 * 
 * the package class is abstract since it will be used to extend subclasses that will inherit its elements
 * 
 */
public abstract class Package {
	/**
	 * 
     * Package's instances are set to be protected, but not private since
     * they have to be accessible by the subclasses that are extended from the parent class 
     * (a subclass does not inherit private members from the superclass)
     * 
     * Initiation of the variables of Package
     */
	protected String trackNum;
	protected double weight;
	protected double shippingCost;
	protected double maxWeight;
	protected String type;
	
	/**
	 * 
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method converts pounds to ounces
	 * 
	 * @param pounds
	 * takes in a value of pounds in double
	 * 
	 * @return weight
	 * returns the value of weight in pounds and converts it to ounces
	 * 
	 */
	public double toOunces(double pounds){
		
		return 16*pounds;
	}
	/**
	 * 
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method converts ounces to pounds
	 * @param ounces
	 * takes in a value of ounces in double
	 * 
	 * @return weight
	 * returns the value of weight in ounces and converts it to pounds
	 */
	public double toPoundsFromOunces(double ounces) {
		
		return ounces/16;
	}
	/**
	 * 
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method converts pounds to kilograms
	 * 
	 * @param pounds
	 * takes in a value of pounds in double
	 * 
	 * @return weight
	 * returns the value of weight in pounds and converts it to kilograms
	 */
	public double toKilograms(double pounds){
		
		return pounds*0.45;
	}
	/**
	 * 
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method converts kilograms to pounds
	 * 
	 * @param kilograms
	 * takes in a value of kilograms in double
	 * 
	 * @return weight
	 * returns the value of weight in kilograms and converts it to pounds
	 */
	public double toPounds(double kilograms) {
		
		return kilograms/0.45;
	}
	/**
	 * 
     *The accessor method must be public in order to be used outside of the package 
     *
     *@return weight
     *returns the value of weight of the package in pounds
     *
     */
	public double getWeightInPounds() {
		
		return this.weight;
	}
	/**
	 * 
	 * the method checkWeight() must be public to be accessible in other classes
	 * 
	 * it checks the package weight to make sure it doesn't exceed the maximum weight
	 * 
	 * otherwise it will throw an exception and display a message to warn the user that the package is too heavy for its type
	 * 
	 * @return true 
	 * returns true if the weight doesn't exceed the maximum weight allowed depending for the class
	 * 
	 */
	public boolean checkWeight() {
		
		try {
		if (this.weight>this.maxWeight) {
			throw new PackageException("Error: This package is too heavy."+
					"\n"+this.type+"\n"+this.trackNum+"\n"+this.weight
					);
		}
		}
		catch(PackageException e)
        {
            String message = e.getMessage();
            System.out.println(message);
            return false;
        }
		return true;
	}
	/**
	 * 
	 * the method checkType() must be public to be accessible in other classes
	 * 
	 * it checks the package type to make sure it is a valid type
	 * 
	 * If the type is an unknown type, it will throw an exception that will print a message to display to warn the user
	 * 
	 * @return true
	 * returns true if the type is valid 
	 * 
	 */
	public boolean checkType() {
		
		try {
			if (this.type!="Box" && this.type!="Letter" 
				&& this.type!="MetalCrate" && this.type!="WoodCrate") 
			{
				throw new PackageException("Error: This package type is unknown."+
						"\nUnknown type\n"+this.trackNum+"\n"+this.weight
						);
			}
			}
			catch(PackageException e)
	        {
	            String message = e.getMessage();
	            System.out.println(message);
	            return false;
	        }
			return true;
		}
	/**
	 * 
     *The toString method must be public in order to be used outside of the package (especially in the
     *driver when we have to use the toString methods to display our values)
     *
     *It displays the values defined and display the name of the class depending on the class it refers to
     *
     */
	public String toString(){
		
		return "The type is "+this.type+". The tracking number is "+this.trackNum+". The weight is "+this.getWeightInPounds()+" pounds.";
	}
}



	

	


