package chap005;

public class StringCompression {
    public static void main(String[] args) {
        String input = "aaaabbccd";
        String compressed = compressString(input);
        System.out.println(compressed);  // 출력: a4b2c2d1
    }

    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;  // count 초기화
            }
        }

        // 마지막 문자와 그 횟수 추가
        compressed.append(str.charAt(str.length() - 1)).append(count);

        return compressed.toString();
    }
}

