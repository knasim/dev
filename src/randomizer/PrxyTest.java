package randomizer;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketException;
import java.net.URL;

public class PrxyTest {
	
	//private 
	private String s = "http://ddbuvrhtestsql.dtic.mil:3306/";
	
	//PrxyTest
	public PrxyTest() throws IOException {
		getURL(s);
	}
	
	//main
	public static void main(String[] args) throws IOException {
		PrxyTest pt = new PrxyTest();
	}
	
	/**
	 * 
	 * @param input string
	 * @throws IOException
	 * @throws SocketException
	*/
	public void getURL(String s) throws IOException, SocketException {
		String address = "131.84.11.215";
		int port = 9119;
		try {
			URL url = new URL(s);
			Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(address, port));
			//HttpURLConnection site = (HttpURLConnection) url.openConnection(proxy);
			HttpURLConnection site = (HttpURLConnection) url.openConnection();
			site.connect();
		}
		catch (SocketException se) {
			se.printStackTrace();
		}
	}
}