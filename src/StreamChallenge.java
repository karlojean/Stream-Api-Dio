import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamChallenge {

    public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        System.out.println("Desafio 1: " + numbers.stream().sorted().toList());

        System.out.println("Desafio 2: " + numbers.stream().filter(n -> n % 2 ==0).toList()
                .stream().reduce(0, (num1, num2) -> num1 + num2));

        System.out.println("Desafio 3: " + numbers.stream().allMatch(n -> n >= 0));

        System.out.println("Desafio 4: " + numbers.stream().filter(n  -> n % 2 == 0).toList());

        System.out.println("Desafio 5: " + numbers.stream().filter(n  -> n % 2 == 0 && n > 5).toList()
                .stream().reduce(0, Integer::sum)
        );

        System.out.println("Desafio 6: " + numbers.stream().anyMatch(n -> n > 10));

        System.out.println("Desafio 7: " + numbers.stream().sorted((n1, n2) -> n2.compareTo(n1)).skip(1).findFirst().orElse(null));

        System.out.println("Desafio 8: " + numbers.stream().reduce(0, (n1, n2) -> n1 + n2));

        boolean containDuplicate = numbers.stream().distinct().count() != numbers.size();

        System.out.println("Desafio 9: " + containDuplicate);

        System.out.println("Desafio 10: " + numbers.stream().filter(n -> n % 2 != 0).filter(n -> n % 3 == 0 || n % 5 == 0).toList());

        System.out.println("Desafio 11: " + numbers.stream().mapToInt(num -> num * num).sum());

        System.out.println("Desafio 12: " + numbers.stream().reduce(1, (a, b) -> a * b));

        System.out.println("Desafio 13: " + numbers.stream().filter(n -> n >= 5 && n <= 10));

        System.out.println("Desafio 14: " + numbers.stream().filter(n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }).toList().stream().max(Integer::compareTo).orElse(null));

        System.out.println("Desafio 15: " + numbers.stream().anyMatch(n -> n < 0));

        System.out.println("Desafio 16: " + numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0)));

        System.out.println("Desafio 17: " + numbers.stream().filter(n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }).toList());

        System.out.println("Desafio 18: " + (numbers.stream().distinct().count() == 1));

        System.out.println("Desafio 19: " + numbers.stream().filter(n -> n % 3 == 0 || n % 5 == 0).toList().stream().reduce(Integer::sum).orElse(null));
    }
}
