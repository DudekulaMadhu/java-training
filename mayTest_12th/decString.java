package mayTest_12th;

import java.util.ArrayList;
import java.util.List;

public class decString {
    public static String desc(String str) {
        List<Character> list = new ArrayList<>();
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        list.sort((a, b) -> {
            if(a > b) {
                return -1;
            }
            return 0;
        });

        for (Character ch : list) {
            s += ch;
        }
        return s;
    }
    public static void main(String[] args) {
        String str = "Nanimadhuhoney";
        System.out.println(desc(str));
    }
}