package ChatTask.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Нахождение уникальных символов:

Дано List<String>. Верни список всех уникальных символов, которые встречаются в строках.*/
public class UnicalCharacter {
    public static void main(String[] args) {
        List<String> str=new ArrayList<>(List.of("rar","pop","corn"));
        System.out.println(str.stream().map(String::chars).collect(Collectors.groupingBy(c->c)));

    }
}
