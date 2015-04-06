package looperizer;

public class SomeThing<Thing> {

	public Thing something;
	
	public SomeThing(Thing thing) {
		this.setSomething(thing);
	}
	
	public Thing getSomething() {
		return something;
	}

	public void setSomething(Thing something) {
		this.something = something;
	}

	public static void main(String[] args) {
		SomeThing<Integer> s = new SomeThing<Integer>(new Integer(54));
		System.out.println(s.getSomething());
	}
	
	/*T sum(T data[], int size, T s) {
		for(int i=0; i<size; i++) 
		s+=data[i];
		return s;
}	*/

}
