import java.util.ArrayList;

//Joseph Charuhas

public class BibleIndex extends ArrayList<IndexEntry>
{
	
	//makes arraylist of index entry class
	public BibleIndex() 
	{
		new ArrayList<IndexEntry>();
	}
	
	//adds individual words
	public void addWord(int cha, int ver, String wor)
	{
		IndexEntry c = new IndexEntry(cha, ver, wor);
		this.add(c); 
	}	
	
	
	//string needs to be stripped of chapter and number ahead of time
	//adds all of the words to list
	public void addAllWords(String str, int cha, int ver)
    {
      String[] words = str.split("\\W+");
      if (words.length == 0)
      {
         return;
      }
      for(int i = 0; i < words.length; i++)
	  {
    	  if(!(words[i].equals("")))
	      {
	         this.addWord(cha, ver, words[i]);
	      }
	  }       
	}
	public static void main(String[] args) 
	{
		

	}

}
