
public class Student {

	String name;
	int age;
	static int count;
	
	
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	static {
		count=30;
		//age=20;
	}
	
	public Student() {}
	
	/*
	 * public Student(String name,int age) { this.name = name; //name = n; this.age
	 * = age; }
	 */
	
	
	public static void main(String[] args) {
		
		String name = null;
		System.out.println("name : "+name);
		
		
		Student obj1= new Student();
		obj1.name = "Mg Mg";
		obj1.age = 20;
		
		Student obj2= new Student();
		System.out.println("obj2 name : "+obj2.name);
		obj2.name = "Mg Mg";
		obj2.age = 20;
		
		Student obj3 =new Student("Su Su", 20);
		System.out.println("obj3 name : "+obj3.name);
		
		System.out.println("count : "+count++);
		System.out.println("count : "+count);
		System.out.println("count : "+Student.count);
	}
}
