import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the String: ");
        
        String str = sc.next();
        
        sc.close();
        
        boolean isPalindrome = checkPalindrome(str);
        
        if (isPalindrome) 
        {
            System.out.println(str + " is a palindrome.");
        } else 
        {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String str) 
    {
        
        str = str.toLowerCase();

        
        String reversed = new StringBuilder(str).reverse().toString();

        
        return str.equals(reversed);
    }
}

