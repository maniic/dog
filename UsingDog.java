package JavaApplication1;

public class UsingDog {

	public static void main(String [] args) {
		dog puppy = new dog(); // Default constructor
		dog german = new dog("Max", 2); // sets dogname as Max and dogage as 2 . This is a non-default constructor
		
		puppy.setName("Jason");
		puppy.setAge(5);
		puppy.setColor("Golden");
		puppy.setPrice(200);
		
		german.setColor("Brown");
		german.setPrice(500);
		
		System.out.println(puppy.getName() + " " + puppy.getAge() +" "+"years old" + " " + puppy.getPrice() + "$" + " " + puppy.getColor());
		
		System.out.print(german.getName() + " " + german.getAge() +" " + "years old" + " " + german.getPrice() + "$" + " " + german.getColor());
	}
		
		
		
		
	}
