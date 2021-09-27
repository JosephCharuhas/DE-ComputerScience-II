import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author joseph Charuhas
 *
 */
public class FileReadingMatchingBraces 
{

	/**
	 * 
	 */
	public FileReadingMatchingBraces() 
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	public static int checkBrace() throws IOException
	{
		// Gets file name from user
		Scanner input = new Scanner(System.in);
		String fileName; 
		System.out.print("Enter filename ");
		fileName = input.nextLine();
		
		//reads in file that user specified
		BufferedReader inputFile = new BufferedReader(new FileReader(fileName));
		
		//Checks to make sure that the braces are matching 	    
		int c = 0; 
		int i;
		while ((i = inputFile.read()) != -1 && c >= 0)
		{
		char b = (char)i;
		if (b == '{')
		c++;
		else if (b == '}')
		c--;
		}
		
		//returns number based on whether any errors were found
		inputFile.close();
		return c;
	}
	
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//if no errors were found display braces are correct if not displays braces do not match
		if(checkBrace()==0)
		{
			System.out.println("Braces are correct");
		}
		else
		{
			System.out.println("braces do not match");
		}
		
		
	}

}
