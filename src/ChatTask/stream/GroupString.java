package ChatTask.stream;

import java.util.*;
import java.util.stream.Collectors;

/*Группировка строк по длине:

Дано List<String>. Сгруппируй строки по их длине (Map<Integer, List<String>>).
*/
public class GroupString {
    public static void main(String[] args) {
        List<String> str=new ArrayList<>();
        str.add("aaaa");
        str.add("sdsada");
        str.add("cat");
        str.add("dog");
        Map<Integer,List<String>> group=new HashMap<>();
       /* for (int i = 0; i < str.size(); i++) {
            int lengthStr=str.get(i).length();
            group.putIfAbsent(lengthStr,new ArrayList<>());
            group.get(lengthStr).add(str.get(i));
        }*/

        System.out.println( str.stream().collect(Collectors.groupingBy(String::length)));
    }
}
