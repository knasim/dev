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
		
	
		List<Map<String, String>> results = new ArrayList<Map<String, String>>();
		HashMap<String,String> m1 = new HashMap<String,String>();
		HashMap<String,String> m2 = new HashMap<String,String>();
		HashMap<String,String> m3 = new HashMap<String,String>();
		HashMap<String,String> m5 = new HashMap<String,String>();
		HashMap<String,String> m6 = new HashMap<String,String>();
		
		//results.add(m2);
		results.add(m3);
		results.add(m5);
		//results.add(m6);
		System.out.println();
		String filepath = System.getProperty("java.io.tmpdir");
		File f = new File(filepath+"//results.txt");
		//loop and write.
		FileWriter fw = new FileWriter(f);
		//some more code should go here
		fw.flush();
		fw.close();
	}
}