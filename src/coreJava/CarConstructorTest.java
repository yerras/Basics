/**
 * 
 */
package coreJava;

/**
 * @author yerras
 *
 */
public class CarConstructorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car4Constructor BMW= new Car4Constructor();
		
		BMW.iDoors=2;
		BMW.bRightHandDrive=true;
		BMW.iYear=2016;
		BMW.sColour="Black";
		
		BMW.DisplayDetails();

	}

}
