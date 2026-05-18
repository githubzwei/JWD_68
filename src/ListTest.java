import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {
	public static void main(String[] args) {
		ArrayList lst1 = new ArrayList();
		lst1.add(1);
		lst1.add(2.3);
		lst1.add(true);
		lst1.add('a');
		lst1.add(null);
		lst1.add(2.3);
		lst1.add("Java");
		
		System.out.println(lst1);
		
		double point= (double) lst1.get(1);
		char ch = (char) lst1.get(3);
		
		ArrayList<String> lst2=new ArrayList<String>();
		lst2.add("Java");
		lst2.add("PHP");
		lst2.add("C#");
		
		System.out.println(lst2);
		
		String language = lst2.get(1);
		System.out.println(lst2.size());
		
		System.out.println(lst2.contains("PHP"));
		
		
		Iterator<String> itr = lst2.iterator();
		while(itr.hasNext()) {
			String data = itr.next();
			if(data.equals("PHP")) {
				//itr.remove();
				System.out.println(data);
			}
		}
		
		/*
		 * for (String value : lst2) { if(value.equals("C#")) {
		 * //System.out.println(value); lst2.remove(value); } }
		 */
		System.out.println("lst2 : "+lst2);
	}
}
