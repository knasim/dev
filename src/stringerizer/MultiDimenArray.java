package stringerizer;

public class MultiDimenArray {

	public static final String[][] SERVICES_AND_DESCRIPTIONS = {{"Food", "Energy", "Resources", "Govt" },
		{"Agriculture", "Nuclear Energy", "Land Exploration", "Policy"}};
	
	public static void main(String[] args) {
		
	for(int x=0; x<SERVICES_AND_DESCRIPTIONS.length; x++) {
			String[] nestarray =  SERVICES_AND_DESCRIPTIONS[x];
			
			for(int j=0; j<nestarray.length; j++) {
				System.out.println(nestarray[j]);
			}
		}
	}
}