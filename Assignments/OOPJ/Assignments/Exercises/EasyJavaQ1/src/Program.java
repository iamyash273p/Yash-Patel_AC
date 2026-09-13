
public class Program {

	public static void main(String[] args) {
		
		Student john = new Student();
		
		john.setRollNo(2);
		john.setName("John");
		john.setPhoneNo("1234567890");
		john.setAddress("America");
		
		Student sam = new Student();
		
		sam.setRollNo(1);
		sam.setName("Sam");
		sam.setPhoneNo("0987654321");
		sam.setAddress("Africa");
		
		System.out.println("Student Name: " + john.getName() + " " + john.getRollNo() + " " + john.getPhoneNo() + " " + john.getAddress());
		
		System.out.println("Student Name: " + sam.getName() + " " + sam.getRollNo() + " " + sam.getPhoneNo() + " " + sam.getAddress());
		
	}

}
