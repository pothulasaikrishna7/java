public class E1 {
    
    public static void main(String[] args) {

        int[] a = {5, 2, 8, 1, 3};

        int max = a[0];
        int min = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}

    

