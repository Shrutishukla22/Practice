import java.util.Scanner;



public class ReversenumberUsingString {
	
	private int reverseTheNumber(int number){
		String reversenums = Integer.toString(number);
		StringBuffer sb = new StringBuffer(reversenums);
		sb.reverse();
		String reversedNum= sb.toString();
		
		return Integer.parseInt(reversedNum);
		
	}

	public static void main(String[] args) {
		String next   ="Yes"; 
		Scanner userInput = new Scanner(System.in) ;
		Scanner nextInput = new Scanner(System.in) ;
		
		//loop until user does not want to enter the number.
		while(next.equalsIgnoreCase("Yes")){
			
			    //Prompt the user for Input and store in variable
			 	System.out.println("Enter the number you want to be reversed" ) ;
			 	int num =0;
			try{
				num = userInput.nextInt();
			}catch(Exception e){
				System.out.println("please enter number only!");
			}
				ReversenumberUsingString rev = new ReversenumberUsingString();
				//calling reverseNumber method.
				int reversedNumber = rev.reverseTheNumber(num);
			 	
			    //Print the reversed number   
			 	System.out.println("reversed number="+ reversedNumber ) ;
			 	
			 	//prompt the user for another Input and store in variable 
			 	System.out.println("Do you want to enter one more number : Enter Yes or No ") ;
			 	next =nextInput.nextLine();
			 	
			 	System.out.println("You have entered " + next) ;
			}
		    // close the scanner if user does not enter another number.
		    System.out.println("Closing Scanners...");
		    nextInput.close();
		    userInput.close();
		    
		}
		    

}
