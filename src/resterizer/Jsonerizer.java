package resterizer;

/*import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

import javax.json.*;

import Exceptionerizer.SomethingHappenedException;
import randomizer.In;


public class Jsonerizer {
	
	/**
	 * @param args
	*/
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				Jsonerizer json = new Jsonerizer();
				try {
					JsonObject jobj = json.buildJsonObject();
					json.buildJsonObject("http://localhost:8090/rest/apidrone/1.0/message/apidrone.json");
					System.out.println("\n");
				} catch (SomethingHappenedException e) {
					try {
						throw e;
					} catch (SomethingHappenedException e1) {
						System.out.println(e1.getSysMessage() + " " + e1.getSysCode());
					}
				}
			}
		}; 
		while(true) {
			try {
				t1.run();
				//System.out.println("going to sleep");
				t1.sleep(10000);
				//System.out.println("waking up from sleep");
			}   catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
	}
	
	/**
	 * @param in
	 * @throws SomethingHappenedException 
	 * @throws Exception 
	*/
	public void buildJsonObject(String in) throws SomethingHappenedException {
			JsonReader reader = Json.createReader(In(in));
			JsonObject obj= reader.readObject();
		    //String results = obj.getJ("milestones");
		    //JsonArray array = results.getJsonArray("persons");
		    //JsonArray array = results.getJsonArray(0);
			JsonArray results = (JsonArray) obj.get("milestones");
			System.out.println("----------------------------------");
			   for (JsonValue result : results) {
			    
				System.out.println("> " +result);
			}	
	}
	
	/**
	 * @param s
	 * @return
	 * @throws SomethingHappenedException 
	*/
	public InputStream In(String s) throws SomethingHappenedException  {
		 InputStream is=null;
		 HttpURLConnection site = null;
		 	try {
			 	URL url = getClass().getResource(s);
	        	if (url == null) {url = new URL(s);}
	        	if(s.contains("localhost")) {
	        		site = (HttpURLConnection) url.openConnection();
	        	}
	        	else {
	        		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("131.84.11.215", 9119));
	        		site = (HttpURLConnection) url.openConnection(proxy);
	        	}
	        	
	        	site.connect();
	        	is = site.getInputStream();
	        	return is;
		    }
		    catch (IOException ioe) {
		        //wrap the IOException
				throw new SomethingHappenedException("Could not open " + s, ioe);
		    }
	}
	
	/**
	 * 
	 * @param url
	*/
	static void readURL(String url) {
		In in = new In(url);
        String[] data = in.readAllStrings();
	}
	
	/**
	 * buildJsonObject()
	*/
	static JsonObject buildJsonObject() {
		JsonObject value = Json.createObjectBuilder()
			.add("firstName", "John")
				.add("lastName", "Smith")
					.add("age", 25)
						.add("address", Json.createObjectBuilder()
						.add("streetAddress", "21 2nd Street")
							.add("city", "New York")
								.add("state", "NY")
								.add("postalCode", "10021"))
								.add("phoneNumber", Json.createArrayBuilder()
								.add(Json.createObjectBuilder()
								.add("type", "home")
								.add("number", "212 555-1234"))
								.add(Json.createObjectBuilder()
								.add("type", "fax")
						.add("number", "646 555-4567"))).build();
		return value;
						//System.out.println(value.toString());
	}
	

}