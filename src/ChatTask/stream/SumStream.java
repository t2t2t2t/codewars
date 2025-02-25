package ChatTask.stream;

import java.util.ArrayList;
import java.util.List;

/*
Сумма всех чисел:

Дано List<Integer>. Посчитай сумму всех чисел, используя Stream.
*/
public class SumStream {
    public static void main(String[] args) {
        List<Integer> number=new ArrayList<>();
        number.add(2);
        number.add(5);
        number.add(18);

        System.out.println(number.stream().reduce((x,y)->x+y).get());
    }
}
