package Assigment1;

import java.util.Scanner;

public class exercise6 {
	 public void convertBinary(int num){
		 
	        int binary[] = new int[40];
	        int index = 0;
	        while(num > 0){
	            binary[index++] = num%2;
	            num = num/2;
	        }
	        for(int i = index-1;i >= 0;i--){
	            System.out.print(binary[i]);
	        }
	    }
	    public static void main(String a[]){
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("input n");
			 int n = sc.nextInt();
	        exercise6 obj = new exercise6();
	        System.out.println("Binary representation of : "+n);
	        obj.convertBinary(n);
}
}