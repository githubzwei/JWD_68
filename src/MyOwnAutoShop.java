public class MyOwnAutoShop {
public static void main(String[] args) {
   Truck t=new Truck(30, 2000, "white", 3000);
   System.out.println(t.getSalePrice());
   System.out.println(t);
   
   Ford f=new Ford(0, 0, null, 0, 0);
   System.out.println(f.getSalePrice());
   System.out.println(f);
   
   Sedan s=new Sedan(0, 0, null, 0);
   System.out.println(s.getSalePrice());
   System.out.println(s);
   
   Car c = new Car(20, 10000,"red");
}
   
}