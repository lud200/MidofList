package middleofList;

import java.util.Scanner;
import java.util.Stack;

public class mid {
	public static void main(String args[]){
		int option;
		List l=new List();
		while(true){
			System.out.println("Enter your choice");
			System.out.println("1. Insert Begin"+"\n"+"2. MidofList");
			System.out.println("Enter 0 to exit");
			Scanner sc=new Scanner(System.in);
			option=sc.nextInt();
			switch(option){
			case 1: l.insertBegin();
			l.print();
			break;
			case 2: l.findMid();
			break;
			case 0:System.exit(0);
			}
		}
		}
}
class List{
	private class Node{
		int data;
		Node next;
	}
	Node head=null;
	public void print(){
		Node n=new Node();
		n=head;
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
		}
	}
	public void findMid(){
		Node n=head;
		Node next=head;
		while(next!=null && next.next!=null){
			n=n.next;
			next=next.next.next;
		}
		System.out.println("Mid of the list is:"+n.data);
	}
	public void insertBegin(){
		Node node=new Node();
		if(head==null){
			head=node;
			Scanner sc=new Scanner(System.in);
			head.data=sc.nextInt();
			head.next=null;
		}
		else{
			node.next=head;
			Scanner sc=new Scanner(System.in);
			node.data=sc.nextInt();
			head=node;
		}
	}
}
