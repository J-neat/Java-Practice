package chap006;

public class Calculator {
    void postfixOperator(int a){
        a++;
    }

    public static void main(String[] args){
        int a= 1;
        Calculator calculator = new Calculator();
        calculator.postfixOperator(a);
        System.out.println(a);
    }
}
