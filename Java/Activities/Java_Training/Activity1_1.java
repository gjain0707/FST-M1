package Java_Training;

public class Activity1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car toyota = new Car();
        toyota.make = 2014;
        toyota.color = "Black";
        toyota.transmission = "Manual";
    
        //Using Car class method
        toyota.displayCharacterstics();
        toyota.accelerate();
        toyota.brake();

	}

}

