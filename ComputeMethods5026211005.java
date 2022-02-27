import java.util.Random;

public class ComputeMethods {

	public double fToC(double degreesF) 
	{
		double celsiusval = ((5*(degreesF - 32.0))/9.0) ; 
		return celsiusval;
	}

	public double hypotenuse(int a, int b)
	{
		double hypotenuseval;
		hypotenuseval = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return hypotenuseval;
	}

	public int roll() 
	{
		int diceval1;
		int diceval2;
		int sumroll;

		diceval1 = (int)(Math.random()*6) + 1;
		diceval2 = (int)(Math.random()*6) + 1;
		sumroll = diceval1 + diceval2;
		return sumroll;
	}
}
