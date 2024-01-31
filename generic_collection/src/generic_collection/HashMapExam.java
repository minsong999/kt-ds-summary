package generic_collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {
	public static void main(String[] args) {
		// key는 중복이 불가능하나 value는 중복이 가능하다.
		Map<Integer, String> stringMap = new HashMap<Integer, String>();
		// put(k) - key에 해당하는 값 없으면 insert 있으면 update
		stringMap.put(1, "!");
		stringMap.put(1, "@");
		stringMap.put(4, "5");
		stringMap.put(6, "min");
		// get(k) - 존재하지 않는 키로 조회하면 null 이 나옴
		System.out.println(stringMap.get(2));
		// remove(k)
		stringMap.remove("1");
		System.out.println(stringMap);

		// clear()
		stringMap.clear();
		System.out.println(stringMap);

		// stringMap = null;
		// isEmpty() -- 사용 전에 Map의 null Validation 체크가 필요하다.
		boolean isStringMapIsEmpty = stringMap.isEmpty();
		System.out.println(isStringMapIsEmpty);

		// containsKey
		stringMap.put(1, "!");
		stringMap.put(1, "@");
		stringMap.put(4, "5");
		stringMap.put(6, "min");
		boolean isKey4 = stringMap.containsKey(4);
		System.out.println(isKey4);
		boolean isKey5 = stringMap.containsKey(5);
		System.out.println(isKey5);

		// containsValue
		boolean isValue5 = stringMap.containsValue("5");
		System.out.println(isValue5);
		boolean isValue3 = stringMap.containsValue("3");
		System.out.println(isValue3);

		// putAll
		Map<Integer, String> stringMap2 = new HashMap<Integer, String>();
		stringMap2.put(1, "!");
		stringMap2.put(588, "@");
		stringMap2.put(954, "5");

		System.out.println(stringMap);
		stringMap.putAll(stringMap2);

		System.out.println(stringMap);

	}
}
