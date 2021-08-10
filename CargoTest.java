package assignment2;

import java.util.Scanner;

/**
 * The Driver program runs code from the other classes to test for
 * exceptions, inheritance, toString methods, access rights, and 
 * other functionalities of these classes. It mainly displays cases for 
 * the user to choose from and test if all the methods needed work. 
 * 
 *
 * classes must be public in order to be accessible to other classes and other packages
 * 
 * 
 *  @author Hao Yi Liu
 *  @since 2021-27-07
 *  @see Box
 *  @see Letter
 *  @see MetalCrate
 *  @see Package
 *  @see WoodCrate
 *  @see Truck
 *
 */
public class CargoTest {
	
	/**
	 * This is the main method.
	 * 
	 *@param args
	 *This is where String arguments can be passed. 
	 *
	 */
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int choice=0;
		String selection="";
		String input="";
		double inputNumber=0;
		double numberInput=0;
		String answer="";
		int index;
		boolean condition=false;
		Truck testTruck= new Truck("Nana",0.8,"Montreal","Toronto");
		/*
		 * System.out.println("Please enter the driver name: ");
		 * testTruck.setDriverName(input=keyboard.next());
		 * System.out.println("Please enter the unloaded weight: ");
		 * testTruck.setUnloadedWeight(numberInput=keyboard.nextDouble());
		 * System.out.println("Please enter the originating city: ");
		 * testTruck.setOriginCity(input=keyboard.next());
		 * System.out.println("Please enter the destination city: ");
		 * testTruck.setDestinationCity(input=keyboard.next());
		 */
			//Package[] packagesToLoad= new Package[index];
			//Package[] packagesToLoad= {
				 //new Letter(1),
				 //new Box(2),
				 //new MetalCrate(3)
		 //};
			
		 //testTruck.loadTruckWeight(packagesToLoad);
		 //testTruck.loadTruckIncome(packagesToLoad);
		 //System.out.print("\nGross income: "+testTruck.getGrossIncome());
		 //System.out.print("\nGross weight: "+testTruck.getGrossWeight());
		 //testTruck.drive();
		 //testTruck.unloadTruck();
		 
		 
		 System.out.print("\nWhat would you like to do?");
		 
