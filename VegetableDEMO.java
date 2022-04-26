import java.util.*;
abstract class Vegetable{
	abstract String tostring();
}
class Potato extends Vegetable{
	String tostring(){;
	return "BROWN";}
}
class Brinjal extends Vegetable{
	String tostring(){;
	return "VIOLET";}
}
class Tomato extends Vegetable{
	String tostring(){;
	return "RED";}
}
class VegetableDEMO{
	public static void main(String args[]){
		Vegetable v = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a vegetable name");
		String name = sc.nextLine();
		

		switch(name)
		{
			case "Potato":
			v = new Potato();
			break;
			case "Brinjal":
			v = new Brinjal();
			break;
			case "Tomato":
			v = new Tomato();
			break;
		}
		System.out.println(" vegetable colour" +" "+ v.tostring());
	}
}