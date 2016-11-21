/**
 * Returning an Array from a Method
 */
package coreJava;

/**
 * @author yerras
 *
 */
public class Returning_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aMake[] = Return_Array();
		for(int i=0;i<aMake.length;i++){
			System.out.println("The make of the car stored at position "+i+" is "+aMake[i]);
		}
	}
		//This method returns an Array of type String
		public static String[] Return_Array(){
			String []aMakeArray={"Audi","BMW","Jaguar","Porsche","Range Rover"};
			return aMakeArray;
		}

	}


