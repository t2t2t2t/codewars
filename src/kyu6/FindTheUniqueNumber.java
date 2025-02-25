package kyu6;

import java.util.Arrays;

public class FindTheUniqueNumber {
    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{0, 1, 0}));
        System.out.println(findUniq((new double[]{1, 1, 1, 2, 1, 1})));
        System.out.println(findUniq((new double[]{1, 0, 0})));
    }
    public static double findUniq(double arr[]) {
        double[] filterStream= Arrays.stream(arr).filter(x->x!=arr[0]).toArray();
        if (filterStream.length==1)
            return filterStream[0];
        else return arr[0];
    }
}
