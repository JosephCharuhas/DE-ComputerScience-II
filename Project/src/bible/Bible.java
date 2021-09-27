import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Joseph Charuhas

public class Bible 
{

	public Bible() 
	{
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
		//Reads in input file specified from user
		Scanner keyboard = new Scanner(System.in);
	    String fileName;

	    if (args.length > 0)
	      fileName = args[0];
	    else
	    {
	      System.out.print("\nEnter input file name: ");
	      fileName = keyboard.nextLine().trim();
	    }

	    BufferedReader inputFile =
	                 new BufferedReader(new FileReader(fileName), 1024);
	    
	    //creates bible index object
	    
	    BibleIndex bIndex = new BibleIndex();
	    
	    String s;	    
	    while ((s = inputFile.readLine()) != null)
	    {
	    	int first = -1;
	    	int second = -1;
	    	int chapter;
	    	int verse;
	    	String mainText; 
	    		  
	      
	    	first = s.indexOf(":");
	    	if (first != -1)
	    	{
	    		second = s.indexOf(":", first + 1);    	  
	    	}
	      
	    	if ( first > 0)    	  
	    	{
	    		if(second > first)
	    		{
	    			chapter = Integer.parseInt(s.substring(0, first));
	    			verse = Integer.parseInt(s.substring(first + 1, second));
	    			mainText = s.substring(second + 1);
	    			bIndex.addAllWords(mainText, chapter, verse);
	    			//System.out.println(chapter + " " + verse + " " + mainText);

	    		}
	    	}
	    }
	    
	    // print the contents
	    //for (IndexEntry chap : bIndex)
	    //{
	    //	int currentChapter = chap.getChapter();
	    //	int currentVerse = chap.getVerse();
	    //	String currentWord = chap.getWord();
	    //	System.out.println( currentChapter + ":" + currentVerse + ":" + currentWord);
	    //} 
	    
	    
	    //How many chapters are in your book?
	    int count = 0;
	    for (IndexEntry chap : bIndex)
	    {
	    	int currentChapter = chap.getChapter();
	    	if (currentChapter > count)
	    	{
	    		count = currentChapter;
	    	}
	    } 
	    System.out.println(count + " chapters in this book");

	    
	    
	    //How many verses are in your book? 
	    int lastChap = 0;
	    int lastVer = 0;
	    int total = 0;
	    for (IndexEntry entry : bIndex)
	    {
	    	int currentChap = entry.getChapter();
	    	int currentVer = entry.getVerse();
	    	//System.out.println(currentChap + " : " + currentVer);
	    	if (currentChap > lastChap || currentVer > lastVer)
	    	{
	    		total++;
	    		lastChap = currentChap;
	    		lastVer = currentVer;
	    	}

	    } 
	    System.out.println(total + " Total verses");

	    
	    
	    //How many verses are in in chapter?
	    int j = 1;
	    lastVer = 0;
	    total = 0;
	    for (IndexEntry entry : bIndex)
	    {
	    	int currentChap = entry.getChapter();
	    	int currentVer = entry.getVerse();
	    	if (currentChap == j)
	    	{
	    		if(currentVer > lastVer)
	    		{
	    			total++;
	    			lastVer = currentVer;
	    		}
	    	}

	    } 
	    System.out.println(total + " verses in chapter " + j);

	    
	    
	    //How many times is a specific word mentioned in your book? (read the word in from the user)
	    
	    System.out.print("Enter word to search ");
	    String search = keyboard.nextLine().trim();
	    search = search.toUpperCase();
	    int wCount = 0;
	    for (IndexEntry entry : bIndex)
	    {
	    	String currentWord = entry.getWord();
	    	if (currentWord.equals(search))
	    	{
	    		wCount++;
	    	}
	    }
	    System.out.println("word was found " + wCount + " times");

	    
	    //How many verses does a specific word appear in in your book? (read the word in from the user)
	    
	    lastVer = 0;
	    lastChap = 0;
	    total = 0;
	    for (IndexEntry entry : bIndex)
	    {
	    	int currentChapter = entry.getChapter();
	    	int currentVerse = entry.getVerse();
	    	String currentWord = entry.getWord();
	    	if (currentWord.equals(search))
	    	{
	    		if (currentChapter > lastChap || currentVerse > lastVer)
	    		{
	    			lastChap = currentChapter;
	    			lastVer = currentVerse;
		    		total++;
	    		}
	    	}
	    }
	    System.out.println("Total verses with this word " + total);
	    
	    
	    //Total number of words
	    count = 0;
	    for (IndexEntry word : bIndex)
	    {
	    	count++;
	    } 
	    System.out.println(count + " words in this book");

	   
	    // Finish:

	    inputFile.close();
	    //outputFile.close();

	    keyboard.close();
	    System.out.println("Done.");
	    
	    
	}
	
}


