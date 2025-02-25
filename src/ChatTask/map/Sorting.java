package ChatTask.map;

import java.util.*;
import java.util.stream.Stream;

/*Сортировка по значению:

Дана Map<String, Integer>. Отсортируй её по значению (в порядке убывания).*/
public class Sorting {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("cat",3);
        map.put("rat",1);
        map.put("dog",5);

        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        System.out.println(list);
    }
}
