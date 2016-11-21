/**
 * 
 */
package coreJava;

/**
 * @author yerras
 *
 */
public class CarDescription {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car Audi = new Car();
		
		Audi.sMake="Audi";
		Audi.sModel="RS8";
		Audi.iDoors=2;
		Audi.iYear=2016;
		Audi.sColour="Tangerine";
		Audi.sTransmission="Manual";
		Audi.bRightHandDrive= true;
		
		Audi.DisplayDetails();

	}

}
