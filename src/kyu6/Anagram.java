package kyu6;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/*
Анаграммы:
Даны два слова. Напиши функцию, которая проверит, являются ли они анаграммами
(используй Map<Character, Integer> для подсчёта символов).
Пример: silent и listen → true
 */
public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("silent","listen"));
        System.out.println(anagram("TTt","ttt"));
        System.out.println(anagram("kek","kek"));
        System.out.println(anagram("LOL","loool"));
        System.out.println(anagram("Text","txt"));
    }
    public static boolean anagram(String text1,String text2){

        if(text1.length()!=text2.length()){
            return false;
        }
        text1=text1.toLowerCase();
        text2=text2.toLowerCase();
        Map <Character,Integer> character=new HashMap<>();

        for (int i = 0; i < text1.length(); i++) {
            Character c=text1.charAt(i);
            if (character.containsKey(c)){
                character.put(c,character.get(c)+1);
            }else character.put(c,1);
        }
        for (int i = 0; i < text2.length(); i++) {
            Character c=text2.charAt(i);
            if (character.containsKey(c) && character.get(c)>0){
                character.put(c,character.get(c)-1);
            }else return false;
        }


        return true;
    }
}
