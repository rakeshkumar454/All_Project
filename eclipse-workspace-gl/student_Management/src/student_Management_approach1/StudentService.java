package student_Management_approach1;

import java.util.List;

public class StudentService {
	
	public String addStudent(Student student, List<Student> students) {
		if(students.contains(student)) {
			return "student already exist";
		}
			students.add(student);
		return "student added successfully";
	}
	public String deleteStudent(int id, List<Student> students) {
		Student student = null;
		boolean isFound = false;
		for (Student student3 : students) {
			if (student3.getId() == id) {
				student = student3;
				isFound = true;
			}
		}
		if (!isFound) {
			return "Student not found";
		}
		students.remove(student);
		return "Student removed successfully";
	}
	public String updateStudent(int id, Student student, List<Student> students) {

		Student student2 = null;
		boolean isFound = false;

		for (Student student3 : students) {
			if (student3.getId() == id) {
				student2 = student3;
				isFound = true;
			}
		}
		if (!isFound) {
			return "Student not found";
		}
		student2.setName(student.getName());
		student2.setFatherName(student.getFatherName());
		student2.setPhoneNumber(student.getPhoneNumber());
		student2.setAddress(student.getAddress());
			return "Student updated successfully";
	}
	public void viewAllStudents(List<Student> students) {
		if (students.isEmpty()) {
			System.out.println("No Students found");
		} else {
			students.forEach(System.out::println);
		}
	}

}
