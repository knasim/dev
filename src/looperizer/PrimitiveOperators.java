package looperizer;

public class PrimitiveOperators {
		//start main
		public static void main(String[] args) {
		  int x = 3,y = 4, q = 4;
		  double p = 3.0;
		  float r = 3.0f;
		  int  s= 4;
			System.out.println("first division:  " + x/y);
			System.out.println("\nsecond division:  " + p/q);
			System.out.println("\nthird division:  " + r/s);
			System.out.println("\nsum");
			
			Double data[] = new Double[5];
			data[0]=0.0;
			data[1]=3.0;
			data[2]=5.0;
			data[3]=7.0;
			data[4]=9.0;
			double fsum = sum(data, data.length);
			System.out.println(fsum);
		}
		//end main
		public static double sum(Double data[], int size) {
			double s = 0.0; int i;
			for(i=0; i<size; i++) 
				s+=data[i];
			return s;
		}
}