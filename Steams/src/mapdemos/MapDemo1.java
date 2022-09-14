package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		
		
		List<String> vehicles= Arrays.asList("bus","car","train","truck");
		
		List<String> vehiclesInUpperCase = new ArrayList<String>();
		

		
	    /*	
		for(String name:vehicles)
		{
			vehiclesInUpperCase.add(name.toUpperCase());
		}
		
		System.out.println(vehiclesInUpperCase);
		
		*/
		
		
		
		
		vehicles.stream()
		.map(n->n.length()).forEach(n->System.out.println(n));
		
		
		
		//System.out.println(vehicles);

		//System.out.println(vehiclesInUpperCase);

		
		
	}

}
