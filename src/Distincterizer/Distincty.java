package Distincterizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Distincty {

	public static void main(String[] args) {
		List<Map<String, String>> filter = new ArrayList<Map<String, String>>();
		List<Map<String, String>> results = new ArrayList<Map<String, String>>();
				
		Map<String,String> wetty = new HashMap<String,String>();
		Map<String,String> setty = new HashMap<String,String>();
		
		setty.put("docid","112");
		setty.put("title","khurrum nasim");
		wetty.put("docid","112");
		wetty.put("title","khurrum nasim");
		
		filter.add(wetty);
		results.add(setty);
		
		Iterator<Map<String, String>> iter = results.iterator();
		
		while(iter.hasNext()) {
			Map<String,String> temp = iter.next();
			String title = temp.get("title");
			String docid = temp.get("docid");
			System.out.println(title + " " + docid);
		}
		
		
		/*Object [] obj = setty.toArray();
		List<Object> suck = new ArrayList<Object>();
		suck = Arrays.asList(obj);
		for(Object j : suck) {
			String t = (String) j;
			list.add(t);
		}*/
		
		

	}
}