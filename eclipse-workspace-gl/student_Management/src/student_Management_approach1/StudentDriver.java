package student_Management_approach1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDriver {

	private static List<Student> studentList = null;
	private static Scanner scanner = null;

	public static void main(String[] args) {
		StudentService service = new StudentService();
		studentList = new ArrayList<>();
		scanner = new Scanner(System.in);
		boolean isExit = true;

		while (isExit) {
			System.out
					.println("1. Add Student\n2. Remove Student\n3. Update Student\n4. Display All Studnets\n5. Exit");
			System.out.println("Enter your choice");

			int choice = scanner.nextInt();
			switch (choice) {

			case 1:
				Student student = new Student();
				System.out.println("Enter student id : ");
				int id = scanner.nextInt();
				System.out.println("Enter student name : ");
				String name = scanner.next();
				System.out.println("Enter father name : ");
				String fatherName = scanner.next();
				System.out.println("Enter phone number : ");
				long phoneNo = scanner.nextLong();
				System.out.println("Enter city : ");
				String city = scanner.next();
				System.out.println("Enter State : ");
				String state= scanner.next();
				System.out.println("Enter Country : ");
				String country = scanner.next();
				System.out.println("Enter PinCode : ");
				int pinCode = scanner.nextInt();
				Address address = new Address(city, state, country, pinCode);
				student = new Student(id, name, fatherName, phoneNo, address);
				System.out.println(service.addStudent(student, studentList));
				break;

			case 2:
				System.out.println("Enter id of the student to be removed : ");
				int studentId = scanner.nextInt();
				System.out.println(service.deleteStudent(studentId, studentList));
				break;

			case 3:
				System.out.println("Enter id of the student to be updated");
				int id1 = scanner.nextInt();
				System.out.println("Enter student name : ");
				String name1 = scanner.next();
				System.out.println("Enter father name : ");
				String fatherName1 = scanner.next();
				System.out.println("Enter phone number : ");
				long phoneNo1 = scanner.nextLong();
				System.out.println("Enter city : ");
				String city1 = scanner.next();
				System.out.println("Enter State : ");
				String state1= scanner.next();
				System.out.println("Enter Country : ");
				String country1 = scanner.next();
				System.out.println("Enter PinCode : ");
				int pinCode1 = scanner.nextInt();
				Address address1 = new Address(city1, state1, country1, pinCode1);
				student = new Student(id1, name1, fatherName1, phoneNo1, address1);
				System.out.println(service.updateStudent(id1, student, studentList));
				break;
			case 4:
				System.out.println("All Students : ");
				service.viewAllStudents(studentList);
				break;

			case 5:
				isExit = false;
				break;
			default:
				System.out.println("Enter a valid choice ");
				break;
			}
		}

	}

}
