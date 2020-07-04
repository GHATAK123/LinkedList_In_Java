import java.util.*;
class Linkedlist2{
  public static void main(String[] args) {
    LinkedList l=new LinkedList();
    l.add(5);
    l.add(4);
    l.add(6);
    l.add(7);
    l.add(55);
    System.out.println(l);
    ListIterator itr =l.listIterator();
    while(itr.hasNext())
    {
      Integer I=(Integer)itr.next();
      System.out.print(I+" ");
    }
    
  }
}