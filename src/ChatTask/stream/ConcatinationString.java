package ChatTask.stream;

import java.util.ArrayList;
import java.util.List;

/*
* Конкатенация строк:

Дано List<String>. Объедини все строки в одну с разделителем ",".
*/
public class ConcatinationString {
    public static void main(String[] args) {
        List<String> str=new ArrayList<>();
        str.add("a");
        str.add("cat");
        str.add("ad");
        str.add("apple");
        str.add("banana");
        str.add("orange");

        System.out.println(str.stream().reduce("",(x,y)->x+y+" "));
    }
}
