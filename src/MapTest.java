import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
public static void main(String[] args) {
	Map<Integer, String> map = new HashMap<Integer, String>();
	map.put(1, "Java");
	map.put(3, "C#");
	map.put(2, "PHP");
	
	System.out.println(map);
	
	Map<String, String> map1 = new HashMap<String, String>();
	map1.put("ac", "Java");
	map1.put("ab", "C#");
	map1.put("b", "PHP");
	
	System.out.println(map1);
	
	for (Entry<String, String> entry : map1.entrySet()) {
		System.out.println(entry.getKey()+"="+entry.getValue());
	}
}
}
