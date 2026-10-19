package dwolf.collections.map_interface;

import java.util.HashMap;
import java.util.Map;

class FillMapWithoutReturn {

	void getData() {
		Map<String, String> myMap = new HashMap();
		myMap.put("First", "Hi");
		addingSecond(myMap);
		addingThird(myMap);
		addingForth(myMap);
		myMap.forEach((key, value) -> System.out.println(key + " " + value));
	}

	void addingSecond(Map<String, String> myMap) {
		myMap.put("Second", "this");
	}

	void addingThird(Map<String, String> myMap) {
		myMap.put("Third", "is");
	}

	void addingForth(Map<String, String> myMap) {
		myMap.put("Forth", "it!");
	}

	public static void main(String[] args) {
		new FillMapWithoutReturn().getData();
	}

}
