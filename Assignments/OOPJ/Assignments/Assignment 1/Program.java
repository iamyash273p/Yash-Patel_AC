
public class Program {

	public static void main(String[] args) {
		Date objDate = new Date();
		
		System.out.println("Enter the day");
		int day = ConsoleInput.getInt();
		
		System.out.println("Enter the Month");
		int month = ConsoleInput.getInt(); 
		
		System.out.println("Enter the Year");
		int year = ConsoleInput.getInt();
		
		
		objDate.setDate(day, month, year);
		
		System.out.println("Date: ");
		System.out.println(objDate.getDay() + "/" + objDate.getMonth() + "/" + objDate.getYear());
		
		
		System.out.println("How many days you want to add");
		int days = ConsoleInput.getInt();
			
		objDate.addDays(days);
		

		System.out.println("Date after add: ");
		System.out.println(objDate.getDay() + "/" + objDate.getMonth() + "/" + objDate.getYear());
	}

}