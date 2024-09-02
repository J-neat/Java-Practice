package chap02;

public class ForeCasting {
    public static void main(String[] args){
        long longValue = 300;
        int intValue = (int) longValue;
        System.out.println("intValue = " + intValue);

        double pi = 3.14;
        int convertedInt = (int) pi;
        System.out.println("convertedInt = "+ pi);


    }
}
