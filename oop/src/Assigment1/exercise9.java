package Assigment1;

import java.util.Scanner;

public class exercise9 {
public static void readMatrixByUser()
{
    int m, n, i, j;
    Scanner in = null;
    try {
        in = new Scanner(System.in);
        System.out.println("Enter the number "
                           + "of rows of the matrix");
        m = in.nextInt();
        System.out.println("Enter the number "
                           + "of columns of the matrix");
        n = in.nextInt();

        // Declare the matrix
        int first[][] = new int[m][n];

        // Read the matrix values
        System.out.println("Enter the elements of the matrix");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                first[i][j] = in.nextInt();

        // Display the elements of the matrix
        System.out.println("Elements of the matrix are");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                System.out.print(first[i][j] + "  ");
            System.out.println();
            
        }
        System.out.println("first row");
        for (j = 0; j < n; j++) {

        	if(first[0][j] %3==0) {
        		int product = first[0][j]*first[0][j+1]*first[0][j+2];
        		System.out.println("the product of number :"+ product);
        	}else {
            	System.out.print(first[0][j] + "  "+"\n");
        	}
        	
        }
        int X[] = new int[m];
        for(int i1 = 0; i1<m; i1++) {
        	int max = 0;
        	for(int j1 = 0; j1<n;j1++) {
        		if(max<first[i1][j1]) {
        			max = first[i1][j1];
		           }
        	}
        	X[i1]=max;
        }
        System.out.println("Matrix max of each row\n");
        for(int i1 = 0; i1 < m;i1++) {
        System.out.print(" "+ X[i1]);
        }
    }
    catch (Exception e) {
    }
    finally {
        in.close();
    }
    
    
    

}
public static void main(String[] args)
{
    readMatrixByUser();
}

}
