package JavaApplication1;
public class dog
{
	
private String dogname;  // Global Variables 
private int dogage;
private int price;
private String furcolor;

public dog() {
	
	dogname=""; dogage=0;
} // Default constructor

public dog(String dogname, int dogage ) {
	
	this.dogname = dogname; this.dogage = dogage ;
	
} // Non-Default constructor

public void setName(String Name) {
	dogname = Name;
} // setter (mutator)

public void setAge(int Age) {
	dogage = Age;
} // accessor (getter)

public String getName() {
	return dogname;  
} // accessor (getter)

public int getAge() {
	return dogage;
} // accessor (getter)

public void setPrice(int Price) {
	price = Price;
	
} // setter (mutator)

public void setColor(String Color) {
	furcolor = Color;
} // setter (mutator)

public int getPrice() {
	return price;
} // accessor (getter)

public String getColor() {
	return furcolor;
} // accessor (getter)

}

