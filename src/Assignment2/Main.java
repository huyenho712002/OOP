package Assignment2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {


//private static final String FullName = null;
//private static final int Candidate = 0;


public static void main(String[] args) {

	
	Scanner sc = new Scanner(System.in);
	@SuppressWarnings("unused")
	Candidate candidate = new Candidate();
	Experience experience = new Experience();
	Intern intern = new Intern();
	Candidate fresher = new Fresher();//downcasting
	Certificate certificate = new Certificate();

//	ArrayList<Candidate> list = new ArrayList<>();

	int n = 0;
//	int k =0;
//	while(true) {
//		try {
//        System.out.println("Input the number of Candidate(Integer) ");
//		k = Integer.parseInt(sc.nextLine());
//		break;
//		}
//		catch(Exception e) {
//		}
//	}
//	
//	
//	int A[] = new int[k];
//	for(  int i = 0; i<k; i ++) {
	System.out.println(" Input Type of Candidate ");
	n = sc.nextInt();
	while(true) {
		
		try {
			switch(n) {
			case 0: 
				System.out.println("Experience"+ n);
				experience.inputInfo();certificate.inputCertificate(); 
				certificate.showMe();	experience.showMe();
				Candidate.candidateList.add((Candidate)experience);
				Candidate.certificatelist.add(certificate);
				System.out.println(Candidate.certificatelist.size());
			break;
			case 1: System.out.println("Fresher : "+ n);fresher.inputInfo();
			fresher.showMe();
			certificate.inputCertificate();
			certificate.showMe();
			certificate.showMe();
			Candidate.candidateList.add((Candidate)fresher);
			Candidate.certificatelist.add(certificate);
			break;
			case 2: System.out.println("Intern"+ n); 
			intern.inputInfo();
			intern.showMe();
			certificate.inputCertificate();
			certificate.showMe();
			Candidate.candidateList.add((Candidate)intern);
			Candidate.certificatelist.add(certificate);
			break;
			
			};
			break;
			}catch(Exception ex) {
				
			
			System.out.println("Input Integer again: ");
		
		}
	}
//}

	
	for(Candidate candidate1: Candidate.candidateList){
		System.out.println("Candidate List");
		candidate1.showMe();	
		System.out.println( "List FullName");
		 String str =Candidate.candidateList.get(0).getFullName();
			StringBuffer stringbuffer = new StringBuffer(str);
			stringbuffer.append(",");
			System.out.println(stringbuffer);
	}
	for( Certificate cer : Candidate.certificatelist) {
		System.out.println("Certificate List");
		System.out.println();
		cer.showMe();
	}
	
//	System.out.println( "List FullName");
// String str =Candidate.candidateList.get(0).getFullName();
//	StringBuffer stringbuffer = new StringBuffer(str);
//	stringbuffer.append(",");
//	System.out.println(stringbuffer);

	
}

}


