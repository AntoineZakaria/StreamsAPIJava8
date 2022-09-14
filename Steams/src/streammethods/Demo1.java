package streammethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
	//nonterminal
	//distinct() limit()
	
	
	
	//terminal
	//count() forEach()
	
	
	
	public static void main(String[] args) {
		
		List<String> vehicles= Arrays.asList("bus","car","bus","car");

		List<String> destinctVehicles= new ArrayList<String>();
		
		destinctVehicles=vehicles.stream().distinct().collect(Collectors.toList());
		
		System.out.println(vehicles.stream().distinct().count());
		
		//System.out.println(vehicles.stream().limit(2).collect(Collectors.toList()));
		
	}

}
