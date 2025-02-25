package ChatTask.stream;

import java.util.ArrayList;
import java.util.List;

/*
Фильтрация строк по длине:

Дано List<String>. Оставь только строки длиной больше 3.
*/
public class FilterLength {
    public static void main(String[] args) {
       // String str="apple banana apple orange banana apple watermelon"
        List<String> str=new ArrayList<>();
        str.add("a");
        str.add("cat");
        str.add("ad");
        str.add("apple");
        str.add("banana");
        str.add("orange");
        str.stream().filter(s->s.length()>3).forEach(System.out::println);
    }
}
