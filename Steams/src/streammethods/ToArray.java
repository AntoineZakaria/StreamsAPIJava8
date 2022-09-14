package streammethods;

import java.util.Arrays;
import java.util.List;

public class ToArray {

	public static void main(String[] args) {
		
		
		List<String> myList = Arrays.asList("A","B","C");
		
		Object arr[] = myList.stream().toArray();
				
		for(Object var:arr)
		System.out.println(var);
	}

}
