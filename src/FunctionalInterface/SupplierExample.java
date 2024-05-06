package FunctionalInterface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> greetings = () -> "Olá, seja bem-vindo(a)!";

        List<String> greetingsList = Stream.generate(() -> "Olá, seja bem-vindo(a)")
                .limit(5)
                .toList();

        greetingsList.forEach(System.out::println);
    }
}
