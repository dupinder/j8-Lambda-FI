import java.util.List;
import java.util.function.Consumer;

public class ConsumerFI {

	
	public static void main(String... args) {
		
		Consumer<Integer> consumer = t -> System.out.println("Printing : "+ t);
		
		consumer.accept(20);
		
		List<Integer> list1 =  List.of(1,2,3,4,5,6);
		list1.stream().forEach(consumer);
		
		// Or we can directly pass lambda expression
		list1.forEach(t -> System.out.println("Printing : "+ t));
		
	}

}
