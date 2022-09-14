package mapdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {
	
	
	
	public static void main(String[] args)
	{
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		
		
		
		numbers.stream()
		.map(n->n*3)
		.filter(n->n>6)
		.forEach(System.out::println);
		
		
				
		
		
		
		
		
		
		
	}

}
