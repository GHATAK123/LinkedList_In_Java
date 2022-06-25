public class DoublyLinkedList {

    public static class Node {

        public int value;
        public Node next;
        public Node prev;
        public Node head;
        public Node tail;
        public int size;

        public Node(){
            this.size=0;
        }

        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next,Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to DoublyLinkedList!");
        

    }
}
