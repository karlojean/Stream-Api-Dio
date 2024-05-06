package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


        numbers.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}
