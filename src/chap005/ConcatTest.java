package chap005;

public class ConcatTest {

    public static void main(String[] args){
        String test = "aaaabbccd";
        for (int i = 0; i < test.length(); i++) {
            System.out.println(test.charAt(i));
        }

        String str2 = "Hello Welcome Java";
        String[] arr2 = str2.split(" ");
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i] + " ");
        }

        String test3 = "  Hello Welcome Java  ";
        System.out.println(test3.replaceAll(" ", ""));
    }

}
