package data_structures.LinkedList;

import java.io.DataInputStream;

public class Rverse_DLL 
{
private static DataInputStream dis = new DataInputStream(System.in);
	
	private static Node head  = null , ptr = null , get_new = null;
	private static char ch = 'y';
	
	public static void main(String[] args) throws Exception 
	{	
		head = new Node();
		
		DLL_Ins_End();
			
		display();
		reverse();
		display();
		
	}
	private static void reverse() 
	{
		Node ptr2,ptr3;
		
		if(head.right == null)
			System.out.println("Empty DLL");
		else
		{
			ptr = head.right.right;
			ptr2 = head.right;
			ptr2.right = null;
			
			while( ptr != null)
			{
				ptr3 = ptr.right;
				ptr.right = ptr2;
				ptr2.left = ptr;
				ptr2 = ptr;
				ptr=ptr3;
			}
			head.right = ptr2;
			ptr2.left = head;
		}
		
	}
	private static void DLL_Ins_End() throws Exception 
	{
		System.out.println("Insertion at END");
		while(ch == 'y' || ch == 'Y')
		{
			System.out.println("Enter roll num");
			int rollno = Integer.parseInt(dis.readLine() );
			get_new = new Node(rollno);
			
			ptr = head;
			while(ptr.right != null)
				ptr = ptr.right;
			
			ptr.right = get_new;
			get_new.left = ptr;
			get_new.right = null;
			
			System.out.println("Continue?");
			   ch = dis.readLine().charAt(0);
		}
	}

	
	private static void display() 
	{
		System.out.println("DISPLAY");
		ptr = head.right;
		System.out.print("Nodes are = > ");
		while(ptr != null)
		{
			System.out.print(ptr.data+" ");
			ptr = ptr.right;
		}		
		System.out.println("");
	}
}
