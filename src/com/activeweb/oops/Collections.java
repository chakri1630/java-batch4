package com.activeweb.oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Collections {

	public static void main(String arg[]) {

		List<String> l = new ArrayList<>();
		
		l.add("hello");
		l.add("how ");

		List<String> l2 = new ArrayList<>();
		l2.add("are");
		l2.add("happy");

		l.addAll(l2);

		System.out.println("" + l.get(0));

		System.out.println("size.." + l.size());

		Iterator itr = l.iterator();

		while (itr.hasNext()) {

			String str = (String) itr.next();
			System.out.println("length is..." + str.length());
			if (str.equals("how ")) {
				itr.remove();
			}
		}

		l2.get(2);
		
		System.out.println("" + l.size());
		// Set s = new HashSet();

		Set<? super String> s = new HashSet<>();

		s.add("mark@outlook.com");
		s.add("Hari@gmail.com");

		Loan l1 = new Loan();
		Loan loan2 = new Loan();
		Loan l3 = new Loan();

		Map<String, String> map = new HashMap<>();
		map.put("Hello", "Greeting");
		map.put("laptop", "dallas");

		Map<Loan, String> mapCustom = new HashMap<>();
		mapCustom.put(l1, "FirstLoan");
		mapCustom.put(loan2, "SecondLoan");
		mapCustom.put(l3, "FirstLoan");
		
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("ABCD", 1);
		treeMap.put("ABAD", 1);
		treeMap.put("ABED", 1);
		treeMap.put("AACD", 1);
		
		Map<Loan, String> treeMap1 = new TreeMap<>(new MakeComparator());
		treeMap1.put(l1, "FirstLoan");
		treeMap1.put(loan2, "FirstLoan");
		treeMap1.put(l3, "FirstLoan");
		
		mapCustom.get(loan2);
		
		System.out.println("" + s);

		for (Object str : s) {
			System.out.println("" + str.toString());
		}

	}

}
