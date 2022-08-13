package Assigment1;

import java.util.Scanner;

public class exercise2 {
	 public static void main(String[] args) {
       
         float sum = 0;
	        int n;
	        Scanner sc;
	        do {
	            System.out.println("Input n = ");
	            sc = new Scanner(System.in);
	            n = sc.nextInt();
	        }while(n <= 0);
	         
	        for(int i = 1; i <= n; i++) {
	            sum += 1.0/i;
	        }
	         
	        System.out.println("Sum = " + sum);
	        sc.close();
	    }
}
