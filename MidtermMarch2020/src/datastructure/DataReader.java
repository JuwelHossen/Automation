package datastructure;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.List;
import java.util.Iterator;
public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile ="/Users/juwel/develop/MidtermMarch2020/src/data/self-driving-car";
				//= System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr=new FileReader(textFile);
			br=new BufferedReader(fr);

		}catch (FileNotFoundException ex)
		{
			System.out.println("FILE NOT FOUND");
		}

		String line="";

		try {
			while((line = br.readLine()) !=null){
				System.out.println(line);
			}
		} catch (IOException e) {

			System.out.println("File path was not right so we could not read");
		}
		System.out.println("-----------------------------");




		Scanner in=new Scanner(new File(textFile));

		Stack<String> stack =new Stack<>();
		List <String> list = new LinkedList<>();

		while(in.hasNext()){
			String str = in.next();
            stack.push(str);
            list.add(str);
			//.....
		}

		System.out.println(stack.peek());
		System.out.println("\n-----------------------------");
		for(int i=0; i<stack.size(); i++) {
			System.out.println(stack.pop());
		}
		System.out.println("-----------------------------");

		Iterator it = stack.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		for(String state: stack){
			System.out.println(state);
		}



	}

}
