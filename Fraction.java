import java.util.Scanner;

public class Fraction
{
	public static void main(String[] args)
	{
       // declare a scanner object for input
		Scanner scan = new Scanner(System.in);

       // prompt for numerator and read in - use print instead of println so the user will input on the same line as the prompt
         System.out.print("Enter the numerator: ");
         int numerator = scan.nextInt();
       // prompt for denomator and read in - use print instead of println so the user will input on the same line as the prompt		
         System.out.print("Enter the denominator: ");
	 int denominator = scan.nextInt();
       // compute the answer and store in a variable of type double
	 double fraction = numerator / denominator;
       // ouutput the answer		
	 System.out.println(fraction);	  
  }
}
