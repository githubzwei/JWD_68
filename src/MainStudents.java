
public class MainStudents {
	public static void main(String[] args) {
		Students obj = new Students();
		obj.setName("Su Su");
		obj.setAge(20);
		
		int a=10;
		
		System.out.println("Name : "+obj.getName()+", Age : "+obj.getAge());
		
		int[] number = new int[3];
		number[0] = 10;
		System.out.println(number[0]);
		
		Students[] studentAry = new Students[3];
		studentAry[0] = obj;
		studentAry[1] = new Students();
		
		System.out.println(studentAry[0]);
		System.out.println(studentAry[0].getName());
	}
}
