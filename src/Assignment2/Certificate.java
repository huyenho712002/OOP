package Assignment2;

import java.util.List;
import java.util.Scanner;

public class Certificate {
private String CertificatedID;
private String CertificateName;
private String CertificateRank;
private String CertificatedDate;
private String candidateID;



	public Certificate(String certificatedID, String certificateName, String certificateRank, String certificatedDate,
		String candidateID) {
	super();
	this.CertificatedID = certificatedID;
	this.CertificateName = certificateName;
	this.CertificateRank = certificateRank;
	this.CertificatedDate = certificatedDate;
	this.candidateID = candidateID;
}


	public String getCandidateID() {
		return candidateID;
	}


	public void setCandidateID(String candidateID) {
		this.candidateID = candidateID;
	}


	public Certificate() {
		// TODO Auto-generated constructor stub
	}

	public String getCertificatedID() {
		return CertificatedID;
	}
	public void setCertificatedID(String certificatedID) {
		this.CertificatedID = certificatedID;
	}
	public String getCertificateName() {
		return CertificateName;
	}
	public void setCertificateName(String certificateName) {
		this.CertificateName = certificateName;
	}
	public String getCertificateRank() {
		return CertificateRank;
	}
	public void setCertificateRank(String certificateRank) {
		this.CertificateRank = certificateRank;
	}
	public String getCertificatedDate() {
		return CertificatedDate;
	}
	public void setCertificatedDate(String certificatedDate) {
		this.CertificatedDate = certificatedDate;
	}
//	@Override
public void inputCertificate() {
//		super.inputCertificate();
	Scanner sc = new Scanner(System.in);
	System.out.printf("the Number of Certificate :  ");
	int a = sc.nextInt();
	sc.nextLine();

	for(int i=0;i<a;i++) {
	
		System.out.println("Number " +(i+1) );
	System.out.println("Input Certificate ID ");
	CertificatedID = sc.nextLine();
	System.out.println("Input Certificate Name ");
	CertificateName = sc.nextLine();
	System.out.println("Input Certificate Rank");
	CertificateRank = sc.nextLine();
	System.out.println("Input Certificate Date");
	CertificatedDate = sc.nextLine();
	}

}

public void showMe() {
	System.out.println("Certificate ID: "+this.CertificatedID+"\n"+"Certificate Name: "+ this.CertificateName+"\n"+"Certificate Rank: "+ this.CertificateRank+
			"\n"+"Certificate Date: "+this.CertificatedDate);

}



}
