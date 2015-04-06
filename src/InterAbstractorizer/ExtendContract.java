package InterAbstractorizer;

public class ExtendContract extends AbstractContractImpl implements Contract {

	public static void main(String[] args) {
		ExtendContract c = new ExtendContract();
		System.out.println(c.myName("khurrum"));
		System.out.println(c.myAddress("???"));
	}
}