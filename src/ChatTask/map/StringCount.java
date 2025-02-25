package ChatTask.map;
/*
Дан текст (строка). Посчитай, сколько раз встречается каждое слово, используя Map<String, Integer>.
Пример: "apple banana apple orange banana apple"
Результат: {apple=3, banana=2, orange=1}
 */

import java.util.HashMap;
import java.util.Map;

public class StringCount {
    public static void main(String[] args) {
        String str="apple banana apple orange banana apple watermelon";
        Map<String,Integer>countWords=countWords(str);
        System.out.println(countWords);
    }

    public static Map<String,Integer> countWords(String text){

        Map<String, Integer> states=new HashMap<>();
        for (String word: text.split(" ")) {
            if (states.containsKey(word)){
                states.put(word, states.get(word)+1);
            }
            else states.put(word,1);

        }
        return states;
    }
}
