package ChatTask.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
* Максимум из списка:

Дано List<Integer>. Найди максимальное значение.
* */
public class MaxNUmber {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(1501);
        numbers.add(0);
        numbers.add(85);
        System.out.println(numbers.stream().collect(Collectors.maxBy(Integer::compare)));
        System.out.println(Collections.max(numbers));
        System.out.println(numbers.stream().reduce(Integer::max));

    }
}
