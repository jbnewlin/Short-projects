import java.io.Console;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by jnew23 on 3/13/17.
 */
public class MorseCodeTranslator {

    private char[] eng = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.', ',', '?', '\'', ' '};
    private String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", ".-.-.-", "--..--", "..--..", ".----.", "/"};

    public static void main(String[] args) {
        MorseCodeTranslator morseCodeTranslator = new MorseCodeTranslator();
    }

    public MorseCodeTranslator() {
        Map<Integer, String> alphabet = new HashMap<>();
        assignChars(alphabet);

        System.out.println(takeInput(alphabet));

    }

    private String takeInput(Map hm) {
        Scanner scan = new Scanner(new InputStreamReader(System.in));
        String output = "";
        String input = scan.nextLine().toLowerCase();
        char[] inputArray = input.toCharArray();
        for (char c: inputArray) {
            if (hm.containsKey((int)c)) {
                output = output.concat(String.valueOf(hm.get((int)c)) + " ");
//                System.out.println(String.valueOf(hm.get((int)c)));
            } else {
                System.out.println("Value \'" + c + "\' doesn't exist in key");
                return "";
            }
        }
        return output;
    }

    private void assignChars(Map hm) {
        for (int i = 0; i < eng.length; i++) {
            hm.put((int)eng[i], morse[i]);
        }
    }
}
