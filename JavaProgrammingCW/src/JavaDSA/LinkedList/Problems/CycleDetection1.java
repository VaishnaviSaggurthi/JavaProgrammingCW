package JavaDSA.LinkedList.Problems;

public class CycleDetection1 {
    public static class Node{
        // Node class consists of two attributes
        int data; // value
        Node next; // address of next node -- self-referential class -> class pointing to itself
        Node(int data){
            this.data=data;
        }
    }
    public static boolean cycleDetection(Node head){
        if(head==null) return false; // empty list cannot be a cycle
        if(head.next==null) return false; // 1 element in linked list cannot be a cycle pointing to itself so false
        Node slow=head;
        Node fast=head;
        while(fast!=null){
            if(slow==null) return false;
            slow=slow.next;
            if(fast.next==null) return false;
            fast=fast.next.next;
            if(fast==slow) return true;
        }
        return false;
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
        f.next=b;
        boolean x = cycleDetection(a);
        if(x) System.out.println("true");
        else System.out.println("false");
    }
}
