package ChatTask.stream;
/*
Частота символов:

Дана строка. Подсчитай частоту каждого символа, используя Stream.
*/

import java.util.Map;
import java.util.stream.Collectors;

public class SymbolFrequency {
    public static void main(String[] args) {
        String str="aaa boob cobra cat dog";
       Map <Character,Long> list= str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));

        System.out.println(list);

    }
}
