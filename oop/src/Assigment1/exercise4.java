package Assigment1;

import java.util.Scanner;

public class exercise4 {
public static void main(String[] args) {
	int m, n, sum = 0, product=1;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number:");
    m = s.nextInt();
    while(m > 0)
    {
        n = m % 10;
        sum = sum + n;
        product= product * n;
        m = m / 10;
      
    }
    	  
          
          
    
    System.out.println("Sum of Digits:"+sum);
    System.out.println("Product of Digits " + product);
}

}
