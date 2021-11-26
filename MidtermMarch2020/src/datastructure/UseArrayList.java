package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		List<Integer>  list =new ArrayList<>();

		list.add(10);
		list.add(1,20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);


		System.out.println("List Size: "+list.size());
		//Using for loop
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("....................");
		//Using Iterator
		Iterator it = list.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}


		list.remove(7);
		System.out.println("....................");
		//Using for each
		for(Integer state: list){
			System.out.println(state);
		}

	}

}
