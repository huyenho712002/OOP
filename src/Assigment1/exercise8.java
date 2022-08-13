package Assigment1;

import java.awt.Insets;


import java.util.Scanner;
 

public class exercise8 {
	

	public static void main(String args[])
	    {
	       int arr[] = {1,2,6,4,5,3};
	        int odd = 0;
	        for(int i = 0; i<6;i++) {
	        	System.out.println("array["+i+"] = "+ arr[i]);
	        }

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] % 2 != 0)
	                odd += arr[i];
	        }
	 
	        System.out.println("Odd index positions sum: " + odd);
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter element k: ");
	        int k = sc.nextInt();
	        for(int i = 0; i<6; i++) {
	        	if(arr[i]==k) {
	        		System.out.println(" vi tri can tim : " + "arr["+i+"]");
	        	}
	        }
	        	System.out.println(" No element in Array");
	        
	       
	        
	       java.util.Arrays.sort(arr);
	       System.out.println("Arrange array A in ascending order:");
	       for (int number : arr) {
	           System.out.println("Arr = " + number);
	    }
	       
	  System.out.println("Insert Element ");
	 int newArr[] = {1,2,6,4,5,3,9};
	 for(int i = 0; i<6;i++) {
     	System.out.println("New array["+i+"] = "+ newArr[i]);
     }
	 
	 java.util.Arrays.sort(newArr);
     System.out.println("Arrange array A in ascending order:");
     for (int number : newArr) {
         System.out.println("New Arr = " + number);
  }
	    }
}

 