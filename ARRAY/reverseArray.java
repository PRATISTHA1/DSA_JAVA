package arrays;

import java.util.*;

public class reverseArray {
    static void reverse(int a[], int start, int end) {
        int temp;

        while (start < end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        int[] a = new int[5];
        System.out.println("enter elements");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        printArray(a, 5);
        reverse(a, 0, 4);
        printArray(a, 5);

    }
}