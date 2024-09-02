package chap02;

public class Sample {
    public static void main(String[] args){
        String str1 = "실제값";
        String str2 = new String("실제값");
        String str3 = "실제값";
        String str4 = new String("실제값");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str4);

    }
}
