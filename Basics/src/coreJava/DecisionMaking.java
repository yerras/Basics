/**
 * 
 */
package coreJava;

/**
 * @author yerras
 *
 */
public class DecisionMaking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sDay = "Saturday";
		int iDay = 6;
 
		if(sDay.equals("Sunday")){
			System.out.println("Today is Sunday");
		}else{
			System.out.println("Today is not Sunday");
		}
 
		if(iDay==7){
			System.out.println("Today is Sunday");
		}else{
			System.out.println("Today is not Sunday");
		}

	}

}
