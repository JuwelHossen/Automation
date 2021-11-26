package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        System.out.println("Enter any string : ");
        Scanner in = new Scanner(System.in);

        //Original string
        String str = (String) in.nextLine();

        boolean palin = isPalindrome(str);

        if(palin)
        {
            System.out.println("The Word you entered  is Palindrome.");
        }
       else
            System.out.println("The Word you entered  is not Palindrome.");

    }


    static boolean isPalindrome(String s)
    {
        boolean isPalin= true;
        for(int beginIndex = 0; beginIndex < s.length(); beginIndex++)
        {
            if(s.charAt(beginIndex) != s.charAt(s.length()-1-beginIndex))
            {
                isPalin = false;
                break;
            }
        }

       return isPalin;


    }

}

