package randomizer;

public class BnarySch {
	
	//main
	public static void main(String[] args) {
		int [] data = {23,55,1,2,34,97,44,76,42,41};
		
		//ksortWhile(data);
		 new Thread() {
			public void run() {
				int [] data = {23,55,1,2,34,97,44,76,42,41};
				System.out.println("runnig t1");
				ksortFor(data);
				for(int z=0; z<data.length; z++)
					System.out.println(data[z]);
			}
		}.start();
		
		for(int z=0; z<data.length; z++)
			System.out.println("main call " + data[z]);
	}
	
	//sortWhile
	static void ksortWhile(int[] data) {
		for(int outer=0;outer<data.length; outer++) {
			while(data[outer+1] < data[outer]) {
				System.out.println(data[outer+1]);
			}
				
		}
	}
	
	
	//sort
	static void ksortFor(int[] data) {
		System.out.println("ksortFor called ..");
		for(int outer=0;outer<data.length; outer++) {
			for(int inner=0; inner < data.length; inner++) {
				if(data[outer] < data[inner]) {
					int smaller = data[outer];
					data[outer]=data[inner];
					data[inner]=smaller;
				}
			}
		}
	}
	
	//rank
	static int rank(int key, int[] data) {
		int lo = 0;
		int hi = data.length-1;
		while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < data[mid]) hi = mid - 1;
            else if (key > data[mid]) lo = mid + 1;
            return data[mid];
        }
		return -1;
	}
}