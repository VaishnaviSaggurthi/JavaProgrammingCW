package JavaDSA.LinkedList.Problems;

public class NthNodeFromEndInOneTraversal {
        public static class Node{
            // Node class consists of two attributes
            int data; // value
            Node next; // address of next node -- self-referential class -> class pointing to itself
            Node(int data){
                this.data=data;
            }
        }
        public static Node nthNode(Node head, int n){
            Node slow = head;
            Node fast = head;
            for(int i=1;i<=n;i++){
                fast=fast.next;
            }
            if(fast==null){
                head=head.next;
                return head;
            }
            while(fast.next!=null){
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=slow.next.next;
            return head;
        }
        public static void display(Node head){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
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
            display(a);
            Node x = nthNode(a,3);
            display(x);
        }
}
