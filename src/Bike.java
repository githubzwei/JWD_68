public abstract class Bike implements Printable {
	
	static String name;
	
	Bike() {
		System.out.println("bike is created");
	}

	public abstract void run();

	void changeGear() {
		System.out.println("gear changed");
	}
}

abstract class Bike1 {
}

