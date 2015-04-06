package randomizer;
import java.net.*;
import java.util.StringTokenizer;

public class Inet {
	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	private static String data = "mail.aol.com,news.google.com,www.google.com,mail.google.com,docs.google.com";
	public static void main(String[] args) throws UnknownHostException {
		StringTokenizer st = new StringTokenizer(data,",");
		int count=0;
		while(st.hasMoreElements()) {
			String target = st.nextToken();
			InetAddress [] ips = InetAddress.getAllByName(target);
			if(count >= 1)
				System.out.println("\n");
			for(InetAddress a : ips)
				System.out.println(a.toString());
			count++;
		}
	}
}