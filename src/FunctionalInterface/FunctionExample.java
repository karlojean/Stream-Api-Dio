package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> numbersDouble = numbers.stream()
                .map(
                        number -> number * 2
                )
                .collect(Collectors.toList());

        numbersDouble.forEach(System.out::println);
    }
}