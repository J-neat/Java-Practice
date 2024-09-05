package chap005;

public class StringBuilderBufferExample {
    public static void main(String[] args){
        String result = "";
        result += "Hello  ";
        result += "Java  ";
        result += "World!  ";
        System.out.println(result);

        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello  ");
        buffer.append("Java  ");
        buffer.append("World!  ");
        System.out.println(buffer);

        StringBuilder builder = new StringBuilder();
        builder.append("Hello  ");
        builder.append("Java  ");
        builder.append("World!  ");
        System.out.println(builder);

//        StringBuffer, Builder 각각 insert() substring() 메소드 호출해보기
    }
}
