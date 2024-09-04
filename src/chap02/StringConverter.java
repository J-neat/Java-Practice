package chap02;

import java.util.ArrayList;

public class StringConverter {
    public static void main(String args[]) {
        String str = "12345";
        int intValue = Integer.parseInt(str);
        Integer integerValue = Integer.valueOf(str);

        String value = "1000.345";
        // String -> float/Float
        float primitiveFloat = Float.parseFloat(value);
        Float wrapperFloat = Float.valueOf(value);

        String str2 = "10000000000";             // 100억 숫자값으로 입력
        long strTolong = Long.parseLong(str2);   // primitive Type (long)으로 변환
        Long strToLong = Long.valueOf(str2);    // Wrapper class (Long)으로 변환

        System.out.println(strToLong);

        String str3 = "1000000.985";

// 문자열(String)을 privmitive type(double)으로 변환
        double doubleType = Double.parseDouble(str3);

// 문자열(String)을 Wrapper class (Double)으로 변환
        Double strToDouble = Double.valueOf(str3);
    }
}
