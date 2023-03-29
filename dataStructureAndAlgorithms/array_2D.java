package javaproject.dataStructureAndAlgorithms;

import java.util.Scanner;

public class array_2D {
	public static void main(String args[]) {
		int n,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of ROWS:");
		n = sc.nextInt();
		System.out.println("enter no. of COLUMNS:");
		m = sc.nextInt();
		int a[][] = new int[n][m];
//		int a[][] = {{1,3},{4,6},{3,7}};
		
		System.out.println("enter value:");
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				a[i][j] = sc.nextInt();			}
		}

		System.out.println("elements are:");
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(a[i][j]+"  ");	
			}
			System.out.println();
		}
	}

}
