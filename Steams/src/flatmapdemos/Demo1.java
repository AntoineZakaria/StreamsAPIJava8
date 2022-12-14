package flatmapdemos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);

		List<Integer> result = new ArrayList<Integer>();
		
		result=list.stream()
		.map(n->n+10)
		.collect(Collectors.toList());
		
		
		
		
		List<Integer> list1 = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(3,4);
		List<Integer> list3 = Arrays.asList(5,6);
		
		
		
		List<List<Integer>> bigList = Arrays.asList(list1,list2,list3);
		//System.out.println(bigList);
		
		result=bigList.stream()
		.flatMap(x->x.stream()
				.map(n->n+10))
		.collect(Collectors.toList());
		
		
		
		System.out.println(result);

		
	}

}
