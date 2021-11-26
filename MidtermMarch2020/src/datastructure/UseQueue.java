package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> queue=new LinkedList<>();

		queue.add("usa");
		queue.add("canada");
		queue.add("bangladesh");
		queue.add("mexico");
		((LinkedList<String>) queue).addLast("India");


		System.out.println(queue);
		System.out.println(queue.element());

		System.out.println(((LinkedList<String>) queue).getFirst());
		System.out.println(((LinkedList<String>) queue).getLast());



	}

}
