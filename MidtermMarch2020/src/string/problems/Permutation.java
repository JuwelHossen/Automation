package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */

        String str = "ABC";
        permutation(str, " ");
    }

    static void permutation(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char chr = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String roster = str.substring(0, i) +
                    str.substring(i + 1);

            // Recurvise call
            permutation(roster, ans + chr);
        }
    }

}
