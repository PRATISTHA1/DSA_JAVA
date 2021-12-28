package arrays;

import java.util.*;

public class array {
    static class node {
        int capacity;
        int used;
        int[] p;
    }

    void insertion(node a, int index, int value, int cap, int used) {

        if (index >= cap) {
            System.out.println("insertion cannot be done");
        }
        a.used++;
        for (int i = used; i >= index; i--) {
            a.p[i + 1] = a.p[i];

        }
        a.p[index] = value;

    }

    void deletion(node a, int index) {
        a.used--;
        for (int i = index; i <= a.used - 1; i++) {
            a.p[i] = a.p[i + 1];
        }
    }

    int elements(node a, int used) {
        Scanner obj = new Scanner(System.in);
        for (int i = 0; i < used; i++) {
            a.p[i] = obj.nextInt();
        }
        return 0;
    }

    int traverse(node a, int used) {
        for (int i = 0; i < used; i++) {
            System.out.println("array is " + a.p[i]);
        }
        return 0;
    }

    public static void main(String[] args) {
        array g = new array();
        node c = new node();
        c.capacity = 100;
        c.used = 6;
        c.p = new int[c.capacity];
        System.out.println("enter");
        g.elements(c, c.used);

        g.traverse(c, c.used);
        g.insertion(c, 2, 9, c.capacity, c.used);
        g.traverse(c, c.used);
        g.deletion(c, 3);
        g.traverse(c, c.used);
    }
}
