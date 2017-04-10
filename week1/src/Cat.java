import java.awt.Color;

public class Cat {
	private String name;
	private int age;
	private Color fur, eyes;
	
	public Cat(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return "Cat named " + name + " is " + age + " years old.";
	}
	
	public void meow(){
		System.out.println("Meow!");
	}
	
	public void hiss(){
		System.out.println("Hiss! Hiss! " + name + " doesn't like you.");
	}
	
	public void purr(){
		System.out.println("Purrrrr... :3 " + name + " tolerates you.");
	}
	
	public void eat(){
		System.out.println("Nom nom nom... " + name + " eats");
	}
	
	public void drink(){
		System.out.println("Lap lap lap... "+ name + " drinks");
	}
	
	public void sleep(){
		System.out.println("Zzz... " + name + " sleeps.");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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