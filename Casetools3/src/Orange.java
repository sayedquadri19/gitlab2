
public class Orange {
	String color;
	Orange(String color)
	{
	this.color=color;
	}
	
	String getColor()
	{
	return color;
	}

	public static void main(String[] args) {
		Orange greenApple = new Orange("green");
		String color = greenApple.getColor();
		System.out.println("color of apple is" + color);
		
		// TODO Auto-generated method stub

	}

}
