package randomizer;

import java.util.Arrays;

public class TimTest {
	
	/**
	 * @param args
	*/
	public static void main(String[] args) {
		//readURL("http://localhost:8080/examples/jsp/error/error.html");
		//readStr("http://www.schmiedmann.com/3_series/E46/Spare_parts_brakes-chassi-suspenssion_etc/Brake_parts/page1.htm#239");
		//readStr("http://news.google.com");
		//readStr("readme.txt");
		//readStr("http://algs4.cs.princeton.edu/12oop/largeT.txt");
	}
	
	
	/**
	 * @param url
	 * 
	*/
	static void readStr(String url) {
		In in = new In(url);
	    String[] data = in.readAllStrings();
	    //Arrays.sort(data);
	    StringBuilder sb = new StringBuilder();
	    int count=1;
		for(String x : data) {
			//if(x.contains("href")) {
				//if(x.contains("Wizards"))
					System.out.println(x);
			//}
		}
	}
	
	
	/**
	 * @param url
	 * 
	*/
	static void readURL(String url) {
		In in = new In(url);
        int[] data = in.readAllInts();
		System.out.println("before\n");
		/*for(int x : data)
			System.out.println("\t" + x);*/
        Arrays.sort(data);
        System.out.println("\nafter\n");
		for(int x : data)
			System.out.println("\t" + x);
	}
	
	/**
	 * 
	 * @param file
	*/
	static void readFile(String file) {
		In in = new In(file);
        int[] data = in.readAllInts();
		
        Arrays.sort(data);
        System.out.println("\nafter\n");
		for(int x : data)
			System.out.println("\t" + x);
	}
	
	
	/**
    * Read in and return an M-by-N array of doubles 
    * from standard input.
    */
    public static double[][] readDouble2D() {
       int M = StdIn.readInt();
       int N = StdIn.readInt();
       double[][] a = new double[M][N];
       for (int i = 0; i < M; i++) {
           for (int j = 0; j < N; j++) {
               a[i][j] = StdIn.readDouble();
           }
       }
       return a;
   }
}