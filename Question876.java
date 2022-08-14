/*  876. Middle of the Linked List.
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

Example 1:

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example 2:

Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 
Constraints:

The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100    */ 

import java.util.*;

public class Question876
{
    static Node head;

    class Node  //constructor
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    } 
    // in the middle delete any node 
    public static Node middleNode(Node head) //this function or method is the main logic for leetcode
    {    
        if( head==null )
            return head;
        
        int n=0;
        Node currNode=head;
        
        while( currNode!=null )
        {
            n++;
            currNode=currNode.next;
        }
        
        currNode=head;
        for( int i=0 ; i<n/2 ; i++ )
        {
            currNode=currNode.next;
        }
        head=currNode;
        return head;
        
    }

    // add last
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }

        Node currNode=head;
        while( currNode.next != null )
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    // print
    public  void printList()
    {
        if(head==null)
        {
            System.out.println("The linked list is empty.");
        }
        Node currNode=head;
        while( currNode != null )
        {
            System.out.print(currNode.data+" => ");
            currNode=currNode.next;
        }
        System.out.println("null"); 
    }

    // delete first
    public void removeFirst()
    {
        if(head==null)
        {
            System.out.println("The linked list is empty.");
        }

        head=head.next;
    }

    // delete last
    public void removeLast()
    {
        if(head==null)
        {
            System.out.println("The linked list is empty.");
        }
        if(head.next==null)
        {
            head=null;
            return;
        }

        Node currNode=head;
        Node nextNode=head.next;
        while( nextNode.next != null )
        {
            nextNode=nextNode.next;
            currNode=currNode.next;
        }
        currNode.next=null; 
    }

    public static void main(String args[])
    {
        Question876 list = new Question876();

        int val;
        Scanner Sc = new Scanner(System.in);
        do
        {
            System.out.print("For Exit press 0.\nAdd last to the linked list press 1.\nReturn middle of the Linked list press 2.\nprint the linked list press 3.\nRemove first element from the linked list press 4.\nRemove last element from the linked list press 5.\n\npress here : ");
            
            val = Sc.nextInt();
            switch(val)
            {
                case 0 :
                    System.out.println("Program Terminated !!");
                    break;
                case 1 :
                    System.out.print("Enter the value : ");
                    int data = Sc.nextInt();
                    list.addLast(data);
                    System.out.println("The value is sucessfully added to the linked list.\n");
                    break;
                case 2 :
                    head=middleNode(head);
                    break;
                case 3 :
                    list.printList();
                    break;
                case 4 :
                    list.removeFirst();
                    System.out.println("The String is sucessfully removed from the linked list.\n");
                    break;
                case 5 :
                    list.removeLast();
                    System.out.println("The String is sucessfully removed from the linked list.\n");
                    break;
                default : 
                    System.out.println("Invalid number.");
                    break;
            }
        }while(val!=0);
    }
}


    