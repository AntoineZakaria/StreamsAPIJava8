package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {
	
		
		List<Integer> myNumbers = Arrays.asList(10,15,20,25,30,35);
		List<Integer> evenNumbers = new ArrayList<Integer>();
		
	
		
		for(int n :myNumbers)
		{
			
			if(n%2==0)
				evenNumbers.add(n);
			
		}
		
		System.out.println(evenNumbers);
		
		
		
		/* 
		myNumbers.stream().
		filter(n->n%2==0).
		forEach(n->System.out.println(n));
		
		
		evenNumbers=myNumbers.stream().
		filter(n->n%2==0).
		collect(Collectors.toList());
		
		System.out.println(evenNumbers);

		 */
		
		
		
	}

}
