package lambda.java;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		Greeting myLambda = () -> System.out.println("Hello Lambda");
		
		greeter.greet(myLambda);
	}
}


