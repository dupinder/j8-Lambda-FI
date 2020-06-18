import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

// Predicate FI is used for test and need boolean value
// Example number is greater or not.

public class PredicateIF {

    public static void main(final String... args) {
        
    	Predicate<Integer> p = i -> i > 10;
    	Predicate<Integer> p1 = i -> i%2==0;
    	
    	System.out.println(p.test(200));
    	System.out.println(p.test(2));
    	System.out.println("is Even number :"+p1.test(2));
    	System.out.println("is Even number :"+p1.test(10));
    	System.out.println("is Even number :"+p1.test(9));
    	
    	String[] st = {"Tony", "Jarvis", "Iron man", "vision", "Victoria"};
    	
    	// I want to check string start with V or not?
    	 Predicate<String> stv = s -> s.charAt(0)=='v' || s.charAt(0)=='V';
    	
    
    	 List<String> stWithV = List.of(st);
    	 stWithV.stream().filter(stv).forEach( o -> System.out.println("Strings starts with v are :"+ o));
    	

    	// User example;
    	 
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("UserName: ");
    	 String username = sc.next();
    	 System.out.println("Password:");
    	 String pwd = sc.next();
    	 User us =  new User(username, pwd);
    	 Predicate<User> userPredicate = user -> user.username.equals("Tony");
    	 if(userPredicate.test(us))
        	System.out.println("Hello Mr Stark, I am your assistant Jarvis <3");
    	 else
        	System.out.println("Please verify :( you are not Tony");
    	 
    }
}


class User{
	String username;
	String pwd;
	public User(String username, String pwd){
		this.username = username;
		this.pwd = pwd;
	}
}
