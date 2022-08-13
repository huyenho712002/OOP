package Assignment2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Candidate {

public static int count = 0;
private String CandidateID;
private String FullName;
private String BirthDay;
private String Phone;
private String Email;
private String Candidate_type;
static List<Certificate> certificatelist= new ArrayList<Certificate>();
static List<Candidate> candidateList= new ArrayList<Candidate>();


public Candidate(String candidateID, String fullName, String birthDay, String phone, String email,
		String candidate_type, List<Assignment2.Certificate> Certificate) {
//key this: Tham chiếu tới biến của lớp hiện tại
	this.CandidateID = candidateID;
	this.FullName = fullName;
	this.BirthDay = birthDay;
	this.Phone = phone;
	this.Email = email;
	this.Candidate_type = candidate_type;
	this.certificatelist = Certificate;
	}

public Candidate() {
	// TODO Auto-generated constructor stub

}
public Candidate(String CandidateID) {
	this.CandidateID= CandidateID;
}


public String getCandidateID() {
	return CandidateID;
}
public void setCandidateID(String candidateID) {
	count++;	
	System.out.println(count);
	this.CandidateID = candidateID;

}
public String getFullName() {
	return FullName;
}
public void setFullName(String fullName) {
	this.FullName = fullName;
}
public String getBirthDay() {
	return BirthDay;
}
public void setBirthDay() throws checkValidation{
	while(true) {
	if(checkValidation.isValidDate(BirthDay)== true) {
		System.out.println(" Birthday is true ");
		this.BirthDay=BirthDay;
		throw new checkValidation();
	}else {
		System.out.println("The system has encountered an unexpected problem, sincerely sorry !!!");
	}
	System.out.println("Input Birthday again");
	setBirthDay();
	}
}
public String getPhone() {
	return Phone;
}
public void setPhone() throws checkValidation{
	while(true) {
		if(checkValidation.isValidatePhoneNumber(Phone)== true) {
			System.out.println("Number Phone is true");
			this.Phone=Phone;
			throw new checkValidation();
		}else {
			System.out.println("The system has encountered an unexpected problem, sincerely sorry !!!");
		}
		System.out.println("Input Number Phone again");
		setPhone();
		}
}
public String getEmail() {
	return Email;
}
public void setEmail() throws checkValidation{
while(true) {
	if(checkValidation.isValidcheckEmail(Email) == true) {
		System.out.println("Email is true");
		this.Email=Email;
		throw new checkValidation();
		
	}else {
		System.out.println("The system has encountered an unexpected problem, sincerely sorry !!! ");
	}
	System.out.println(" input Email again");
    setEmail();

}	
	
}
public String getCandidate_type() {
	
	return this.Candidate_type;
}
public void setCandidate_type(String candidate_type) {
	
	
	this.Candidate_type = candidate_type;
}
public List<Certificate> getCertificate() {
    return getCertificate();
}

public void setCertificate(List<Certificate> Certificate) {
    this.certificatelist = Certificate;
}


public void inputInfo(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Input Candidate ID: ");
	 CandidateID = sc.nextLine();
	System.out.println("Input FullName: ");
	FullName = sc.nextLine();
	System.out.println("Input BirthDay: ");
	BirthDay = sc.nextLine();
	while(checkValidation.isValidDate(BirthDay) != true){
		System.out.println("Input BirthDay again: ");
		BirthDay = sc.nextLine();
	}

	System.out.println("Input Phone Number: ");
	Phone = sc.nextLine();
	while(checkValidation.isValidatePhoneNumber(Phone) != true) {
		System.out.println("Input Phone Number again: ");
		Phone = sc.nextLine();
	}
	System.out.printf("Phone done ! ");
	System.out.printf("Input Email ");
	Email = sc.nextLine();
	
	while(checkValidation.isValidcheckEmail(Email)!= true){
		System.out.println("Input Email again: ");
		Email = sc.nextLine();
	}
	
}
//void inputCertificate() {
//	Scanner sc = new Scanner(System.in);
//	System.out.printf("the Number of Certificate :  ");
//	int a = sc.nextInt();
//	
//	for(int i=0;i<a;i++) {
//		System.out.println("Number " +(i+1));
//		
//	}
//
//	
//}
 void showInfo() {
	 System.out.println("ID: " + this.CandidateID + " "+"FullName: "+this.FullName+"\n"+ "Birthday: "+ 
		        this.BirthDay+ "\n"+"Phone Number: "+ this.Phone+" "+"Email: "+ this.Email+"\n" + "CertificateID: ");
	
		}

  void showMe() {
	  
  }



}
