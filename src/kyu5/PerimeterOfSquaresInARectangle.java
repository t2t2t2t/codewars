package kyu5;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class PerimeterOfSquaresInARectangle {
    public static void main(String[] args) {
        System.out.println(perimeter(BigInteger.valueOf(30)));

    }
    public static BigInteger perimeter(BigInteger n) {
        List<BigInteger> res = new ArrayList<BigInteger>();
        res.add(BigInteger.valueOf(1));
        res.add(BigInteger.valueOf(1));
        for (int i = 1; i < n.longValue(); i++) {
            res.add(res.get(i-1).add(res.get(i)));
        }
        BigInteger sum = BigInteger.ZERO;
        for (BigInteger result : res) {

            sum=sum.add(result);
        }
        return sum.multiply(BigInteger.valueOf(4));
    }

}
