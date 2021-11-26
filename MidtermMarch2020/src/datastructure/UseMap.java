package datastructure;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */



		List<String> classOne= new ArrayList<>();
		classOne.add("APPLE");
		classOne.add("ORANGE");
		classOne.add("PEARS");

		List<String> classTwo= new ArrayList<>();

		classTwo.add("POTATO");
		classTwo.add("ONION");
		classTwo.add("GARLIC");

		List<String> classThree= new ArrayList<>();

		classThree.add("RICE");
		classThree.add("WHEAT");
		classThree.add("BREAD");





		Map<Integer,List<String>> map =new LinkedHashMap<>();

		map.put(1,classOne);
		map.put(2,classTwo);
		map.put(3,classThree);


		for(Map.Entry foodRank: map.entrySet())
		{
			System.out.println("FOOD RANK "+foodRank.getKey()+" :   "+foodRank.getValue());
		}




	}

}
