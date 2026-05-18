interface Printable {
	String name="Mg Mg";
	void print();
}

interface Showable extends Printable {
	void show();
}

public class TestInterface extends Bike implements Printable, Showable  {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print : "+Printable.name);
		Printable.name = "Ag Ag";
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		TestInterface t = new TestInterface();
		t.print();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
