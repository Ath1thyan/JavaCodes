package arrays;

import java.util.Scanner;

public class Arr2d {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("no. of rows & columns of matrix 1 & 2: ");
        int r1=s.nextInt(), c1=s.nextInt();
        // System.out.println("no. of rows & columns of matrix 2: ");
        // int r2=s.nextInt(), c2=s.nextInt();
        int a[][] = new int[r1][c1];
        System.out.println("enter the elements for matrix 1: ");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                a[i][j]=s.nextInt();
            }
        }

        int b[][] = new int[r1][c1];
        System.out.println("enter the elements for matrix 2: ");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                b[i][j]=s.nextInt();
            }
        }

        System.out.println("the matrix 1 is: ");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("the matrix 2 is: ");
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b[0].length; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        int c[][] = new int[r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                c[i][j]=a[i][j] + b[i][j];
                //System.out.print((c[i][j]=a[i][j] + b[i][j])+" ");
            }
            //System.out.println();
        }

        System.out.println("Sum of Matrix 1&2");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
        
        int d[][] = new int[r1][c1];
        System.out.println("Difference of Matrix 1&2");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                // c[i][j]=a[i][j] + b[i][j];
                System.out.print((d[i][j]=a[i][j] - b[i][j])+" ");
            }
            System.out.println();
        }

        s.close();
    }
}
