 public class D1{
    public static void main(String[] args) {

        int[] a = {5, 2, 8, 1, 3};
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {          // passes
            for (int j = 0; j < n - 1 - i; j++) {  // comparisons

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
    

