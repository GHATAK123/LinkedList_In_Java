public class LinkedList1 {

    public static class Node {
        public int value;
        public Node next;
        public Node head;
        public Node tail;
        public int size;

        public Node() {
            this.size = 0;
        }
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        // Insert a new node through head
        public void insertNode(int value) {
            Node node = new Node(value);
            node.next = head;
            head = node;

            if(tail == null) {
                tail=head;
            }
            size++;
        }

        // Display the Node of LinkedList
        public void display(){
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
            System.out.println("End");
            System.out.println(head.value);
            System.out.println(tail.value);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList!");

        Node node = new Node();
        node.insertNode(6);
        node.insertNode(17);
        node.insertNode(23);
        node.insertNode(54);
        node.insertNode(83);

        node.display();



       

        
    }
}