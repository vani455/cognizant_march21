package overriding;

public class Monkey extends Animal {

	@Override
	public void eat() {
		System.out.println("Monkey intake food from hand");
	}
}
