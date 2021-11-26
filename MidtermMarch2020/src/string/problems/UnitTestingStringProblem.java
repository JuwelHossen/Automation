package string.problems;

import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class UnitTestingStringProblem
{
    public static void main(String[] args) throws NullPointerException
    {
        //Apply Unit Test into all the methods in this package.

        //ANAGRAM TESTING

       Assert.assertEquals(true,Anagram.isAnagram("CAT","TAC"));



       // LARGEST WORD TESTING

        String st = "  Programming  is fun ";
        Map<Integer,String> map = new HashMap<>();
        map.put(11,"Programming");
        Assert.assertEquals(map,DetermineLargestWord.findTheLargestWord(st));

// palindrome check
        String st1 = "MADAM";
        Assert.assertEquals(true, Palindrome.isPalindrome(st1));




    }
}