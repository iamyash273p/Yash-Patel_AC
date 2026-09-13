
public class Employee {
	
	private String name;
	private int yearOfjoining;
	private double salary;
	private String address;
	
	Employee(String name, int yearOfjoining, double salary, String address){
		
		this.name = name;
		this.yearOfjoining = yearOfjoining;
		this.salary = salary;
		this.address = address;
	}
	
	public void getInfo(double salary, int hours) {
		
	}
	
	public void display() {
		
		System.out.println(this.name + " " + this.yearOfjoining + " " + this.address + " ");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Name  YOJ  Address");
		Employee e1 = new Employee("Robert", 1994, 20000, "64C-WallsStreat");
		e1.display();
		Employee e2 = new Employee("Sam", 2000, 25000, "68C-WallsStreat");
		e2.display();
		Employee e3 = new Employee("John", 1999, 10000, "26C-WallsStreat");
		e3.display();
		
	}

}
