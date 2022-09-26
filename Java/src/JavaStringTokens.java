import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaStringTokens {
    public static void separateStrings(String s) {
        int i = 0;
        ArrayList<String> list = new ArrayList<>();
        String regEx = "[A-Za-z]+";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(s);

        while (m.find()) {
            list.add(m.group(i));
        }
        System.out.println(list.size());
        for (String str : list) System.out.println(str);
    }
}
