package LinkedList;

public class linkedlist {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    int traverse(node head) {
        node ptr = head;

        do {
            System.out.println("value of index " + ptr.data);
            ptr = ptr.next;
        } while (ptr != null);
        return 0;
    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        node head = new node(7);
        node second = new node(8);
        node third = new node(8);
        node fourth = new node(8);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        l.traverse(head);
    }

}
