package special;

public class TreeType {
	
	private final String name;
	private final int age;
	private final double length;
	
	public TreeType(String name, int age, double length) {
		this.name = name;
		this.age = age;
		this.length = length;		
	}
	
	public void draw (int posX, int posY) {
		String TTInfo = this.name + "_" + this.age + "_" + this.length;
		System.out.println("TreeType  : " + posX + "_" + posY + "_" + TTInfo);
	}	
	
}
