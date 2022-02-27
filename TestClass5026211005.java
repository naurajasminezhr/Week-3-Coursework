import java.util.Scanner;
import java.util.*;

public class TestClass 
{
	public static void main(String[] args) 
	{
		double farntempval, celsiusval, hypoval;
		int theight, tbase, rolledsum;

		Scanner in = new Scanner(System.in);

		ComputeMethods objComp = new ComputeMethods();

		System.out.println("Enter temperature in Fareinheit to convert in Celsius");
		farntempval = in.nextFloat();
		celsiusval = objComp.fToC(farntempval);
		System.out.println("Temperature in Celsius is: " + celsiusval);

		System.out.println("Enter the height of the triangle");
		theight = in.nextInt();

		System.out.println("Enter the base of the triangle");
		tbase = in.nextInt();

		hypoval = objComp.hypotenuse(theight, tbase);
		System.out.println("Hypotenuse of the angled is: " + hypoval);
	
		System.out.println("The dice is in rolling process");
		rolledsum = objComp.roll();
		System.out.println("The sum of the dice values is " + rolledsum);
	}
}
