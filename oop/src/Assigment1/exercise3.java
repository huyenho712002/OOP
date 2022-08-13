package Assigment1;

import java.util.Scanner;

public class exercise3 {
public static void main(String[] args) {
	
	 float sum = 0;
	 int n;
	 do {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Input n = ");
		n = sc.nextInt();
	 }while(n <=0);
	 
	 
	 for(int i = 1; i <=n;i++) {
		float sum1 = (2*i-1);
		for(int j = 1; j <i;j++) {
			sum1 =sum1*j;
		}
		 sum += 1.0/sum1;
	 }

	
	 System.out.println(sum);
		 
	 
	 
}
}
