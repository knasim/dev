package writerizer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WriteMeToFile {
	public static void main(String[] args) throws IOException {
		
		//[{title=BRAT, docid=3179}, {title=MAFPS, docid=16},
		List<Map<String, String>> results = new ArrayList<Map<String, String>>();
		HashMap<String,String> m1 = new HashMap<String,String>();
		HashMap<String,String> m2 = new HashMap<String,String>();
		HashMap<String,String> m3 = new HashMap<String,String>();
		HashMap<String,String> m5 = new HashMap<String,String>();
		HashMap<String,String> m6 = new HashMap<String,String>();
		
		m1.put("docid", "112");
		m1.put("title", "sukah1");
		m2.put("docid", "113");
		m2.put("title", "sukah2");
		m3.put("docid", "114");
		m3.put("title", "sukah3");
		m5.put("docid", "116");
		m5.put("title", "sukah5");
		m6.put("docid", "117");
		m6.put("title", "sukah6");
		
		results.add(m1);
		//results.add(m2);
		results.add(m3);
		results.add(m5);
		//results.add(m6);
		System.out.println();
		String filepath = System.getProperty("java.io.tmpdir");
		File f = new File(filepath+"//results.txt");
		//loop and write.
		FileWriter fw = new FileWriter(f);
		for(Map<String,String> m : results) {
			String key = m.get("title");
			String value = m.get("docid");
			fw.write(key + " " + value + "\n");
		}
		//some more code should go here
		fw.flush();
		fw.close();
	}
}