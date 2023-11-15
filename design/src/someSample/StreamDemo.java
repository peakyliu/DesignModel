package someSample;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "def", "ghi","abc", "jkl", "mno","ahk");
        Stream<String> stringStream = strings.stream().filter(s -> "abc".equals(s));
        strings.stream().filter(s -> s.startsWith("a")).sorted().forEach(System.out::println);
        long count = stringStream.count();
        System.out.println(count);

        strings.stream().forEach(System.out::println);

        Stream<String> field = strings.stream().limit(1);
        List<String> collect = field.collect(Collectors.toList());
        System.out.println(collect);

        List<String> addResult = strings.stream().map(s -> s + 22).collect(Collectors.toList());
        System.out.println(addResult);

        strings.stream().sorted().forEach(System.out::println);

        List<String> filterResult = strings.stream().filter(s -> "abc".equals(s)).collect(Collectors.toList());
        System.out.println(filterResult);

        String stringResult = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(","));
        System.out.println(stringResult);
    }
}
