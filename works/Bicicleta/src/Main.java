
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create two different 
        // Bicycle objects
        Bicicleta bike1 = new Bicicleta();
        Bicicleta bike2 = new Bicicleta();

        // Invoke methods on 
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();

	}

}
