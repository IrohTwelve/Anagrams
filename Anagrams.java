import java.io.IOException;

public class Anagrams {

    public static void main(String[] args) throws IOException {

        String string = "мама мыла раму";
        System.out.println(printReverseString(string));

    }


    static String printReverseString(String inputString) {

        int stringLength = inputString.length() - 1;
        String stringToReverse = "";
        String tempString = "";

        for (int i = 0; i <= stringLength; i++) {
            tempString = tempString + inputString.charAt(i);
            if ((inputString.charAt(i) == ' ') || (i == stringLength)) {
                for (int j = tempString.length() - 1; j >= 0; j--) {
                    stringToReverse = stringToReverse + tempString.charAt(j);
                    if ((j == 0) && (i != stringLength))
                        stringToReverse += " ";
                }
                tempString = "";
            }
        }
        return stringToReverse;
    }
}
