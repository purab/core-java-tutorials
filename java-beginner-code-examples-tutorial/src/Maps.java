import java.util.HashMap;

public class Maps {
	
	public static void main(String[] args) {
		//maps will have key value pairs...
		HashMap<String, Integer> empIds = new HashMap<>();
		//add values to map
		empIds.put("purab", 1);
		empIds.put("sivan", 2);
		empIds.put("sanchi", 3);
		System.out.println(empIds);
		
		//print value by map key
		System.out.println(empIds.get("sanchi"));
		
		empIds.put("new key", 22222);//if key does not exits then add it
		System.out.println(empIds.containsKey("purab"));
		System.out.println(empIds.containsValue(2));
		empIds.replace("purab", 123);//if value exists then replace it
		
		System.out.println(empIds);
		
		//remove key value
		empIds.remove("purab");
		
	}

}
