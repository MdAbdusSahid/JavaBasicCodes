package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //blank Stream
        Stream<Object> emptyStream = Stream.empty();

        //Object, Array, Collection

        String names[] = {"Sahid", "Abdus", "Charlie"};
        Stream<String> stream1 = Stream.of(names);
        //stream1.forEach(System.out::println);
        stream1.forEach(e ->
                System.out.println(e));

        //
        Stream<Object> streamBuilder = Stream.builder().build();
        //

        IntStream stream = Arrays.stream(new int[]{2, 3, 4, 5, 6, 7, 8, 9});
        stream.forEach(
                System.out::println);

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(23);
        list2.add(34);
        list2.add(45);
        list2.add(56);
        list2.add(67);
        list2.add(78);

        Stream<Integer> str = list2.stream();
        str.forEach(System.out::println);

    }
}
