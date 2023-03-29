package javaproject.dataStructureAndAlgorithms;

import java.util.Scanner;

public class array_delete_value {
	public static void main(String args[]) {
		int n,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of element in array:");
		n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n+1];
		System.out.println("enter value:");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter index of value to be deleted:");
		m = sc.nextInt();
		for(int i=0; i<a.length; i++) {
			if(i<m) {
				b[i] = a[i];
			}else if(i==m) {
				continue;
			}else {
				b[i-1] = a[i];
			}
		}
		System.out.println("elements are:");
		for(int i=0; i<n-1; i++) {
			System.out.println(b[i]);
		}
	}

}
