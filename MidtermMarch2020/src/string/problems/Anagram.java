package string.problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY"
        // .

        Scanner sc =new Scanner(System.in);


        String s1="";
        String s2="";
        System.out.println("ENTER FIRST WORD TO CHECK AN ANAGRAM OR NOT ");
        s1=sc.nextLine();
        System.out.println("ENTER 2ND WORD TO CHECK AN ANAGRAM OR NOT ");
        s2=sc.nextLine();


       boolean bool= isAnagram(s1,s2);

        if (bool) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }

    }

    static boolean isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }

       return status;
    }
}