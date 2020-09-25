
public class RunnableExample {

	public static void main(String... strings) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Jarvis create a new thread and print");
			}
		});

		thread.run();
		Thread newLambdaThread = new Thread( () -> System.out.println("Jarvis create a new thread using Lambda"));
		
		newLambdaThread.run();
		
		Runnable runnableLambdaThread = () -> System.out.println("Jarvis implement runnable using lambda");
		new Thread(runnableLambdaThread).run();
	}
}
