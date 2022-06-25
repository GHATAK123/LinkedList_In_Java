public class SinglyLinkedList {

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

        // Find Node via Index
        public Node get(int index) {
            Node node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        }

        // Find Node via value
        public Node find(int value) {
            Node node = head;
            while (node != null) {
                if (node.value == value) {
                    return node;
                }
                node = node.next;
            }
            return null;
        }

        // Delete the node From start
        public int deleteFromStart() {
            int val = head.value;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return val;

        }

        // Delete the node From End
        public int deleteFromEnd() {
            if (size <= 1) {
                deleteFromStart();
            }

            Node secondLast = get(size - 2);
            int val = tail.value;
            tail = secondLast;
            tail.next = null;
            size--;
            return val;

        }

        // Delete the Node from particular Index
        public int deleteFromIndex(int index) {
            if (index == 0) {
                deleteFromStart();
            }
            if (index == size - 1) {
                deleteFromEnd();
            }

            if (index > size) {
                System.out.println("Index Out Of Bound");
                return 0;
            }
            Node prev = get(index - 1);
            int val = prev.next.value;
            prev.next = prev.next.next;
            size--;
            return val;

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

        System.out.println("Deleted Node is " + node.deleteFromStart());

        node.displayLinkedList();
        node.sizeLL();

        System.out.println("Deleted Node is " + node.deleteFromEnd());

        node.displayLinkedList();
        node.sizeLL();

        System.out.println("Deleted Node is " + node.deleteFromIndex(100));

        node.displayLinkedList();
        node.sizeLL();

        System.out.println("Deleted Node is " + node.deleteFromIndex(4));

        node.displayLinkedList();
        node.sizeLL();

    }
}