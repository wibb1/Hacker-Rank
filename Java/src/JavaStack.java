import java.util.*;

public class JavaStack {

    private static final Map<Character, Character> charMap = buildMap();

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(checkStack(input));
        }

    }

    private static boolean checkStack(String string) {
        if (string.length() % 2 != 0) return false;
        Stack<Character> charStack = new Stack<>();
        Character[] charArray = string.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        for (Character tempChar : charArray) {
            if (charStack.empty() || charStack.peek()==null || tempChar != charMap.get(charStack.peek())) {
                charStack.push(tempChar);
            } else {
                charStack.pop();
            }
        }
        return charStack.empty();
    }

    private static Map<Character, Character> buildMap() {
        Map<Character, Character> charMap = new HashMap<>();
        charMap.put('{', '}');
        charMap.put('[', ']');
        charMap.put('(', ')');
        return charMap;
    }
}
