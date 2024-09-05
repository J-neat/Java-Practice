package chap005;

public class StringFormat {

    public static void main(String[] args){
        String str2 = "치환값1: %d .... 치환괎2:  %d";
        System.out.println(String.format(str2, 7, 8));

        String str3 = "치환값1: % f .... 치환괎2:  %f";
        System.out.println(String.format(str3, 4.5, 6.7));
    }
}
