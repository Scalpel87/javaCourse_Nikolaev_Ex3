import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Main5 {
    public static void main(String[] args) {
        String str = "Max";
        String str2 = "Max";
        System.out.println(str.equals(str2));

        System.out.println(str.equals(str2));
        System.out.println(str2.trim());
        System.out.println(str2.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("r"));
        System.out.println(str.getBytes());

        String[] strings = str.split(" ");
        for (String s : strings){
            System.out.println(s);
        }
    }
}
