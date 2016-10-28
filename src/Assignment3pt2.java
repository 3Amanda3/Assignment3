import java.util.Scanner;
			
/*
 *  Amanda Schepp
 * Mr.Hardman
 * Assignment 3 program 2
 * October 27
 */
public class Assignment3pt2 {
			
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner userInput = new Scanner(System.in);
				
		String fName;
		String lName;
		double grade;
		double StudID;
		String log;
		double average;
				
				
		System.out.println("Please enter your first name");
		fName= userInput.nextLine();
				
		System.out.print("Please enter your last name");
		lName= userInput.nextLine();
				
		System.out.println("Please enter your current grade");
		grade= userInput.nextDouble();
				
		System.out.println("Please enter your student ID number");
		StudID= userInput.nextDouble();
				
		System.out.println("Please enter your login");
		log= userInput.next();
				
		System.out.println("Please enter your current semester average");
		average=userInput.nextDouble();
				
				
		System.out.println("Your information");
		System.out.println( String.format("Login:  " + log));
		System.out.println( String.format("Student ID: " + StudID));
		System.out.println( String.format("Name: " +lName+", " +fName));
		System.out.println( String.format("Average:" + average));
		System.out.println( String.format("Grade:" +grade));
																
					
		userInput.close();
				
	}

}
