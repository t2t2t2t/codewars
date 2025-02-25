package ChatTask.map;

import java.util.*;

/*Ключ с максимальным значением:

Дана Map<String, Integer>. Найди ключ с максимальным значением. Если таких несколько, выведи любой.*/
public class MaxValue {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("cat",3);
        map.put("rat",1);
        map.put("dog",5);
        List<Map.Entry <String,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        System.out.println(list.get(0));

        System.out.println(map.entrySet().stream().reduce((x,y)->x.getValue()>y.getValue()?x:y).get().getValue());

    }
}
