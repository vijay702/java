package exception.handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExample1 {
	
	
	public static void main (String args[]) {
		
		int no1 =0;
		int no2=0;
		int no3=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter a numbers");
		
		try {
		 no1 = sc.nextInt();
		 no2 =sc.nextInt();
		
	
		 no3 =no1/no2;
		System.out.println(no3);
		
		}
			
			
		catch(InputMismatchException iex){
			
			System.out.println(" enter a valid number ");
		}
		
		catch(Exception ae) {
			
			System.out.println("please enter a valid number , greater than zero"  );
		}
		
		
		
	}

}
