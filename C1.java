public class C1 {
     
    public static void main(String[] args) {

        int num = 153;
        int sum = 0, temp = num;

        while (temp > 0) {
            int d = temp % 10;
            sum = sum + d * d * d;
            temp = temp / 10;
        }

        if (sum == num)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }


}
