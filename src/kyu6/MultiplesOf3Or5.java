package kyu6;

import java.io.InputStream;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
Если мы перечислим все натуральные числа до 10, кратные 3 или 5,
мы получим 3, 5, 6 и 9. Сумма этих кратных равна 23.
Завершите решение так, чтобы оно вернуло сумму всех чисел, кратных 3 или 5,
ниже введенного числа.
Примечание. Если число кратно 3 и 5, посчитайте его только один раз.
*/
public class MultiplesOf3Or5 {
    public static void main(String[] args) {
        System.out.println(solution(20));
    }
    public static int solution(int number) {
        return IntStream.range(1,number).filter((x)->x%3==0||x%5==0).sum();
    }
}
