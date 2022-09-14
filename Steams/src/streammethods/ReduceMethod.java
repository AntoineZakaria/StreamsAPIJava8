package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
 //reduce
public class ReduceMethod {

	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("A","B","C");
		
		Optional<String>x=myList.stream()
				.reduce((combinedValue,value)->{
			return combinedValue+value;
		});
		
		System.out.println(x.get());

	}

}
