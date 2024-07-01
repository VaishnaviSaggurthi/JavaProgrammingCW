package JavaDSA.LinkedList.Problems;

public class ReverseLL_Recursion {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node reverse(Node head){
        if(head.next==null) return head; // base case
        Node newHead = reverse(head.next); // recursive work --> head.next reverse
        head.next.next = head; // interchanging --> self work
        head.next = null;
        return newHead;
    }
    public static void display(Node head){
        if(head==null){
            System.out.println();
            return;
        }
        System.out.print(head.data+" ");
        display(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        display(a);
        Node l = reverse(a);
        display(l);
    }
}
