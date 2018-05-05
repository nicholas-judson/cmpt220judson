
public class Test2 {

	public static void main(String[] args)throws java.io.IOException {
		
		java.io.File file = new java.io.File("carRepair2.txt");
		
		if(file.exists()) {
			System.out.println("File already exists. ");
			System.exit(1);
		}
		
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		Customer[] CustomerArray = new Customer[1];
		CustomerArray[0] = new Customer(1, "Nicholas", "Judson", "111 Grandview Drive Valatie, NY 12184", "(518) 867 - 7787", "nicholas.judson1@marist.edu");
		output.println("Customer ID: " + CustomerArray[0].getCustomerId());
		output.println("First Name: " + CustomerArray[0].getFirstName());
		output.println("Last Name: " + CustomerArray[0].getLastName());
		output.println("Address: " + CustomerArray[0].getAddress());
		output.println("Phone Number: " + CustomerArray[0].getPhoneNumber());
		output.println("Email Address: " + CustomerArray[0].getEmailAddress());
		
		
		Mechanic[] MechanicArray = new Mechanic[1];
		MechanicArray[0]= new Mechanic("Hudson, NY", 1, "Bruce", "Webster", "150 VanBuren Ave Niverville, NY 12184", "(518) 867 - 7705", "bruce.webster@gmail.com");
		output.println("Location: " + MechanicArray[0].getMechanicId());
		output.println("First Name: " + MechanicArray[0].getFirstName());
		output.println("Last Name: " + MechanicArray[0].getLastName());
		output.println("Address: " + MechanicArray[0].getAddress());
		output.println("Phone Number: " + MechanicArray[0].getPhoneNumber());
		output.println("Email Address: " + MechanicArray[0].getEmailAddress());
		
		Repair[] RepairArray = new Repair[1];
		RepairArray[0] = new Repair("Alternator", 150.00, .08, 80, 20, 0.0, "Volkswagen", "Jetta", 2010);
		output.println("Part Name: " +RepairArray[0].getPartName());
		output.println("Part Cost: $" + RepairArray[0].getPartCost());
		output.println("Tax Rate: " + RepairArray[0].getTaxRate());
		output.println("Hourly Rate: $" + RepairArray[0].getHourlyRate());
		output.println("Hours Worked: " + RepairArray[0].getHoursWorked());
		output.println("Discount: $" + RepairArray[0].getDiscount());
		output.println("Make: " + RepairArray[0].getMake());
		output.println("Model: " + RepairArray[0].getModel());
		output.println("Year: " + RepairArray[0].getYear());
		output.println(RepairArray[0].printRepairCost());
		
		output.close();
	}

}
