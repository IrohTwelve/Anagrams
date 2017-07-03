import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        simpleStringReverse(reader.readLine());
        printReverseString(reader.readLine());
    }


    public static void printReverseString(String s) {
        int wordStart = 0;
        int wordEnd = 0;
        while (wordStart < s.length() && wordEnd < s.length()) {
            while (s.charAt(wordEnd) != ' ' && wordEnd < s.length()) {
                wordEnd++;
                if (wordEnd >= s.length())
                    break;
            }
            for (int i = wordEnd - 1; i >= wordStart; i--) {
                System.out.print(s.charAt(i));
            }
            wordStart = wordEnd;
            wordEnd++;
        }
    }

    public static void simpleStringReverse(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
