package ChatTask.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Среднее значение:

Дано List<Double>. Найди среднее значение элементов.
*/
public class MeanStream {
    public static void main(String[] args) {
        List<Double> number=new ArrayList<>();
        number.add(5.0);
        number.add(10.0);
        number.add(15.0);
        System.out.println(number.stream().collect(Collectors.averagingDouble(Double::doubleValue)));

    }
}
