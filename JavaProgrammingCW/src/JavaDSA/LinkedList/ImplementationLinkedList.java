package JavaDSA.LinkedList;

public class ImplementationLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int value) { // O(1) --> if tail is given // O(n) --> if only head is given
            Node temp = new Node(value);
            if (head == null) { // empty list
                head = temp;
            } else { // non-empty list
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void insertAtBegin(int value) { // O(1)
            Node newNode = new Node(value);
            if (head == null) { // empty list
                head = tail = newNode;
                // insertAtEnd(value);
            } else { // non-empty list
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        void insertAt(int index, int value) {
            Node t = new Node(value);
            Node temp = head;
            if (index == size) {
                // If we want to insert element at last index i.e. inserting at end so perform insertAtEnd action
                insertAtEnd(value);
                return;
            } else if (index == 0) {
                // If we want to insert element at 0th index i.e. inserting at begin so perform insertAtBegin action
                insertAtBegin(value);
                return;
            } else if (index < 0 || index > size) {
                System.out.println("Wrong Index");
                return;
            }
            for (int i = 1; i <= index - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        void deleteAt(int index) {
            Node temp = head;
            if (index == 0) {
                head = head.next;
                size--;
                return;
            }
            for (int i = 1; i <= index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }

        int getAt(int index) {
            if (index < 0 || index > size) {
                System.out.println("Wrong Index");
                return -1;
            }
            Node temp = head;
            for (int i = 1; i <= index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void display() { // O(n)
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
//        int size(){ // O(n)
//            int count=0;
//            Node temp = head;
//            while(temp!=null){
//                count++;
//                temp = temp.next;
//            }
//            return count;
        // return size if we have size attribute in linkedlist class then T.C will become O(1)
//            return size;
//        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.insertAtEnd(8);
        // ll.display();
        System.out.println("Size of Linked List is: " + ll.size);
        ll.insertAtBegin(10);
        ll.insertAtBegin(27);
        //  ll.display();
        System.out.println("Size of Linked List is: " + ll.size);
        ll.insertAt(3, 23);
        // ll.display();
        ll.insertAt(0, 93);
        ll.display();
        System.out.println(ll.getAt(3));
        ll.deleteAt(4);
        ll.display();
        System.out.println("Size of Linked List is: " +ll.size);
        ll.deleteAt(0);
        ll.display();
        System.out.println("Size of Linked List is: " +ll.size);
    }
}
