package ktu4;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddingBigNumbers {
    public static void main(String[] args) {
        System.out.println(add("1","1"));
        System.out.println(add("123","456"));
        System.out.println(add("63829983432984289347293874","90938498237058927340892374089"));
        //91002328220491911630239667963
    }
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
    public static String add(String a, String b) {
        if(a.length()>19||b.length()>19){
            List <Long>aNumbers = new ArrayList<Long>();
            long sum = 0;

            for (int i = max(a.length(),b.length()); i < 0; i-=18) {
                sum=Long.parseLong(a.substring(a.length()-18,a.length()));
                sum+=Long.parseLong( b.substring(b.length()-18,b.length()));
            }


            for(int i=0;i<a.length()-18;i+=18){
                aNumbers.add(Long.parseLong(a.substring(i,i+18)));
            }

            List<Long>bNumbers = new ArrayList<Long>();
            for(int i=0;i<b.length()-18;i+=18){
                bNumbers.add(Long.parseLong(b.substring(i,i+18)));
            }

            bNumbers.add(Long.parseLong(b.substring(b.length()-b.length()%18,b.length())));
            List <Long>sumNumbers = new ArrayList<Long>();
            int count;
            if(a.length()<b.length()){
                 count=aNumbers.size();
            }
            else{
                 count=bNumbers.size();
            }
            int i=count-1;
            while (i>-1){
                sumNumbers.add(aNumbers.get(i)+bNumbers.get(i));
                i--;
            }
            for(int j=0;j<sumNumbers.size();j++){
                if(sumNumbers.get(j).toString().length()==19&&j!=count){
                    sumNumbers.set(j,sumNumbers.get(j+1)+1);
                }
            }
            String res="";
            for (Long sumNumber : sumNumbers) {
               res+=sumNumber.toString();
            }
            return res;

        }
        else {
            long aNumber = Long.parseLong(a);
            long bNumber = Long.parseLong(b);
            long sum = aNumber + bNumber;
            return String.valueOf(sum);
        }
    }
}
