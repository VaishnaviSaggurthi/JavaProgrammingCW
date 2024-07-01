package JavaDSA.LinkedList.Problems;

public class findMiddleElementRightMiddleAndOdd {
    public static class Node{
        // Node class consists of two attributes
        int data; // value
        Node next; // address of next node -- self-referential class -> class pointing to itself
        Node(int data){
            this.data=data;
        }
    }
    public static Node findMiddleElement(Node head){
        Node slow =  head;
        Node fast =  head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node x = findMiddleElement(a);
        System.out.println(x.data);
    }
}
