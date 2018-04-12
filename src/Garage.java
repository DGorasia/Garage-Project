import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Scanner;

public class Garage {

	ArrayList<Vehicle> store = new ArrayList<Vehicle>();
	
	public void printVehicles(String name ) {
		
		for (int v = 0; v < store.size(); v++) {
			if (name == store.get(v).Name) {
				System.out.println(store.get(v).Name);
				
			}
		}
		
	}

	public void fixVehicle() {
		int fix = 10;

		int totalfixcost = 60;

		for (int x = 0; x >= 5; x++) {

			for (int y = 0; y >= 1; y++) {

				x = fix;
				y = totalfixcost;

			}

		}
	}
	
	public void costperparts() {
		int costperparts = 20;

		for (int z = 0; z >= 1; z++) {
			z = costperparts;
		}
	}

	public void calculateBill(int fix, int costperparts) {

		int total;
		float tax;

		total = fix + costperparts;
		tax = (float) (1.20) * total;

		System.out.println("The total bill for your vehicle is " + "£" + total);
		System.out.println("The VAT charged against your bill is " + "£" + tax);

	}

	public void removeVehicle(int ID) {

		for (int e = 0; e < store.size(); e++) {

			if (ID == store.get(e).ID) {

				store.remove(e);

			}

		}

	}

}
