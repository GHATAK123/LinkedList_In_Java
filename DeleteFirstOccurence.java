public class DeleteFirstOccurence {
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

  public void delete(int key)
  {
    Node temp=head,prev=null;
    if(temp!=null && temp.data==key)
    {
      head=temp.next;
      return;
    }
    while(temp!=null && temp.data!=key)
    {
      prev=temp;
      temp=temp.next;
    }

    if(temp==null)
      return;
    prev.next=temp.next;  
  }
  public static void main(String[] args) {
    DeleteFirstOccurence d=new DeleteFirstOccurence();
    d.head=new Node(5);
    Node second=new Node(10);
    Node third=new Node(15);
    Node fourth=new Node(20);

    d.head.next=second;
    second.next=third;
    third.next=fourth;
    d.print();
    d.delete(15);
    System.out.println();
    d.print();


  }
  
} 