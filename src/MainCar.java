
public class MainCar {
	public static void main(String[] args) {
		Truck t =new Truck(100, 20000, "black", 30);
		System.out.println(t.speed+", "+t.color);
		System.out.println(t.getSalePrice());
		System.out.println(t);
		
		
	}
}
