package javaproject.dataStructureAndAlgorithms;

import java.util.Scanner;

class stack {
	int top = -1;
	int n = 10;
	int a[] = new int[n];
	Scanner sc = new Scanner(System.in);

	void push() {
		if (top == (n - 1)) {
			System.out.println("Overflow");
		} else {
			System.out.println("enter data");
			int i = sc.nextInt();
			top = top + 1;
			a[top] = i;
			System.out.println("item inserted");
		}
	}

	void pop() {
		if (top == -1) {
			System.out.println("underflow");
		} else {
			top = top - 1;
			System.out.println("item deleted");
		}
	}

	void display() {
		System.out.println("items are:");
		for (int j = top; j >= 0; j--) {
			System.out.println(a[j]);
		}
	}
}

public class stack_array {
	public static void main(String args[]) {
		stack s = new stack();
	}
}
