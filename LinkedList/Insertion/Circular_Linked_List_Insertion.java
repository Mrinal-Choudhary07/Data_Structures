package data_structures.LinkedList;

import java.io.DataInputStream;

public class Circular_Linked_List_Insertion 
{
    private static DataInputStream dis = new DataInputStream(System.in);
	
	private static Node head  = null , ptr = null , get_new = null;	
	private static char ch = 'y';
	
	public static void main(String[] args) throws Exception 
	{	
		head = new Node();
		head.right = head; // CIRCULAR LINKED LIST
		
//		System.out.println("How many Nodes ?");
//		int nodes = Integer.parseInt(dis.readLine());
		
		
//			CLL_Ins_Beg();			
			CLL_Ins_End();
			CLL_Ins_Any();
			
			
		display();
		
	}
	
	private static void CLL_Ins_Any() throws Exception 
	{
		System.out.println("Insertion at ANY");
		System.out.println("Enter roll number ");
		int rollno = Integer.parseInt( dis.readLine());		
		get_new = new Node(rollno);
		
		System.out.println("Enter roll number after which you have to insert ");
		int rollfind = Integer.parseInt( dis.readLine());
		
		ptr = head.right;
		
		while(ptr.data != rollfind && ptr != head)
			ptr = ptr.right;
		
		if(ptr == head) System.out.println("Not found ! ");
		else
		{
			Node ptr2;
			
			ptr2 = ptr.right;
			get_new.right = ptr2;
			ptr.right = get_new;			
		}		
		
	}

	private static void CLL_Ins_End() throws Exception 
	{
		System.out.println("Insertion at END");
		
		while(ch == 'y' || ch == 'Y')
		{		
		    System.out.println("Enter roll number");
		    int rollno = Integer.parseInt( dis.readLine());
		
		    get_new = new Node(rollno);
		
		    ptr = head;
		
		    while(ptr.right != head)
		    ptr = ptr.right;
		    
		    get_new.right = head;		
		    ptr.right = get_new;
		
		   System.out.println("Continue?");
		   ch = dis.readLine().charAt(0);
	     }
	}
	
	private static void CLL_Ins_Beg() throws Exception 
	{	
		System.out.println("Insertion at BEG");
		while(ch == 'y' || ch == 'Y')
		{			
	 	   System.out.println("Enter roll number => ");
		   int rollno = Integer.parseInt(dis.readLine() );
		
		   get_new = new Node(rollno);
		
		   get_new.right = head.right;
		   head.right = get_new;
		
		   System.out.println("Continue?");
		   ch = dis.readLine().charAt(0);
	     }
	}
	
	private static void display() 
	{
		System.out.println("DISPLAY");
		
		ptr = head.right;
		System.out.print("Nodes are = > ");
		while(ptr != head)
		{
			System.out.print(ptr.data+" ");
			ptr = ptr.right;
		}		
	}

}
