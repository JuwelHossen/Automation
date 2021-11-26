package string.problems;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        String value = "This is testing Program testing Program";

        String item[] = st.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String t : item) {


            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);

            } else {
                map.put(t, 1);
            }
        }
        Set<String> keys = map.keySet();

         int wordTotal=item.length, totallength=0;

        for (String key : keys) {
            System.out.print(key+" ---- appears: ");
            System.out.print(map.get(key)+" times  and length : ");
            System.out.println(key.length());
            totallength += key.length();

        }

        System.out.print("\nAverage word length is: "+(totallength/wordTotal)+"\n");


    }

}
