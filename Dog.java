public class Dog {

	public String color, name, breed;

	public void barking() {
		System.out.println(name+" is barking");
	}
	
	public static void main(String[] args) {
	
		Dog rocky = new Dog();
		rocky.color = "black";
		rocky.name = "Rocky";
		rocky.breed = "Huskey";
		
		rocky.barking();
		
		Dog tommy = new Dog();
		tommy.color = "white";
		tommy.name = "Tommy";
		tommy.breed = "Bulldog";
		
		tommy.barking();
		
		
	}
}