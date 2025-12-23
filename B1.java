public class B1 {
    public static void main(String[] args) {

        int n = 10;   
        int a = 0, b = 1;

        while (a <= n) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
