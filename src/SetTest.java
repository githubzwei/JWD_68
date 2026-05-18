import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
//import java.util.TreeSet;
//import java.util.TreeSet;


public class SetTest {
	public static void main(String[] args) {
		HashSet<String> set1=new HashSet<String>();
		set1.add("Java");
		set1.add("Python");
		set1.add("PHP");
		set1.add("HTML");
		set1.add(null);
		System.out.println("set1 : "+set1);
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);

		System.out.println("set2 : "+set2);
		
		TreeSet<String> set3=new TreeSet<String>();
		set3.add("Java");
		set3.add("Python");
		set3.add("PHP");
		set3.add("Php");
		set3.add("HTML");
		//set3.add(null);
		System.out.println("set3 : "+set3);
	}
}
