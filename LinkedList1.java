import java.util.*;
public class LinkedList1 {
  Node head;

  static class Node
  {
    int data;
    Node next;
    Node(int d)
    {
      data=d;
      next=null;
    }
  }
  public void print()
  {
    Node n=head;
    while(n!=null)
    {
      System.out.print(n.data+" ");
      n=n.next;
    }
  }
  public static void main(String[] args) {
    LinkedList1 l=new LinkedList1();
    l.head=new Node(1);
    Node second=new Node(2);
    Node third=new Node(3);
    l.head.next=second;
    second.next=third;
    l.print();

    


  }

  
}