//Joseph Charuhas

//Simple class that holds verses, words, and chapter
public class IndexEntry 
{
	
	
	
	public String words;
	public int verse;
	public int chapter;
	
	
	
	public IndexEntry(int cha, int ver, String wor) 
	{
		chapter = cha;
		verse = ver;
		words = wor;
	}
	
	public String getWord()
    {
       return this.words;
    }
	
	public int getChapter()
    {
       return this.chapter;
    }
	
	public int getVerse()
    {
       return this.verse;
    }
	
	
	
	public String toString()
    { 
       return(chapter + ":" + verse + ": " + words);
    }	
	
	
	
	public static void main(String[] args) 
	{
		
		

	}

}
