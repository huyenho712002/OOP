package Assigment1;

import java.util.Scanner;

public class exercise5 {
	  private static Scanner scanner = new Scanner(System.in);
	
	    public static void main(String[] args) {
	        System.out.print("Nhap so Nguyen duong a = ");
	        int a = scanner.nextInt();
	        System.out.print("Nhap so Nguyen duong b = ");
	        int b = scanner.nextInt();
	        // tính USCLN của a và b
	        System.out.println("USCLN cua " + a + " và " + b
	                + " là: " + USCLN(a, b));
	        // tính BSCNN của a và b
	        System.out.println("BSCNN cua " + a + " và " + b
	                + " là: " + BSCNN(a, b));
	    }

	    public static int USCLN(int a, int b) {
	        if (b == 0) return a;
	        return USCLN(b, a % b);
	    }
	
	    public static int BSCNN(int a, int b) {
	        return (a * b) / USCLN(a, b);
	    }
	}
