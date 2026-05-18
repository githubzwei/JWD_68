class Truck extends Car {
	int weight;

	Truck(int speed, double regularPrice, String color, int weight) {// t cons
		super(speed, regularPrice, color);
		this.weight = weight;
		
	}// t con
	
	double getSalePrice(){// method
		if (weight > 2000) {
			return  regularPrice * 0.9;
		} else {
			return regularPrice * 0.8;
		}
	}

	@Override
	public String toString() {// tostring
		return "Truck [weight=" + weight + ", speed=" + speed + ", regularPrice=" + regularPrice + ", color=" + color
				+ "]";
	}// t String
}// t car
