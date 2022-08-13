package Assignment2;

public class Downcasting extends Candidate{
static void method(Candidate C) {
	if( C instanceof Downcasting) {
		Downcasting D = (Downcasting) C;
		System.out.println("Downcasting is ok");
	}
}
public static void main(String[] args) {
	Candidate C = new Downcasting();
	Downcasting.method(C);
}
}
