package assignment2;

/**
 * The WoodCrate class extends the Package class and creates
 * object with parameterized weight and tracking number
 * 
 *  @author Hao Yi Liu
 *	@since 2021-27-07
 */
public class WoodCrate extends Package {
	/**
	 * 
     *The default constructor must be public in order to be used outside of the package (in the driver and in other packages)
     *
     */
	public WoodCrate() {
		this.maxWeight=0;
		this.weight=0;
		this.shippingCost=0;
		this.type="";
		
		
	}
	/**
	 * 
     *The constructor must be public in order to be used outside of the package (in the driver and in other packages)
     *
     *The parameterized constructor is used when the driver uses the same type of parameters
     *
     *@param weight
     *takes in a value of weight in double
     */
	public WoodCrate(double weight) {
		
		this.maxWeight=80;
		this.weight=weight;
		this.shippingCost=Math.min(this.maxWeight*2.5,2.5*weight);
		this.type="WoodCrate";
		
		
	}
	/**
	 * 
     *The constructor must be public in order to be used outside of the package (in the driver and in other packages)
     *
     *The parameterized constructor is used when the driver uses the same type of parameters
     *
     *@param weight
     * takes in a value of weight in double
     * 
     * @param trackNum
     * takes in the string of tracking number
     *
     */
	public WoodCrate(double weight, String trackNum) {
		
		this.maxWeight=80;
		this.weight=weight;
		this.shippingCost=Math.min(this.maxWeight*2.5,2.5*weight);
		this.type="WoodCrate";
		this.trackNum=trackNum;
		
	}
	/**
	 * 
     *The method must be public in order to be used outside of the package 
     *
     *this sets the tracking number with both origin and destination cities and ends with 2
     *
     *@param truck
     *takes in a Truck object
     */
	public void setTrackingNumber(Truck truck) {
		
		trackNum=truck.getOriginCity()+"_"+truck.getDestinationCity()+"_"+"2";
	}
	/**
	 * 
     *The method must be public in order to be used outside of the package 
     *
     *it returns the tracking number of the wooden crate
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
	 * 
     *The method must be public in order to be used outside of the package 
     *
     *it returns the weight in pounds of the wooden crate
     *
     *@return weight
     *returns the weight of the wooden crate in pounds
     */
	public double getWeightInPounds() {
		
		return this.weight;
	}

}