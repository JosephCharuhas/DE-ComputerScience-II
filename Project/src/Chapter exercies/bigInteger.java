/**
 * @author joseph charuhas
 *
 */
public class bigInteger 
{

	public bigInteger() 
	{
		// TODO Auto-generated constructor stub
	}
	public static String fibonacciNumberTest ()
	{
		ArrayList num = new ArrayList<>();
		num.add(0, BigInteger.valueOf(0));
		num.add(1, BigInteger.valueOf(1));
		for (int i = 2; i < 101; i++)
		{
			BigInteger nextNum = num.get(i - 1).add(num.get(i - 2));
			num.add(i, nextNum);
		}
		return(("Number: " + num.get(100).toString()) + ("Digits: " + num.get(100).toString().length()));
	}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Systme.out.println(fibonacciNumberTest());

	}

}
