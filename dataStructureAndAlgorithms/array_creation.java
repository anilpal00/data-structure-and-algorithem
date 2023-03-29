package javaproject.dataStructureAndAlgorithms;

import java.util.Scanner;

public class array_creation {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of element in array:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter value:");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("elements are:");
		for(int i=0; i<n; i++) {
			System.out.println(a[i]);
		}
	}

}
