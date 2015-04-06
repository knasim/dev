package InterAbstractorizer;

public class AbstractContractImpl implements Contract {

	@Override
	public String myName(String in) {
		String name = in;
		return name;
	}

	@Override
	public String myAddress(String in) {
		String address = in;
		return address;
	}

}
