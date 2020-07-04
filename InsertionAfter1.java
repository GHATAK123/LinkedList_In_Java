import java.util.*;
public class InsertionAfter1 {
  public static void main(String[] args) {
    LinkedList l=new LinkedList();
    l.add(5);
    l.add(10);
    l.add(15);
    l.add(20);
    l.add(25);
    System.out.println(l);
   
    l.add(3,18);
    System.out.println(l);
    
  }
  
}