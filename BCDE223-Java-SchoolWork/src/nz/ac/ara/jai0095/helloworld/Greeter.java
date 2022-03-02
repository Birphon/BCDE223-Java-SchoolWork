package nz.ac.ara.jai0095.helloworld;

public class Greeter {
	protected String name = "unknown";
	protected String meme = "unknown";
	protected String greeting = "Hello";
	protected int greetingCount = 0;
	
	public void setName(String newName, String aMeme) {
		this.name = newName;
		this.meme = aMeme;
	}
	
	public int getCount() {
		return this.greetingCount;
	}
	
	public String greet() {
		this.greetingCount++;
		return this.greeting + " " + this.name + " \n This Greeter has run: " + this.greetingCount + " times";
	}
}
