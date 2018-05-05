
public class Test {

	public static void main(String[] args) {
		Customer[] CustomerArray = new Customer[1];
		CustomerArray[0] = new Customer(1, "Nicholas", "Judson", "111 Grandview Drive Valatie, NY 12184", "(518) 867 - 7787", "nicholas.judson1@marist.edu");
		System.out.println(CustomerArray[0].toString());
		
		Mechanic[] MechanicArray = new Mechanic[1];
		MechanicArray[0]= new Mechanic("Hudson, NY", 1, "Bruce", "Webster", "150 VanBuren Ave Niverville, NY 12184", "(518) 867 - 7705", "bruce.webster@gmail.com");
		System.out.println(MechanicArray[0].toString());
	
		Repair[] RepairArray = new Repair[1];
		RepairArray[0] = new Repair("Alternator", 150.00, .08, 80, 20, 0.0, "Volkswagen", "Jetta", 2010);
		System.out.println(RepairArray[0].toString());
		System.out.println(RepairArray[0].printRepairCost());
		
	}

}
