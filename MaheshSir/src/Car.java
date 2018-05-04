
public class Car {

	void start(Integer i)
	{
		System.out.println("x");
	}
	void start(Short s)
	{
		System.out.println("y");
	}
	public static void main(String[] args) {
		short s=8;
		new Car().start(s);
	}
}
