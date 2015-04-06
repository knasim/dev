package hasherizer;

/**
 * Hash routines for primitive types. The implementation is based on the finalization step
 * from Austin Appleby's <code>MurmurHash3</code>.
 * 
 * @see "http://sites.google.com/site/murmurhash/"
 */
import java.util.regex.Pattern;


	
	
public final class MurmurHash3
{
	private static final String LUCENE_ESCAPE_CHARS = "[\\\\+\\-\\!\\(\\)\\:\\^\\\'\"\\]\\{\\}\\~\\*\\?]";
	private static final Pattern LUCENE_PATTERN = Pattern.compile(LUCENE_ESCAPE_CHARS);
	private static final String REPLACEMENT_STRING = "\\\\$0";
	//main
	public static void main(String[] args) {
		/*System.out.println(hash(322561257));
		System.out.println(hash(43545));
		System.out.println(hash(65787));
		System.out.println(hash(2));
		System.out.println(hash(4));
		System.out.println("longs ");
		long lol = 7899878998324234234L;
		System.out.println(hash(lol));*/
		String name = "Khurrum";
		//System.out.println(name.hashCode());
		
		String programName = "Lam 21\" Upgrader";
		String duh1 = "Lam 21\\\\\" Upgrader";
		String queryString = "AIR_Name:\"" + LUCENE_PATTERN.matcher(programName).replaceAll(REPLACEMENT_STRING) + "\" AND AIR_DocumentMilestone:\"" + "\"";
		String queryString2 = "AIR_Name:\"" + LUCENE_PATTERN.matcher(programName).replaceAll(REPLACEMENT_STRING);
		String orig = "AIR_Name:\"" + programName+ "\"";
		System.out.println(queryString);
		String mmm = "Lam 21\\" Upgrader" AND AIR_DocumentMilestone:"";
		System.out.println(orig);
		
	}
	
	private MurmurHash3()
    {
        // no instances.
    }

    /**
     * Hashes a 4-byte sequence (Java int).
     */
    public static int hash(int k)
    {
        k ^= k >>> 16;
        k *= 0x85ebca6b;
        k ^= k >>> 13;
        k *= 0xc2b2ae35;
        k ^= k >>> 16;
        return k;
    }

    /**
     * Hashes an 8-byte sequence (Java long).
     */
    public static long hash(long k)
    {
        k ^= k >>> 33;
        k *= 0xff51afd7ed558ccdL;
        k ^= k >>> 33;
        k *= 0xc4ceb9fe1a85ec53L;
        k ^= k >>> 33;

        return k;
    }
    
    
}
