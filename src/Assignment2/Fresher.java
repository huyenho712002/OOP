package Assignment2;

import java.util.List;
import java.util.Scanner;

public class Fresher extends Candidate{
	private String Graduation_date;
	private String Graduation_rank;
	private String Education;


	public Fresher(String candidateID, String fullName, String birthDay, String phone, String email,
			String candidate_type, List<Assignment2.Certificate> Certificate, String graduation_date,
			String graduation_rank, String education) {
		super(candidateID, fullName, birthDay, phone, email, candidate_type, Certificate);
		Graduation_date = graduation_date;
		Graduation_rank = graduation_rank;
		Education = education;
	}

	

	public Fresher() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getGraduation_date() {
		return Graduation_date;
	}

	public void setGraduation_date(String Graduation_date) {
		this.Graduation_date = Graduation_date;
	}

	public String getGraduation_rank() {
		return Graduation_rank;
	}

	public void setGraduation_rank(String Graduation_rank) {
		this.Graduation_rank = Graduation_rank;
	}

	public String getEducation() {
		return Education;
	}

	public void setEducation(String Education) {
		this.Education = Education;
	}



	@Override
public void inputInfo() {
		super.inputInfo();
//		Gọi trực tiếp phương thức (method) của lớp cha gần nhất.
		Scanner sc = new Scanner(System.in);
	System.out.println("Input Graduation_date: ");
	Graduation_date = sc.nextLine();
	System.out.println("Input Graduation_rank");
	Graduation_rank = sc.nextLine();
	System.out.println("Input Education ");
	Education = sc.nextLine();

}
	@Override
  public void showMe() {
     super.showInfo();
//     Gọi trực tiếp phương thức (method) của lớp cha gần nhất.
	  System.out.println("Graduation_date: "+ this.Graduation_date);
	  System.out.println("Graduation_rank: "+ this.Graduation_rank);
	  System.out.println("Education: "+this.Education);
	}


}
