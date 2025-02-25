package ChatTask.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Числа в строку:

Дано List<Integer>. Преобразуй числа в строку вида: "1, 2, 3".*/
public class NumberString {
    public static void main(String[] args) {
        List<Integer> number=new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(number);
        String str=number.stream().map(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(str);
    }
}
