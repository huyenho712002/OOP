package Assigment1;

import java.util.Scanner;

public class exercise7 {
	 public static void main (String[] args) {
	        
	        String str= "String ssss ", nstr="";
	        char ch;
	        
	      System.out.print("Original word: ");
	      System.out.println("String  ssss"); 
	        
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); 
	        nstr= ch+nstr; 
	      }
	      
	      
	      System.out.println("Reversed word: "+ nstr);
	      System.out.println("Capital letter: "+ str.toUpperCase());
	      System.out.println(" Lower world : "+ str.toLowerCase());
	      
	      int[] freq = new int[str.length()];
	      char string[] = str.toCharArray();
	      for( int i= 0; i<str.length(); i++) {
	    	  freq[i] =1;
	    	  for(int j = 0; j<str.length(); j++) {
	    		  if(string[i] ==string[j]) {
	    			  freq[i]++;
	    			  string[j]='0';
	    		  }
	    	  }
	      }
	      System.out.println("Characters and their corresponding frequencies");
	      for( int i = 0; i<freq.length; i++) {
	    	  if(string[i]!=' '&&string[i]!='0')
	    		  System.out.println(string[i]+"-"+freq[i]);
	      }
	      Scanner sc = new Scanner(System.in);
	      System.out.println("input n: ");
	      int n;
	      do {  
	       n = sc.nextInt();}
	      while(n<0&& n> str.length());
	      System.out.println(" input m: ");
	      int m;
	      do {
	    	m = sc.nextInt();
	      }while(m<0 && m>str.length());
	      System.out.println(str.substring(n, m));
	      
	 }
}