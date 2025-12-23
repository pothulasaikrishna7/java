import java.util.*;

public class F1{
    public static void main(String[] args) {

        Integer[] a = {1, 2, 2, 3, 4, 4, 5};

        Set<Integer> s = new LinkedHashSet<>(Arrays.asList(a));

        System.out.println(s);
    }
}


