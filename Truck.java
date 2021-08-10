package assignment2;

import java.util.Scanner;
/**
 * The Truck class runs code from the other classes to test for
 * the accuracy of the packages' type, weight, price, etc. It also contains new 
 * methods that allows to check for exceptions, to load and unload packages, to have the driver's route,
 * to get the number of packages, etc. 
 * 
 * classes must be public in order to be accessible to other classes and other packages
 * 
 */
public class Truck {
	Scanner keyboard = new Scanner(System.in);
	private String driverName;
	private String originCity;
	private String destinationCity;
	private double grossWeight;
	private double unloadedWeight;
	private double grossIncome=0;
	private int numOfPackages=0;
	private int inputNumber=0;
	private String addInfo;
	private Package[] loadedPackages= new Package[200]; // CHANGE MAX NUM TO 200
	
	/**
     *The constructor must be public in order to be used outside of the package (in the driver and in other packages)
     *
     */
	public Truck(){
			
		this.driverName="";
		this.unloadedWeight=0;
		this.originCity="";
		this.destinationCity="";
		   	 
	}
	/**
     *The constructor must be public in order to be used outside of the package (in the driver and in other packages)
     *
     *The parameterized constructor is used when the driver uses the same type of parameters
     *
     *@param driver
     *takes in the string of driver name
     *
     *@param unloadedWeight
     *takes in a double value of the unloaded weight
     *
     *@param origin
     *takes in the string of the origin city
     *
     *@param destination
     *takes in the string of the destination city
     *
     */
	public Truck(String driver, double unloadedWeight, String origin, String destination) {
		
		this.driverName=driver;
		this.unloadedWeight=unloadedWeight;
		this.originCity=origin;
		this.destinationCity=destination;
	}
	/**
     *The constructor must be public in order to be used outside of the package (in the driver and in other packages)
     * The Truck constructor creates a copy constructor.
     * 
     * @param tr
     * takes an object of Truck
     */
    public Truck (Truck tr){
    	
   	    driverName=tr.driverName;
		unloadedWeight=tr.unloadedWeight;
		originCity=tr.originCity;
		destinationCity=tr.destinationCity;
   	    
    }
    /**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method converts pounds to kilograms
	 * 
	 * @param pounds
	 * takes in value of pounds in double
	 * 
	 * @return pounds
	 * returns the weight in kilograms
	 */
	public double toKilograms(double pounds){
		
		return pounds*0.45;
	}
	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method converts kilograms to pounds
	 * 
	 * @param kilograms
	 * takes in value of kilograms in double
	 * 
	 * @return kilograms
	 * returns the weight in pounds
	 */
	public double toPounds(double kilograms) {
		
		return kilograms/0.45;
	}
	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method returns the gross income of the truck
	 *
	 *@return grossIncome
	 *returns the gross income of the truck
	 */
	public double getGrossIncome() {
		
		return grossIncome;
	}
	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method sets the gross income of the truck
	 * 
	 * @param grossIncome
	 * takes in a value of gross income in double
	 */
	public void setGrossIncome(double grossIncome) {
		
		this.grossIncome = grossIncome;
	}
	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method returns the gross weight of the truck
	 * 
	 * @return grossWeight
	 * returns the gross weight 
	 */
	public double getGrossWeight() {
		
		return this.grossWeight;
	}
	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method sets the gross weight of the truck
	 * 
	 * @param grossWeight
	 * takes in a value of gross weight in double
	 */
	public void setGrossWeight(double grossWeight) {
		
		this.grossWeight = grossWeight;
	}
	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method returns arrays of package when called
	 * 
	 * @return loadedpPackages
	 * returns arrays of package
	 */
	public Package[] getLoadedPackages() {
		
		return loadedPackages;
	}
	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method sets the array
	 * 
	 * @param loadedPackages
	 * takes in value of arrays of Package
	 */
	public void setLoadedPackages(Package[] loadedPackages) {
		
		this.loadedPackages = loadedPackages;
	}
	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method returns the name of the driver
	 * 
	 * @return driverName
	 * returns a string of the driver's name
	 */
	public String getDriverName() {
		
		return driverName;
	}

	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method sets the driver's name
	 * 
	 * @param driverName
	 * takes in the driver's name in String
	 */
	public void setDriverName(String driverName) {
		
		this.driverName = driverName;
	}

	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method returns the originating city
	 * 
	 * @return originCity
	 * returns the originating city in string
	 */
	public String getOriginCity() {
		
		return originCity;
	}

	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method sets the originating city
	 * 
	 * @param originCity
	 * takes in value of origin city in string
	 */
	public void setOriginCity(String originCity) {
		
		this.originCity = originCity;
	}

	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method returns the destination city
	 * 
	 * @return destinationCity
	 * returns the destination city in a string
	 */
	public String getDestinationCity() {
		
		return destinationCity;
	}

	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method sets the destination city
	 * 
	 * @param destinationCity
	 * takes in string of the destination city
	 */
	public void setDestinationCity(String destinationCity) {
		
		this.destinationCity = destinationCity;
	}

	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method returns the unloaded weight of the truck
	 * 
	 * @return unloadedWeight
	 * returns the unloaded weight of the truck
	 */
	public double getUnloadedWeight() {
		
		return this.unloadedWeight;
	}

	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method sets the unloaded weight of the truck by converting the weight entered in kilograms to pounds
	 * 
	 * @param unloadedWeight
	 * takes in value of the unloaded weight in double
	 */
	public void setUnloadedWeight(double unloadedWeight) {
		
		this.unloadedWeight = toPounds(unloadedWeight);
	}

	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method returns the number of packages
	 * 
	 * @return numOfPackages
	 * returns the number of packages in integer
	 */
	public int getNumOfPackages() {
		
		return numOfPackages;
	}

	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method sets the number of packages
	 * 
	 * @param numOfPackages
	 * takes in value of the number of packages in integer
	 */
	public void setNumOfPackages(int numOfPackages) {
		
		this.numOfPackages = numOfPackages;
	}

	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method returns the additional info
	 * 
	 * @return addInfo
	 * returns the additional information
	 */
	public String getAddInfo() {
		
		return addInfo;
	}

	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method sets the additional info
	 * 
	 * @param addInfo
	 * takes in string of additional information
	 */
	public void setAddInfo(String addInfo) {
		
		this.addInfo = addInfo;
	}
	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method check the space availability into the truck to see if the maximum number of packages has been reached
	 * if it has, it will throw an exception that warns the user that the truck is full and the package was not loaded
	 * 
	 * @param p
	 * takes in object of Package
	 * 
	 * @return true
	 * returns true if the maximum number of packages has not been reached
	 */
	public boolean checkSpace(Package p) {
		
		try {
			if (numOfPackages>=loadedPackages.length) 
			{
				throw new PackageException("Error. This truck is full and your package was not loaded."+
						"\n"+p.type+"\n"+p.trackNum+"\n"+p.weight
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
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method returns arrays of packages to load
	 * 
	 * @param packagesToLoad
	 * takes in object of array Package
	 * 
	 */
	public void loadPackages(Package[] packagesToLoad) {
		
		for(Package p: packagesToLoad) {
			if (p.checkWeight() && p.checkType() && this.checkSpace(p)) {
				loadedPackages[numOfPackages++]=p;
				this.grossWeight += p.getWeightInPounds();
				this.grossIncome +=p.shippingCost;
				
			}
		}
	}
	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method updates for each object of the package at a time
	 * 
	 * @param p
	 * takes in object of Package
	 * 
	 */
	public void loadPackage(Package p) {
		
		if (p.checkWeight() && p.checkType() && this.checkSpace(p)) {
			loadedPackages[numOfPackages++]=p;
			this.grossWeight += p.getWeightInPounds();
			this.grossIncome +=p.shippingCost;
		}
	}

	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method prints the route that the driver takes
	 */
	public void drive() {
		
		System.out.print(this.driverName+" is driving from "+this.originCity+" to "+this.destinationCity);
	}
	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method unloads everything in the truck
	 */
	public void unloadTruck() {
		
		this.grossWeight=this.unloadedWeight;
		this.loadedPackages= new Package[this.loadedPackages.length];
		this.numOfPackages=0;
	}
	/**
	 * the method must be public in order for other class to gain accessibility
	 * 
	 * the method unloads a package at a time
	 * 
	 * @param i
	 * takes an integer as a value
	 */
	public void unloadPackage(int i) {
		
		this.grossWeight -= loadedPackages[i].weight;
		this.grossIncome -= loadedPackages[i].shippingCost;
		numOfPackages--;
		System.out.println("\nYou have unloaded the package "+i+": "+loadedPackages[i].toString());
		loadedPackages[i]=null;
		for (int j=i+1; j<loadedPackages.length;j++) {
			loadedPackages[j-1]=loadedPackages[j];
				
		}
		
	}
}


