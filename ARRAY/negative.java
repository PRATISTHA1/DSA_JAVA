package arrays;

public class negative {

    static void negative(int a[]) {
        int j = 0, temp;
        for (int i = 0; i < a.length; i++) {

            if (a[i] < 0) {
                if (i != j) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

                j++;
            }

        }
    }

    static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(" " + a[i]);
        }

    }

    public static void main(String[] args) {
        int[] a = { -1, 0, 1, -2, 4 };
        // print(a);
        negative(a);
        print(a);

    }

}
