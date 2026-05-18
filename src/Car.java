class Car {
	int speed;
	double regularPrice;
	String color;

	Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}// car cons

	double getSalePrice() {
		return regularPrice;
	}// getsaleprice method
}// car class
