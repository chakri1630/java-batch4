package com.activeweb.app.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionFilter {

	public static void main(String args[]) {

		List<String> strings = new ArrayList<>();

		strings.add("Hari");
		strings.add("Suman");
		strings.add("Mark");
		strings.add("George");
		strings.add("Abhishek");
		strings.add("Sarika");

		// Java 7 approach
	/*	List<String> filteredList = new ArrayList<>();
		for (String str : strings) {
			if (str.startsWith("S")) {
				filteredList.add(str);
			}
		}*/
		
		// Java 8 approach
		//strings.stream().filter(s->s.startsWith("S")).forEach(System.out::println);

		List<String> filteredList = strings.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());

		System.out.println("Final list" + filteredList);

	}

}
