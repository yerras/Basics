/**
 * Passing an Array to a Method
 */
package coreJava;

/**
 * @author yerras
 *
 */
public class Passing_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare an Array
		
		String[] aMake = {"Audi","BMW","Jaguar","Range Rover","Porsche"};
		
		// Calling another method to print and pass the array
		
		Print_Array(aMake);

	}

	public static void Print_Array(String []array){
		
		for(int i=0;i<array.length;i++){
			System.out.println("The make of the car stored at position "+i+" is "+array[i]);
		}
	}
}
