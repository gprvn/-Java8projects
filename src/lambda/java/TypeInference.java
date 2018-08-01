package lambda.java;

public class TypeInference {
	public static void main(String[] args) {
		printLambda(s -> s.length());
	}
	public static void printLambda(StringLength l) {
		System.out.println(l.getLength("This is my Name"));
	}
}


interface StringLength {
	int getLength (String s);
}
