package Assignment2;

import java.util.List;
import java.util.Scanner;

public class Intern extends Candidate{
private String Majors;
private String Semester;
private String University;

	public Intern() {
		// TODO Auto-generated constructor stub
	}
	public Intern(String candidateID, String fullName, String birthDay, String phone, String email,
			String candidate_type, List<Assignment2.Certificate> Certificate, String majors, String semester,
			String university) {
		super(candidateID, fullName, birthDay, phone, email, candidate_type, Certificate);
		Majors = majors;
		Semester = semester;
		University = university;
	}
	public String getMajors() {
		return Majors;
	}
	public void setMajors(String majors) {
		this.Majors = majors;
	}
	public String getSemester() {
		return Semester;
	}
	public void setSemester(String semester) {
		this.Semester = semester;
	}
	public String getUniversity() {
		return University;
	}
	public void setUniversity(String university) {
		this.University = university;
	}
	@Override
	public void inputInfo() {
		super.inputInfo();
//		Gọi trực tiếp phương thức (method) của lớp cha gần nhất.
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Major");
		Majors = sc.nextLine();
		System.out.println("Input Semester");
		Semester = sc.nextLine();
		System.out.println("Input University");
		University = sc.nextLine();
		
	}
	
@Override
public void showMe() {
	super.showInfo();
//	Gọi trực tiếp phương thức (method) của lớp cha gần nhất.
	System.out.println("Major: "+ this.Majors);
	System.out.println("Semester: "+ this.Semester);
	System.out.println("University Name: "+ this.University);
}
}
