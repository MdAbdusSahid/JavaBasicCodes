package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        List<Integer> list1=List.of(2,3,4,5,6,7,8,9);
        System.out.println(list1);
        List<Integer> list2=new ArrayList<>();
        list2.add(12);
        list2.add(23);
        list2.add(34);
        list2.add(45);
        list2.add(56);
        list2.add(67);
        list2.add(78);
        System.out.println(list2);
        List<Integer> list3= Arrays.asList(9,8,7,6,5,4,3,2,1);
        //Without Stream

        List<Integer> isEven=new ArrayList<>();
        for(int i:list1){
            if(i%2==0)
                isEven.add(i);
        }
        System.out.println(isEven);

        //Using Stream

//        Stream<Integer> stream=list1.stream();
//        List<Integer> newList= stream.filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(newList);

        List<Integer> newList= list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);


        List<Integer> newList1=list1.stream().filter(i->i>5).collect(Collectors.toList());
        System.out.println(newList1);



    }
}
