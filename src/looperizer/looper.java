package looperizer;
	public class looper {
		public static void main(String[] args) {
			int[] xarr = {5,1,4,3,7,8,9,11,2,6};
			int len = xarr.length;
			for(int x=0; x<len; x++) {
				System.out.println("\nstarting ....round " + x);
				for(int y=x; y<len; y++)
					System.out.println(xarr[y]);
		}
	}
}