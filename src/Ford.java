class Ford extends Car {
	int year;
	int manufactureDiscount;

	Ford(int speed, double regularPrice, String color, int year, int manufactureDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufactureDiscount = manufactureDiscount;

	}// ford con

	double getSalePrice() {
		return super.getSalePrice() - manufactureDiscount;
	}

	@Override
	public String toString() {
		return "Ford [year=" + year + ", manufactureDiscount=" + manufactureDiscount + ", speed=" + speed
				+ ", regularPrice=" + regularPrice + ", color=" + color + "]";
	}// toString

}// Ford