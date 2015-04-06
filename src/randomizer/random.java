package randomizer;

import java.util.concurrent.ThreadLocalRandom;

public class random {
	public static void main(String[] args) {
		int N=20;
		int cutoff=8;
		StringBuilder sb = new StringBuilder();
		
		for(int p=0; p<N; p++)
		{
			for(int k=0; k<N; k++)	{
				for(int i=0;i<5; i++) {
					//int r = i + (int) (Math.random() * (N - i));
					int r = ThreadLocalRandom.current() .nextInt(4, 77);
					sb.append(String.valueOf(r));
				}
				if(k<=cutoff)
					sb.append(",");
			}
			System.out.println(sb.toString());
			sb = new StringBuilder();
		}
	}
}
