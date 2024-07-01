package JavaDSA.LinkedList.Problems;

class DeleteANodeItselfAsAParameter {
    public static void deleteNode(ListNode node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
         ListNode n1 = new ListNode(45);
         ListNode n2 = new ListNode(36);
         ListNode n3 = new ListNode(22);
         n1.next = n2;
         n2.next=n3;
         printList(n1);
         deleteNode(n2);
         printList(n1);
    }
}
