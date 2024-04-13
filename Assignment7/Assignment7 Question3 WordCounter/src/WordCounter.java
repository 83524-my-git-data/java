
public class WordCounter 
{
	
	 public static void main(String[] args) 
	 {
	        String st = "This is a sample sentence to count words.";
	        int wordCount = countWords(st);
	        System.out.println("Number of words in the string: " + wordCount);
	 }

	    public static int countWords(String str) 
	    {
	        
	        str = str.trim();

	        
	        if (str.isEmpty()) 
	        {
	            return 0;
	        }

	        
	        String[] words = str.split("\\s+");

	        
	        return words.length;
	    }

}
