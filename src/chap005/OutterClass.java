package chap005;

public class OutterClass {
    public static void main(String[] args){
        System.out.println(ClassInstanceVariable.index);

        ClassInstanceVariable object = new ClassInstanceVariable();
        System.out.println(object.index2);

    }
}
