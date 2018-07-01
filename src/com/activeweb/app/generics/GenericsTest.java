package com.activeweb.app.generics;

import java.util.HashMap;
import java.util.Map;

public class GenericsTest {

	public static void main(String args[]) {
		
		Map mapStrIntNot = new HashMap();
		
		mapStrIntNot.put("test1","1");
		
		mapStrIntNot.put("test2","2");
		
		Map<String, Integer> mapStrInt = new HashMap<>();
		
		mapStrInt.put("test1", 1);
		
		mapStrInt.put("test2", 2);

		String s = (String) mapStrIntNot.get("test1");
		
		Integer i1 = mapStrInt.get("test1");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		A<Integer> aInteger = new A<>();
		
		A<String> aString = new A<>();
		
		
		Integer iFill = new Integer("100");
		
		aInteger.setObj(iFill);
		
		Integer i = aInteger.getObj();
		
		String sFill = "Test";
		
		aString.setObj(sFill);
		
		String sOp = aString.getObj();
		
		
	}
	
	
}
