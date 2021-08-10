package assignment2;

/**
 * The Box class extends the Package class and creates
 * object with parameterized weight and tracking number
 * 
 *  @author Hao Yi Liu
 *	@since 2021-27-07
 */
public class Box extends Package{
	/**
     *The constructor must be public in order to be used outside of the package (in the driver and in other packages)
     */
	public Box(){
		this.type="";
		this.maxWeight=0;
		this.weight=0;
		this.shippingCost=0;
		   	 
	}
	/**
     *The constructor must be public in order to be used outside of the package (in the driver and in other packages)
     *
     *The parameterized constructor is used when the driver uses the same type of parameters
     *
     *@param weight
     * takes in a value of weight in double
     *
     */
	public Box(double weight) {
		
		this.type="Box";
		this.maxWeight=40;
		this.weight=weight;
		this.shippingCost=Math.min(this.maxWeight*2,2*weight);	
	}
	/**
     *The constructor must be public in order to be used outside of the package (in the driver and in other packages)
     *
     *The parameterized constructor is used when the driver uses the same type of parameters
     *
     * @param weight
     * takes in a value of weight in double
     * 
     * @param trackNum
     * takes in a string of tracking number 
     */
	public Box(double weight, String trackNum) {
		
		this.type="Box";
		this.maxWeight=40;
		this.weight=weight;
		this.shippingCost=Math.min(this.maxWeight*2,2*weight);	
		this.trackNum=trackNum;
	}
	/**
     *The constructor must be public in order to be used outside of the package (in the driver and in other packages)
     *
     *The box constructor creates a copy constructor
     *
     *@param b
     * takes in an object of Box
     *
     */
	public Box(Box b) {
		
		type=b.type;
		maxWeight=b.maxWeight;
		weight=b.weight;
		shippingCost=b.shippingCost;
		trackNum=b.trackNum;
	}
	/**
     *The method must be public in order to be used outside of the package 
     *
     *this sets the tracking number with both origin and destination cities and ends with 1
     *
     *@param truck
     *takes in a Truck object
     *
     */
	public void setTrackingNumber(Truck truck) {
		
		trackNum=truck.getOriginCity()+"_"+truck.getDestinationCity()+"_"+"1";
	}
	/**
     *The method must be public in order to be used outside of the package 
     *
     *it returns the tracking number when the method is called
     *
     *@param truck
     *takes in a Truck object
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
     *it returns the weight in pounds of the box
     *
     *@return weight
     *returns the weight in pounds of the box
     */
	public double getWeightInPounds() {
		
		return this.weight;
	}
	
	
}
	
