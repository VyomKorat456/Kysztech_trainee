package Kysztechque;

import java.util.Arrays;
import java.util.stream.Stream;

public class f1 {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("a,b", "c");
        s.flatMap(str -> Arrays.stream(str.split(",")))
                .forEach(System.out::print);

    }
}
