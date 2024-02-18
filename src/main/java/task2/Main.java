package task2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static List<String> uppercaseAndSortDescending(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Andriy", "Peter", "Mykola", "Oleksandr");
        List<String> result = uppercaseAndSortDescending(names);

        result.forEach(System.out::println);
    }
}
