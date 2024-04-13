package com.sunbeam;

import java.util.Scanner;

public class WordCounter {	
		 public static void main(String[] args) 
		 {
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.println("Enter String : ");
			 
			 String str = sc.nextLine();
			 
		        
		        int wordCount = countWords(str);
		        
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


