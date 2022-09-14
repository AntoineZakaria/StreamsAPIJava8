package filterdemos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id ;
	String name;
	
	double price;

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}

public class FilterDemo3 {

	public static void main(String[] args) {
		
		
		List<Product> products=new ArrayList<Product>();
		
		products.add(new Product(1,"book",100));
		products.add(new Product(2,"laptop",400));
		products.add(new Product(3,"watch",500));
		products.add(new Product(4,"mobile",300));
		
		
		
		

		List<Product> expensiveProducts=products.stream()
		.filter(product->product.price>300)
		.collect(Collectors.toList());
		
		
		
		System.out.println(expensiveProducts);
		
		

	}

}
