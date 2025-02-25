package ChatTask.map;

import java.util.HashMap;
import java.util.Map;

/*Слияние мап:

Даны две Map<String, Integer>. Объедини их, сложив значения одинаковых ключей.
Пример:
map1 = {a=2, b=3}
map2 = {a=5, c=7}
Результат: {a=7, b=3, c=7}
*/
public class MergeMap {
    public static void main(String[] args) {
        Map<String,Integer> map1=new HashMap<>();

        Map<String,Integer> map2=new HashMap<>();
        map1.put("asd",3);
        map2.put("asd",3);
        map1.put("afh",4);
        map2.put("cat",5);
        map1.put("dog",5);
        System.out.println(mergeMap(map1,map2));
    }
    public static Map<String,Integer> mergeMap(Map<String,Integer> map1,Map<String,Integer> map2){
        for (Map.Entry entry: map2.entrySet()) {

            map1.merge((String) entry.getKey(), (Integer) entry.getValue(),Integer::sum);

        }

      return map1;

    }
}