		 System.out.println("\n1. Start a cargo");
		 System.out.println("\na. Driver name ");
		 System.out.println("\nb. Unload weight(kb;lb) ");
		 System.out.println("\nc. Originating city ");
		 System.out.println("\nd. Destination city ");
		 System.out.println("\n2. Load the truck with packages");
		 System.out.println("\na. Package tracking number");
		 System.out.println("\nb. Package weight(oz;lb)");
		 System.out.println("\nc. Package shipping cost");
		 System.out.println("\n3. Unload a package");
		 System.out.println("\n4. The number of the packages loaded");
		 System.out.println("\n5. The gross income earned by shipping of the cargo");
		 System.out.println("\n6. Weight the truck(after it has been completely loaded");
		 System.out.println("\n7. Drive the truck to destination");
		 System.out.println("\n0. To quit");
		 System.out.println("\nPlease enter your choice and press <Enter>: ");
		 /**
		  *displays the menu for the user to select an option
		  */
		 boolean hasCreatedCargo=false; //sets the boolean to false since the cargo has not been created yet
		 while(!condition) { //loops until the user wants to exit the program
			 boolean choiceIsNotNumber=true; 
			 while (choiceIsNotNumber) { //loops until the user has entered an integer input for the menu selection
				 try {
					 	choice=Integer.parseInt(keyboard.next());
					 	//testTruck.setUnloadedWeight(inputNumber); 
					 	choiceIsNotNumber=false;
				 	}
					 catch (NumberFormatException e) { //catch an exception if the user enters an input that is not an integer
						System.out.println("\nThat is a wrong input. Please try again!");
						choiceIsNotNumber=true;
					 }
			 }
			 if (choice < 0 || choice > 7){ //checking if the choice is valid
					System.out.print("\nThat is a wrong input. Please try again!");
			}
			 switch(choice) {//will go to the case the user was asked to select an option form the menu
			 case(1): 
				 System.out.println("\nLet's start a cargo! ");
				 System.out.println("\nEnter the driver's name.");
				 testTruck.setDriverName(input=keyboard.next());
				 System.out.println("\nThe driver's name is "+testTruck.getDriverName());
				 boolean InvalidUnloadedWeightInput=true;
				 while (InvalidUnloadedWeightInput) { //loops until the user has entered an integer or double
					 InvalidUnloadedWeightInput=false;
					 System.out.println("\nEnter the truck's unloaded weight (in kilograms). It will be converted to pounds automatically. The input must be in decimal form.");
					 
					 try {
					 	inputNumber=Double.parseDouble(keyboard.next());
					 	testTruck.setUnloadedWeight(inputNumber); 
					 }
					 catch (NumberFormatException e) {
						System.out.println("\nWrong input. Please enter a double: "); //catch an exception if the user entered something else than a number
						InvalidUnloadedWeightInput=true;
					 }
				hasCreatedCargo=true;
				 }			 
				 System.out.println("\nThe unloaded weight of the truck is "+testTruck.getUnloadedWeight()+" in pounds.");
				 System.out.println("\nThe unloaded weight of the truck is "+testTruck.toKilograms(testTruck.getUnloadedWeight())+" in kilograms.");
				 System.out.println("\nEnter the originating city.");
				 testTruck.setOriginCity(input=keyboard.next());
				 System.out.println("\nThe origin city is "+testTruck.getOriginCity());
				 
				 System.out.println("\nEnter the destinating city name.");
				 testTruck.setDestinationCity(input=keyboard.next());
				 System.out.println("\nThe destination city name is "+testTruck.getDestinationCity());
				 break;//goes back to the menu option
			 case(2):
				 if (hasCreatedCargo) { //will ask to create a cargo first if it has not been done before going to case 2
					 System.out.println("\n2. Let's load the truck with a package.");
					 boolean InvalidTrackNumber=true;
					 while (InvalidTrackNumber) {//this will loop until the user has entered a valid tracking number 
						 System.out.println("Enter the package's tracking number.");
						 String inputTrackNumber=keyboard.next();
						 char lastChar=inputTrackNumber.charAt(inputTrackNumber.length()-1);
						 if (lastChar!='0' && lastChar!='1' && lastChar!='2' && lastChar!='3'){
							InvalidTrackNumber=true;
							System.out.println("\nPlease enter a valid tracking number (must end with 0, 1, 2 or 3).");
						 }
						 else {
							 
							 InvalidTrackNumber=false;
							 boolean InvalidWeight=true;
							 while (InvalidWeight) {
								 switch (lastChar) { //depending on the last digit of the tracking number, it will go to the case corresponding to the type of package
									 case('0'):
										System.out.println("Enter the letter's weight in ounces.");
									 	try {
										 	inputNumber=Double.parseDouble(keyboard.next());
										 	Letter newLetter=new Letter(inputNumber,inputTrackNumber);
										 	InvalidWeight=false;
										 	testTruck.loadPackage(newLetter);
										 }
										 catch (NumberFormatException e) {
											System.out.println("\nWrong input. Please enter a double: ");//catches an exception if the user has not entered a double or integer
											InvalidWeight=true;
										 }
										 break;
									 case('1'):
										 System.out.println("Enter the box's weight in pounds.");
									 	try {
										 	inputNumber=Double.parseDouble(keyboard.next());
										 	Box newBox=new Box(inputNumber,inputTrackNumber);
										 	InvalidWeight=false;
										 	testTruck.loadPackage(newBox);
										 }
										 catch (NumberFormatException e) {
											System.out.println("\nWrong input. Please enter a double: ");//catches an exception if the user has not entered a double or integer
											InvalidWeight=true;
										 }
										 break;
									 case('2'):
										 System.out.println("Enter the wooden crate's weight in pounds.");
									 	try {
										 	inputNumber=Double.parseDouble(keyboard.next());
										 	WoodCrate newWoodCrate=new WoodCrate(inputNumber,inputTrackNumber);
										 	InvalidWeight=false;
										 	testTruck.loadPackage(newWoodCrate);
										 }
										 catch (NumberFormatException e) {
											System.out.println("\nWrong input. Please enter a double: ");//catches an exception if the user has not entered a double or integer
											InvalidWeight=true;
										 }
										 break;
									 case('3'):
										 System.out.println("Enter the metal crate's weight in pounds.");
									 	try {
										 	inputNumber=Double.parseDouble(keyboard.next());
										 	MetalCrate newMetalCrate=new MetalCrate(inputNumber,inputTrackNumber);
										 	InvalidWeight=false;
										 	testTruck.loadPackage(newMetalCrate);
										 }
										 catch (NumberFormatException e) {
											System.out.println("\nWrong input. Please enter a double: ");//catches an exception if the user has not entered a double or integer
											InvalidWeight=true;
										 }
										 break;
								 }
							 }
							 System.out.println("\nThe shipping price is: "+testTruck.getGrossIncome()+"$.");
							 System.out.println("\nThe truck is currently loaded with "+testTruck.getNumOfPackages()+" packages, you have "+(testTruck.getLoadedPackages().length-testTruck.getNumOfPackages())+" spaces left on the truck.");
							 //DISPLAY SHIPPING PRICE
							 //DISPLAY THE TRUCK WAS LOADED WITH THIS, YOU HAVE X SPACE LEFT ON THE TRUCK
						 }
					 }
					 
				/* System.out.println("\na. Package tracking number");
				 System.out.println("\nb. Package weight(oz;lb)");
				 System.out.println("\nc. Package shipping cost");
					 switch(selection=keyboard.next()) {
					 case("a"):
						//System.out.println("\na. Package tracking number: "+testTruck.getTrackingNumber());
					 	break;
					 case("b"):
						System.out.println("\nb. Package weight(lb): ");
					 	testTruck.loadPackagesWeight(packagesToLoad);
					 	System.out.println("The package weight is: "+testTruck.getPackagesWeight());
					 	break;
					 case("c"):
						System.out.println("\nc. Package shipping cost");
					 	testTruck.loadTruckIncome(packagesToLoad);
					 	break;
					 }
				 */
					 break;
				}
			 	System.out.print("Please create a cargo before loading packages!");
			 	break;
			 case(3):
				 if (hasCreatedCargo) {//make sure the user has started a cargo before selecting this option
					 System.out.println("\n3. Unload a package");
					 System.out.println("Please enter the number of the package you wish to unload among the list of packages currently loaded: ");
					 int i=0;
					 for (Package p : testTruck.getLoadedPackages()) {//displays each package loaded
						 if (p!=null) {
						 System.out.println(i+": "+p.toString());
						 i++;
						 }
					 }
					 boolean invalidOption=true;
					 int selectedPackageIndex;
					 while(invalidOption) {
					 try {
						 	selectedPackageIndex=Integer.parseInt(keyboard.next());
						 	testTruck.unloadPackage(selectedPackageIndex);
						 	invalidOption=false;
						 }
						 catch (NumberFormatException e) {
							System.out.println("\nWrong input. Please enter an integer: ");//this catches an exception if the user inputed something else than an integer
							invalidOption=true;
						 }
					
					 //System.out.println(Array.toString(testTruck.getLoadedPackages()));
				 	// Display list of all loaded packages with number (index dans loadedPackages). ex. 5, go get the 5th index, create unloadPackage method: delete the package, and reduce all superior indexes by 1.
					 }
				 break;
				 }
			 	System.out.print("Please create a cargo before unloading packages!");
			 	break;
			 case(4):
				if (hasCreatedCargo) {//make sure the user has started a cargo before selecting this option
				System.out.println("\n4. The number of the packages loaded "+testTruck.getNumOfPackages());//this displays the total number of packages loaded in the truck
				break;
				}
			 	System.out.print("Please create a cargo before asking for the number of packages!");
			 	break;
			 case(5):
				 if (hasCreatedCargo) {//make sure the user has started a cargo before selecting this option
					System.out.println("\n5. The gross income earned by shipping of the cargo is "+testTruck.getGrossIncome()+"$."); //this displays the total income earned by the shipping cost of each packages
					break;
					}
				 	System.out.print("Please create a cargo before asking for the gross income!");
				 	break;
			 case(6):
				 if (hasCreatedCargo) {//make sure the user has started a cargo before selecting this option
					double totalWeight=testTruck.getGrossWeight()+testTruck.getUnloadedWeight(); 
					System.out.println("\n6. The gross weight of the truck is "+totalWeight+" pounds.");//this displays the total weight of the truck with its packages in pounds
					break;
					}
				 	System.out.print("Please create a cargo before asking for the gross weight!");
				 	break;
			 case(7): //display the driver's route 
				 if (hasCreatedCargo) {//make sure the user has started a cargo before selecting this option
					System.out.println("\n7. Drive the truck to the destination: ");
					testTruck.drive();
					break;
					}
				 	System.out.print("Please create a cargo before asking to drive!");
				 	break;
			 case(0): //leave the program and display the finish message
				 System.out.println("\n0. To quit");
				 condition=true;
				 break;
				 
			 }
			 if (choice<=7 && choice>0){
					System.out.print("\nWould you like to continue? Write yes to continue, any other input will end the program. "); //asking the user if they want to continue
					answer=keyboard.next();
					if (answer.equalsIgnoreCase("Yes")) {
						System.out.println("\nPlease select another number: ");
					}
					else {
						condition=true; //exit the program if the user enters anything else than yes
					}
		
			 }
			 
		 }
		 System.out.println("\nThank you for using the program. Have a nice day!"); //display the finish message
	}
}
