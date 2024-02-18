package task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static String sortAndFormatNumbers(String[] array) {
        String numbers = Arrays.stream(array)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        return numbers;
    }

    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        String result = sortAndFormatNumbers(array);
        System.out.println(result);
    }
}
