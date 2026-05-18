class Sedan extends Car {
	int length;

	Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}// sedan con

	double getSalePrice() {
		if (length > 20) {
			return regularPrice * 0.95;
		} else {
			return regularPrice * 0.9;
		}
	}// method

	@Override
	public String toString() {
		return "Sedan [length=" + length + ", speed=" + speed + ", regularPrice=" + regularPrice + ", color=" + color
				+ "]";
	}// to string
}// sedan
