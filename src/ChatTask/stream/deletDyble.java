package ChatTask.stream;

import java.util.List;
import java.util.stream.Collectors;

/*Удаление дубликатов:

Дано List<String>. Удали все дубликаты.
*/
public class deletDyble {
    public static void main(String[] args) {
        List<String> list=List.of("cat","cat","dog","cow","cat");
        System.out.println(list.stream().collect(Collectors.toSet()));
        System.out.println(list.stream().distinct().toList());
    }
}
