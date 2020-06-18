import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierFI {
	
	public static void main(String... args) {
		
		Supplier<String> supplier = () -> "Good morning Mr. Stark";
		
		System.out.println(supplier.get());
		
		
		String[] st = {"Tony", "Jarvis", "Iron man", "vision", "Victoria", "Spiderman"};
    	
    	// I want to check string start with V or not?
    	 Predicate<String> predicate = s -> s.equals("Spiderman");
    	
    	 List<String> StrCollection = List.of(st);
    	 System.out.println(StrCollection.stream().filter(predicate).findAny().orElseGet(supplier));
    	
		
	}

}
