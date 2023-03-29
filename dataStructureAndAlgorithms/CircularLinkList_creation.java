package javaproject.dataStructureAndAlgorithms;

import java.util.Scanner;

public class CircularLinkList_creation {
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;
	Node tail = null;
	
	public void creation() {
		
		int data,n;
		Scanner sc = new Scanner(System.in);
		do {
				System.out.println("Enter data");
				data = sc.nextInt();
				Node new_node = new Node(data);
				if(head==null) {
					head = new_node;
					tail = new_node;
					new_node.next = head;
				}else {
					new_node.next = head;
					head = new_node;
					tail.next = head;
				}
				System.out.println("do you want to add more data. if yes, press:1");
				n=sc.nextInt();		
			}
		while(n==1);
	}
	
	public void traverser() {
		Node temp = head;
		if(head==null) {
			System.out.println("LL does not exist");
		}else {
			do{
				System.out.println(temp.data+"  ");
				temp = temp.next;
			}
			while(temp!=head);
		}
	}
	
	public static void main(String args[]) {
		CircularLinkList_creation ll = new CircularLinkList_creation();
		ll.creation();
		ll.traverser();
	}
}
