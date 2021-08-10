package assignment2;

/**
 * The Letter class extends the Package class and creates
 * object with parameterized weight in ounces converted to pounds and tracking number
 * 
 *  @author Hao Yi Liu
 *	@since 2021-27-07
 */
public class Letter extends Package {
	/**
     *The constructor must be public in order to be used outside of the package (in the driver and in other packages)
     */
	public Letter() {
		
		this.maxWeight=0;
		this.weight=0;
		this.shippingCost=0;
		this.type="";
		
	}
	/**
     *The constructor must be public in order to be used outside of the package (in the driver and in other packages)
     *
     *The parameterized constructor is used when the driver uses the same type of parameters
     *
     *@param weight
     *takes an integer value of weight
     */
	public Letter(double weight) {
		 
		this.maxWeight=32;
		this.weight=weight;
		this.shippingCost=Math.min(this.maxWeight*0.05,0.05*weight);
		this.type="Letter";
		
	}
	/**
     *The constructor must be public in order to be used outside of the package (in the driver and in other packages)
     *
     *The parameterized constructor is used when the driver uses the same type of parameters
     *
     *@param weight
     *takes an integer value of weight
     *
     *@param trackNum
     *takes a string of tracking number
     */
	public Letter(double weight, String trackNum) {
		 
		this.maxWeight=32;
		this.weight=weight;
		this.shippingCost=Math.min(this.maxWeight*0.05,0.05*weight);
		this.type="Letter";
		this.trackNum=trackNum;
		
	}
	/**
     *The constructor must be public in order to be used outside of the package (in the driver and in other packages)
     * The Letter constructor creates a copy constructor.
     * 
     * @param l
     * takes an object of Letter
     */
	public Letter(Letter l) {
		
		maxWeight=l.maxWeight;
		weight=l.weight;
		shippingCost=l.shippingCost;
		type=l.type;
		trackNum=l.trackNum;
		
	}
	
	/**
     *The method must be public in order to be used outside of the package 
     *
     *this sets the tracking number with both origin and destination cities and ends with 0
     *
     *@param truck
     *takes in an object of type Truck
     */
	public void setTrackingNumber(Truck truck) {
		
		trackNum=truck.getOriginCity()+"_"+truck.getDestinationCity()+"_"+"0";
	}
	/**
     *The method must be public in order to be used outside of the package
     *
     * it returns the tracking number
     *
     *@param truck
     *takes in an object of type Truck
     *
     *@return trackNum
     *returns the string of the tracking number
     */
	public String getTrackingNumber(Truck truck) {
		
		return this.trackNum;
	}
	/**
     *The method must be public in order to be used outside of the package 
     *
     *it returns the weight in pounds of letter that was entered in ounces
     *
     *@return weight
     *returns the weight in pounds of letter
     */
	public double getWeightInPounds() {
		
		return toPoundsFromOunces(this.weight);
	}
	
}

