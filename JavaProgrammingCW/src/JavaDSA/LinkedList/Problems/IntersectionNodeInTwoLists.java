package JavaDSA.LinkedList.Problems;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
public class IntersectionNodeInTwoLists {
    public static Node getIntersectionNode(Node headA,Node headB){
        Node tempA = headA;
        Node tempB = headB;
        int lengthA=0;
        while(tempA!=null){
            lengthA++;
            tempA=tempA.next;
        }
        int lengthB=0;
        while(tempB!=null){
            lengthB++;
            tempB=tempB.next;
        }
        tempA=headA;
        tempB=headB;
        if(lengthA>lengthB){
            int steps = lengthA - lengthB;
            for(int i=1;i<=steps;i++){
                tempA=tempA.next;
            }
        }
        else{
            int steps = lengthB - lengthA;
            for(int i=1;i<=steps;i++){
                tempB=tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
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
        // common intersection
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        d.next=e;
        e.next=f;
        // 1st list
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;  // Connect the first list to the intersection
        // 2nd list
        Node g = new Node(90);
        Node h = new Node(9);
        g.next=h;
        h.next=d;  // Connect the second list to the intersection
        display(a);
        display(g);
        Node n = getIntersectionNode(a,g);
        System.out.println(n.data);
    }
}
