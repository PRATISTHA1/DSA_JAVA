package arrays;

public class Max_Min {
    static void max(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(" " + max);

    }

    static void min(int a[]) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(" " + min);

    }

    static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(" " + a[i]);
        }

    }

    public static void main(String[] args) {
        int[] a = { 6, 98, 0, 1 };
        print(a);
        max(a);
        min(a);
    }
}
