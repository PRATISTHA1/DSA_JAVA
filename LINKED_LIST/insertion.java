package LinkedList;

public class insertion {

    static class node {

        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void traverse(node head) {
        node ptr = head;
        do {
            System.out.println("" + ptr.data);
            ptr = ptr.next;
        } while (ptr != null);

    }

    node inserthead(node head, int data) {
        node n = new node(10);
        n.next = head;
        head = n;
        return head;
    }

    node insertlast(node head, int data) {
        node n = new node(12);

        node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }

        ptr.next = n;
        n.next = null;
        return head;
    }

    node insertbetween(node head, int data, int index) {
        node n = new node(data);
        node ptr = head;
        for (int i = 1; i < index; i++) {
            ptr = ptr.next;
        }
        n.next = ptr.next;
        ptr.next = n;
        return head;

    }

    public static void main(String[] args) {

        insertion insert = new insertion();
        node head = new node(1);
        node second = new node(2);
        node third = new node(3);
        node fourth = new node(4);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        insert.traverse(head);
        head = insert.inserthead(head, 10);
        insert.traverse(head);
        head = insert.insertlast(head, 12);
        insert.traverse(head);
        head = insert.insertbetween(head, 13, 2);
        insert.traverse(head);

    }
}
