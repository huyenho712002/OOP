package Assignment2;

import java.util.Scanner;

public class Experience extends Candidate{
private static final String CertificatedID = null;
private static final String CertificateName = null;
private static final String CertificateRank = null;
private static final String CertificatedDate = null;
private String ExpInYear;
private String ProSkill;

public Experience(String candidateID, String fullName, String birthDay, String phone, String email,
		String candidate_type, String candidate_count,String expInYear, String proSkill) {
	super();
	// TODO Auto-generated constructor stub
//	 this : Tham chiếu tới biến của lớp hiện tại.
	this.ExpInYear=expInYear;
	this.ProSkill = proSkill;
}
public Experience() {
	// TODO Auto-generated constructor stub
}
public String getExpInYear() {
	return ExpInYear;
}
public void setExpInYear(String ExpInYear) {
	this.ExpInYear = ExpInYear;
}
public String getProSkill() {
	return ProSkill;
}
public void setProSkill(String ProSkill) {
	this.ProSkill = ProSkill;
}
public void inputInfo() {
	super.inputInfo();
//Gọi trực tiếp phương thức (method) của lớp cha gần nhất.
	Scanner  sc = new Scanner(System.in);
	System.out.println(" Input Experience in year");
	ExpInYear = sc.nextLine();
	System.out.println("Input ProSkill");
	ProSkill = sc.nextLine();
}

@Override
public void showMe(){
	super.showInfo();
	System.out.println("Experience in year "+ this.ExpInYear);
	System.out.println("ProSkill: "+ this.ProSkill);
	
}
}
