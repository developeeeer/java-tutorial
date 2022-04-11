package projava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ForEachArraySample {
    int bai(int data) {
        return data * 2;
    }

    public static void main(String[] args) {
        var numbers = new int[]{2, 3, 5, 7};
        for (int number : numbers) {
            System.out.println(number);
        }

        var data = List.of("yamamoto", "kis", "sugiyama");
        var result = (int) data.stream().filter(s -> s.length() >= 5).count();
        System.out.println(result);
        Stream.of("a", "b", "c").forEach(s -> System.out.println(s));

        System.out.println(IntStream.rangeClosed(0, 10).sum());

        var li = IntStream.iterate(124, i -> (i * 211 + 2111) % 1000).limit(10).toArray();

        IntStream.of(li).forEach(i -> System.out.println(i));

        int[] intlist = data.stream().mapToInt(s -> s.length()).toArray();
        IntStream.of(intlist).forEach(s -> System.out.println(s));

    }
}
