import java.util.Scanner;

public class Automobile {
	// Private variables to store vehicle information
	private String make;
	private String model;
	private String color;
	private int year;
		
	// Constructor to initialize the vehicle information
	public Automobile(String make, String model, String color, int year) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
	}
		
	// Method to remove vehicle information if provided values match stored values
	public String removeVehicle(String autoMake, String autoModel, String autoColor, int autoYear) {
		// Check if provided values match stored values
		if (autoMake.equals(make) && autoModel.equals(model) && autoColor.equals(color) && autoYear == year) {
			// Remove vehicle information
			make = null;
			model = null;
			color = null;
			year = 0;
			return "Vehicle information removed.";
		} else {
			// Return message indicating mismatch
			return "Mismatch: Vehicle information not removed.";
		}
	}
	
	
	// Method to display vehicle information
	public void displayVehicleInfo() {
		// Display vehicle information
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Year: " + year);
	}
		
		
	public static void main(String[] arges) {
		Scanner scanner = new Scanner(System.in);
	
		// Prompt user to enter vehicle details
		System.out.print("Enter make: ");
		String make = scanner.nextLine();
		System.out.print("Enter model: ");
		String model = scanner.nextLine();
		System.out.print("Enter color: ");
		String color = scanner.nextLine();
		System.out.print("Enter year: ");
		int year = scanner.nextInt();
		
						
		// Creating an instance of AutomobileClass with user-provided details
		Automobile car = new Automobile(make, model, color, year);
			
		// Display initial vehicle information
		System.out.println("\nInitial Vehicle Informtion:");
		car.displayVehicleInfo();
		
		// Prompt user if they want to remove the vehicle
		System.out.print("\nDo you want to remove this vehicle? (yes/no): "); 
		scanner.nextLine();  // Consume newline left-over
		String removeOption = scanner.nextLine();
		
		
		if (removeOption.equalsIgnoreCase("yes")) {
			// Attempting to remove the vehicle
			String removalResult = car.removeVehicle(make, model, color, year);
			System.out.println(removalResult);	
			
		} else if (!removeOption.equalsIgnoreCase("no")) {
			System.out.println("Vehicle not removed.");
			
		} else {
			System.out.println("Invalid input. Pleae enter 'yes' or 'no'.");
					
		}
											
	
	
		// Closing scanner
		scanner.close();	
		
	
	}
	
	
}
	
		
	

	
		
	

	
	
