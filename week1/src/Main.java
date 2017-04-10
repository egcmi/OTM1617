import java.awt.Color;

public class Main {

	public static void main(String[] args) {

		Cat felix = new Cat("Felix", 5);
		felix.setEyes(Color.GREEN);
		felix.setFur(Color.ORANGE);
		System.out.println(felix);
		
		Dog otto = new Dog("Otto", 2);
		otto.setEyes(Color.BLUE);
		otto.setFur(Color.BLACK);
		System.out.println(otto);
		
		felix.sleep();
		otto.bark();
		felix.hiss();
		otto.wag();
		felix.meow();
		otto.sleep();
		felix.purr();
		felix.drink();
		otto.eat();
		felix.eat();
		otto.bark();
		otto.drink();
	}

}
