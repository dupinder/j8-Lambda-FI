import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class lambdaExcersize {

	
	public static void main(String...strings) {
		
		List<Person> person =  Arrays.asList(new Person("Dupinder", 26), new Person("Mohit", 23));
		
		Predicate<Person> predicate = s -> s.getUserName().charAt(0) == 'D';
		
		person.stream().filter(predicate).forEach( o -> System.out.println("Name with D is :" + o.getUserName()));
		
		person.forEach( (p) ->  System.out.println(p.getUserName()));
	}
	
}

class Person{
	
	private String userName;
	private int age;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String userName, int age) {
		super();
		this.userName = userName;
		this.age = age;
	}
	
	
	
}
