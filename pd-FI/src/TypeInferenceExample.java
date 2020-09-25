
public class TypeInferenceExample {

	
	public static void main(String...string) {
		StringLengthLambda stringLambda = s -> s.length();
		System.out.println(stringLambda.getLength("Jarvis"));
	}
	
	
	@FunctionalInterface
	interface StringLengthLambda{
		int getLength(String s);
	}
	
}
