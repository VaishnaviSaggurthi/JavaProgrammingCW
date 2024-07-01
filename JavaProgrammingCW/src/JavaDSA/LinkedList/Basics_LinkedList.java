package JavaDSA.LinkedList;

public class Basics_LinkedList {
    public static void insertAtEnd(Node head,int data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = newNode;
    }
    public static int lengthOfLinkedList(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static void displayReverse(Node head){
        if(head==null) return;
        displayReverse(head.next);
        System.out.print(head.data+" ");
    }
    public static void displayRec(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        displayRec(head.next);
    }
    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static class Node{
        // Node class consists of two attributes
        int data; // value
        Node next; // address of next node -- self-referential class -> class pointing to itself
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        // Initial node in linked list is called as 'head node'
        // Final or Last node in linked list is called as 'tail node'
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        System.out.println(a.next); // initially address of 'a' is null
        a.next=b; // storing address of node b into node a
        b.next=c; // storing address of node c into node b
        c.next=d; // storing address of node d into node c
        d.next=e; // storing address of node e into node d
        System.out.println(a.next.data); // prints 3 as output
        System.out.println(a.next.next.next.data); // prints 8 as output
        System.out.println(b.next.data); // prints 9 as output
        System.out.println(a.next); // some random address
        display(a);
        System.out.println();
        display(a);
        System.out.println();
        displayRec(a);
        System.out.println();
        displayReverse(a);
        int length = lengthOfLinkedList(a);
        System.out.println();
        System.out.println("Length of a linked list is :"+length);
        insertAtEnd(a,67);
        display(a);
    }
}
