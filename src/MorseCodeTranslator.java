import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by jnew23 on 3/13/17.
 */
public class MorseCodeTranslator {

    private char[] eng = "abcdefghijklmnopqrstuvwxyz0123456789.,?' ".toCharArray();
    private String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", ".-.-.-", "--..--", "..--..", ".----.", "/"};

    public MorseCodeTranslator() {
        Map<Integer, String> alphabet = new HashMap<>();
        assignChars(alphabet);

        System.out.println(takeInput(alphabet));

    }

    public static void main(String[] args) {
        MorseCodeTranslator morseCodeTranslator = new MorseCodeTranslator();
    }

    private String takeInput(Map hm) {
        Scanner scan = new Scanner(new InputStreamReader(System.in));
        String output = "";

        System.out.print("Input english to translate: ");
        String input = scan.nextLine().toLowerCase();
        char[] inputArray = input.toCharArray();
        for (char c: inputArray) {
            if (hm.containsKey((int)c)) {
                output = output.concat(String.valueOf(hm.get((int)c)) + " ");
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
