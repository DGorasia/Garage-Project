import java.util.ArrayList;

public class RunnerClass {
	
	static ArrayList<Vehicle> store = new ArrayList<Vehicle>();
	
	public static void main(String[] args) {
	
		
		Garage object = new Garage();
		// Scanner scanner = new Scanner(System.in);

		// System.out.println("Please enter your query");
		// String input = scanner.nextLine();
		// System.out.println ("")

		Car car1 = new Car("With Roof", 1, "Saloon", "Mercedes", "Silver", "2 years old");
		Car car2 = new Car("With Roof", 2, "Estate", "BMW", "Blue", "1 year old");
		Motorcycle cycle1 = new Motorcycle("Without Roof", 3, "Two Wheeler", "Honda", "Black", "5 years old");
		Motorcycle cycle2 = new Motorcycle("Without Roof", 4, "Two Wheeler", "BMW", "Orange", "6 years old");

		object.store.add(car1);
		object.store.add(car2);
		object.store.add(cycle1);
		object.store.add(cycle2);
		object.store.remove(cycle2);
		
		for (int i =0; i < store.size(); i++) {
			System.out.println(store.get(i));
		}
	
		//Find that it exists
		//System.out.println(object.store);

		object.removeVehicle(4);
		object.removeVehicle(4);
		object.printVehicles("Mercedes");
		object.fixVehicle();
		object.costperparts();
		object.calculateBill(72, 500);
		// object.emptyGarage(4, "Saloon", "Mercedes");
		// Creating the ArrayList to store the objects created.

		

		System.out.println("Unique ID = " + ((car1.Unique) + "      " + "ID = " + (car1.ID) + "   " + "   " + "Type = "
				+ (car1.Type) + "     " + "   " + "Name = " + (car1.Name) + " " + "Colour = " + (car1.Colour) + "  "
				+ "Age = " + (car1.Age)));
		System.out.println("Unique ID = " + ((car2.Unique) + "      " + "ID = " + (car2.ID) + "   " + "   " + "Type = "
				+ (car2.Type) + "     " + "   " + "Name = " + (car2.Name) + "      " + "Colour = " + (car2.Colour)
				+ "    " + "Age = " + (car2.Age)));
		System.out.println("Unique ID = " + ((cycle1.Unique) + "   " + "ID = " + (cycle1.ID) + "   " + "   " + "Type = "
				+ (cycle1.Type) + "   " + "Name = " + (cycle1.Name) + "    " + "Colour = " + (cycle1.Colour) + "   "
				+ "Age = " + (cycle1.Age)));
		System.out.println("Unique ID = " + ((cycle2.Unique) + "   " + "ID = " + (cycle2.ID) + "   " + "   " + "Type = "
				+ (cycle2.Type) + "   " + "Name = " + (cycle2.Name) + "      " + "Colour = " + (cycle2.Colour) + "  "
				+ "Age = " + (cycle2.Age)));

		/*
		 * ArrayList vehicleManufacturer = new ArrayList();
		 * 
		 * vehicleManufacturer.add("Audi"); vehicleManufacturer.add("BMW");
		 * vehicleManufacturer.add("VW"); vehicleManufacturer.add("Mercedes");
		 * vehicleManufacturer.add("Toyota"); vehicleManufacturer.add("Honda");
		 * vehicleManufacturer.add("Renault"); vehicleManufacturer.add("Nissan");
		 */
		// current arrayList

		// System.out.println("ArrayList contents " + vehicleManufacturer);

	}

}
