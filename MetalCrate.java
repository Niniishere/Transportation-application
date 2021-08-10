package assignment2;

/**
 * The MetalCrate class extends the Package class and creates
 * object with parameterized weight and tracking number
 * 
 *  @author Hao Yi Liu
 *	@since 2021-27-07
 */
public class MetalCrate extends Package {
	/**
     *The default constructor must be public in order to be used outside of the package (in the driver and in other packages)
     *
     */
	public MetalCrate() {
		
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
     * takes in a value of weight in double
     *
     */
	public MetalCrate(double weight) {
		
		this.maxWeight=100;
		this.weight=weight;
		this.shippingCost=Math.min(this.maxWeight*3.00,3.00*weight);
		this.type="MetalCrate";
		
		
	}
	/**
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
	public MetalCrate(double weight, String trackNum) {
		
		this.maxWeight=100;
		this.weight=weight;
		this.shippingCost=Math.min(this.maxWeight*3.00,3.00*weight);
		this.type="MetalCrate";
		this.trackNum=trackNum;
	}
	/**
     *The constructor must be public in order to be used outside of the package (in the driver and in other packages)
     *
     *The box constructor creates a copy constructor
     *
     *@param me
     * takes in an object of MetalCrate
     *
     */
	public MetalCrate(MetalCrate me) {
		
		maxWeight=me.maxWeight;
		weight=me.weight;
		shippingCost=me.shippingCost;
		type=me.type;
		trackNum=me.trackNum;
	}
	/**
     *The method must be public in order to be used outside of the package 
     *
     *this sets the tracking number with both origin and destination cities and ends with 3
     *
     *@param truck
     *takes in a Truck object
     */
	public void setTrackingNumber(Truck truck) {
		
		trackNum=truck.getOriginCity()+"_"+truck.getDestinationCity()+"_"+"3";
	}
	/**
     *The method must be public in order to be used outside of the package 
     *
     *it returns the tracking number of the metal crate
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
     *it returns the weight in pounds of the metal crate
     *
     *@return weight
     *returns the weight in pounds of metal crate
     */
	public double getWeightInPounds() {
		
		return this.weight;
	}
	

}