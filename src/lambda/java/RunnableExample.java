package lambda.java;

public class RunnableExample {
	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("This is a normal Thread Run Execution");
			}
			
		});
		myThread.run();
		
		Thread lambdaThread  = new  Thread (() -> System.out.println("This is lambda Thread Execuion"));
		lambdaThread.run();
		
	}
}
