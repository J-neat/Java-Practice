package chap02;

public class AutoCastingInOperand {
    public static void main(String[] args){
//        int intValue = 10;
//        double doubleValue = 5.5;
//
//        double result = intValue + doubleValue;    // result에 15.5가 저장

        int intValue = 10;
        double doubleValue = 5.5;

        int result = intValue + (int)doubleValue;   // result에 15가 저장
    }
}
