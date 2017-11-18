package App;

import java.util.Iterator;

import Stack.stack;
import node.Node;

public class app {
	
	public static void main(String[] args) {
		
		
		stack<String> names = new stack<String>(5);
		try {
		
			names.push("Juanga");
			names.push("El sol");
			//names.push("Mascota");
			//names.push("tu mama");
			
			for(String string: names){
				System.out.println(string);
			}

			/*
			Iterator<String> iterator = names.iterator();
			for (Iterator<String> i = iterator; i.hasNext();) {
				System.out.println(iterator.next());
			}
			*/
			//System.out.println(names);
			//System.out.println("Buscando a tu mama: " + names.Search("tu mama"));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
