package ChatTask.stream;

import java.util.ArrayList;
import java.util.List;

/*Сортировка по алфавиту:

Дано List<String>. Отсортируй строки по алфавиту.*/
public class AlphabetSorted {
    public static void main(String[] args) {
        List<String> str=new ArrayList<>(List.of("apple","zoombie","plance","cat"));
        str.sort(String::compareToIgnoreCase);
        System.out.println(str);

    }
}
