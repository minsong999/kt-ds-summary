package generic_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListExam {
	public static void main(String[] args) {
		
		//선언
		List<Integer> list = new ArrayList<>();
		
		//메소드  add, size, isEmpty, contains, remove, addAll, clear, get, of

		boolean isAdd = list.add(1);
		int size = list.size();
		//System.out.println(size);
		boolean isEmpty = list.isEmpty();
		boolean isContains = list.contains(1);
		int isRemove=list.remove(0);
		list.clear();
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(8);
		list.add(9);
		
		list.remove(2); //해당 인덱스 삭제 후 그 뒷 인덱스들의 인덱스는 -1이 된다.
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+"번째 인덱스 값은 "+list.get(i));
		}
		
		int firstIndexOflist = list.get(0);
		//System.out.println(firstIndexOflist);
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.addAll(list);
		
		System.out.println(list2);
		
		System.out.println(System.identityHashCode(list));
		System.out.println(System.identityHashCode(list2));

		List<Integer> list3 = List.of(1,3); //of로 만든 경우 List라 추가/삭제가 불가능하다.
		//System.out.println(list3);
		
		//list3.remove(0); //java.lang.UnsupportedOperationException
		//list3.add(1); //java.lang.UnsupportedOperationException
		
		Map<String, Integer> priceMap = new HashMap<>();
		priceMap.put("lggram", 145555);
		priceMap.put("lggram", 567);
		System.out.println(priceMap);
		
		
	}
}
