/**
 * 
 */
package coreJava;

/**
 * @author yerras
 *
 */
public class Car {

	String sMake;
	String sModel;
	String sTransmission;
	String sColour;
	int iYear;
	int iDoors;
	boolean bRightHandDrive;
	
	public void DisplayDetails(){
		System.out.println("Make of the Car is: "+sMake);
		System.out.println("Model of the Car is: "+sModel);
		System.out.println("Colour of the Car is: "+sColour);
		System.out.println("Transmission of the Car is: "+sTransmission);
		System.out.println("Year of Manufacture is: "+iYear);
		System.out.println("No of Doors: "+iDoors);
		System.out.println("Is the Car Right Hand Drive: "+bRightHandDrive);
	}
}
