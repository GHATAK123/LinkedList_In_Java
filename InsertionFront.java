class InsertionFront{
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
    // Insertion at the beginning of the LinkedList.
    // Time Complexity will be O(1).
    public void push(int front)
    {
      Node new_node=new Node(front);
      new_node.next=head;
      head=new_node;
    }
  public static void main(String[] args) {
    InsertionFront I=new InsertionFront();
    I.head=new Node(10);
    Node second=new Node(20);
    Node third=new Node(30);
    Node fourth=new Node(40);
    
    I.head.next=second;
    second.next=third;
    third.next=fourth;

    I.print();
    I.push(0);
    System.out.println();
    I.print();


  }
}
