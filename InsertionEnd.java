public class InsertionEnd {
  Node head;
  static class Node{
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

  public void insertEnd(int data)
  {
    Node new_node=new Node(data);
    
    if(head.next==null) // If the LinkedList is Empty.
    {
      head=new_node;
      return;
    }
    // If LL is not empty,then traverse through the  LL to find last node of LL. 
    new_node.next=null;
    Node last =head;
    while(last.next!=null)
      last=last.next;

      last.next=new_node;
      return;


  }
  public static void main(String[] args) {
    InsertionEnd I=new InsertionEnd();
    I.head=new Node(5);
    Node second=new Node(10);
    Node third=new Node(15);
    Node fourth=new Node(20);
    I.head.next=second;
    second.next=third;
    third.next=fourth;
    I.print();
    I.insertEnd(25);
    System.out.println();
    I.print();
    
  }
  
}