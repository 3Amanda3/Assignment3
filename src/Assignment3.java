import java.util.Scanner;

/**
 * 
 */

/**
 * @author a.schepp
 *
 */
public class Assignment3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		double mark1;
		double mark2;
		double mark3;
		double mark4;
		double mark5;
		double avarage;
		double total;
		
		System.out.println("Please enter your current term grades");
		
		System.out.println("Class one grade ");
		 mark1=userInput.nextDouble();
		 
		System.out.println("Class two grade ");
		 mark2=userInput.nextDouble();
		 
		System.out.println("Class three grade ");
		 mark3=userInput.nextDouble();
		 
	    System.out.println("Class four grade ");
		 mark4=userInput.nextDouble();
			 
		System.out.println("Class five grade ");
		 mark5=userInput.nextDouble();
		 
		 total = mark1 + mark2 + mark3 + mark4 + mark5;
		 avarage = total /5;
		 
		 System.out.println("Class one: " +mark1);
		 System.out.println("Class two: " +mark2);
		 System.out.println("Class three: " +mark3);
		 System.out.println("Class four: " +mark4);
		 System.out.println("Class five: " +mark5);
		 System.out.println("Your avarage is: " +avarage+"%");
		 
		 userInput.close();
		
		
		
		
	}

}
