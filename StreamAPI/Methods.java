package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {

        //filter(predicate)
        //boolean value function

        //map(Function) each element operation

        List<String> names = List.of("Arijit", "Arman", "Shaan", "Ariana");
        List<String> newName = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newName);

        List<Integer> numbers = List.of(3, 5, 7, 9, 12, 14, 17, 78);
        List<Integer> newNumber = numbers.stream().map(e -> e * e).collect(Collectors.toList());
        System.out.println(newNumber);


        names.stream().forEach(e -> System.out.println(e));

        names.stream().forEach(System.out::println);

        //sorted
        numbers.stream().sorted().forEach(System.out::println);

        Integer integer = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Minimum value: "+integer);

        Integer integer1=numbers.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("Maximum value: "+integer1);


    }
}
