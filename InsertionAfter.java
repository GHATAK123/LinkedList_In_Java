public class InsertionAfter {
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
  // Insertion "data" after the node "prev_node".
  // Time Complexity: O(1).
  public void insertAfter(Node prev_node,int data)
  {
    if(prev_node==null)
    {
      System.out.println("LinkedList is Empty!!!");
      return;
    }
    Node new_node=new Node(data);
    new_node.next=prev_node.next;
    prev_node.next=new_node;

  }
  

  public static void main(String[] args) {
    InsertionAfter I=new InsertionAfter();
    I.head=new Node(5);
    Node second=new Node(10);
    Node third=new Node(15);
    Node fourth=new Node(20);
    I.head.next=second;
    second.next=third;
    third.next=fourth;
    I.print();
    I.insertAfter(third,18);
    System.out.println();
    I.print();


  }
  
}