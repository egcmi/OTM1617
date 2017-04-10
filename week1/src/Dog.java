import java.awt.Color;

public class Dog {
	private String name;
	private int age;
	private Color fur, eyes;

	public Dog(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return "Dog named " + name + " is " + age + " years old.";
	}
	
	public void eat(){
		System.out.println("Nom nom nom... " + name + " eats");
	}
	
	public void drink(){
		System.out.println("Lap lap lap... "+ name + " drinks");
	}
	
	public void bark(){
		System.out.println("Bark! Bark!");
	}
	
	public void wag(){
		System.out.println(name + " wags its tail. " + name + " is happy to see you!");
	}
	
	public void sleep(){
		System.out.println("Zzz... " + name + " sleeps.");
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Color getFur() {
		return fur;
	}

	public void setFur(Color fur) {
		this.fur = fur;
	}

	public Color getEyes() {
		return eyes;
	}

	public void setEyes(Color eyes) {
		this.eyes = eyes;
	}
}
