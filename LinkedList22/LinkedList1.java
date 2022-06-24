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

        // Insert a new node from start
        public void insertNodeFromStart(int value) {
            Node node = new Node(value);
            node.next = head;
            head = node;

            if (tail == null) {
                tail = head;
            }
            size++;
        }

        // Insert the node at the end of the
        public void insertNodeFromEnd(int value) {
            if (tail == null) {
                insertNodeFromStart(value);
                return;
            }
            Node node = new Node(value);
            tail.next = node;
            tail = node;
            size++;
        }

        // Insert the Node at Particular Index
        public void insertAtIndex(int value, int index) {
            if (index == 0) {
                insertNodeFromStart(value);
                return;
            }
            if (index == size) {
                insertNodeFromEnd(value);
                return;
            }
            if (index > size) {
                System.out.println("Index Out of Bound");
                return;
            }
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }

            Node node = new Node(value, temp.next);
            temp.next = node;
            size++;

        }

        // Display the Node of LinkedList
        public void displayLinkedList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
            System.out.println("End");
            System.out.println("The Head Value is " + head.value);
            System.out.println("The Tail Value is " + tail.value);
        }

        public void sizeLL() {
            System.out.println("The length of the LinkedList is " + size);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList!");

        Node node = new Node();
        node.insertNodeFromStart(6);
        node.insertNodeFromStart(17);
        node.insertNodeFromStart(23);
        node.insertNodeFromStart(54);
        node.insertNodeFromStart(83);

        node.displayLinkedList();
        node.sizeLL();

        node.insertNodeFromEnd(99);
        node.insertNodeFromEnd(89);

        node.displayLinkedList();
        node.sizeLL();

        node.insertAtIndex(44, 3);

        node.displayLinkedList();
        node.sizeLL();

        node.insertAtIndex(44, 100);

        node.displayLinkedList();
        node.sizeLL();

    }
}