import java.util.*;
class LinkedList{
	static Node head=null;
	static Node tail=null;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data =d;
			next=null;
		}
	}
	
	Node reverse()
	{
		Node prev =null;
		Node current =head;
		Node next = null;
		
		while(current!=null)
		{
			next= current.next;
			current.next =prev;
			prev =current;
			current = next;
		}
		head =prev;
		return head;
	}
		
		void display(Node head)
		{	
		Node temp = head;
			while(temp !=null)
			{
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
		
		
		void AddLast(int data)
		{
			Node newNode = new Node(data);
			if(head==null)
			{
				head = newNode;
				tail = newNode;
			}
			tail.next = newNode;
			tail = newNode;
		}
		
	
	
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter the no. test cases");
	int t = sc.nextInt();
    for(int j=1;j<=t;j++){
		LinkedList s = new LinkedList();
	System.out.println("\nEnter the no. nodes in list");
	int n =sc.nextInt();
	System.out.println("Enter the data in list");
		for(int i=0;i<n;i++)
		{
			s.AddLast(sc.nextInt());	
		}
		//s.display(head);
		s.reverse();
		s.display(head);
	}	
}
}