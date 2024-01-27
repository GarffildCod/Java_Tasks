// Написать конвертер из римской цифр в арабскую


package Lesson05;

import java.util.HashMap;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        HashMap<Character, Integer> mapChars = new HashMap<>(7);
        mapChars.put('I', 1);
        mapChars.put('V', 5);
        mapChars.put('X', 10);
        mapChars.put('L', 50);
        mapChars.put('C', 100);
        mapChars.put('D', 500);
        mapChars.put('M', 1000);
        System.out.println("input number");
        Scanner scanner = new Scanner(System.in);
        String romaNumber = scanner.nextLine();
        int result = 0;
        for (int i = 0; i < romaNumber.length(); i++) {
            int correntRoma = mapChars.get(romaNumber.charAt(i));
            int prevRoma = i == 0 ? 0 : mapChars.get(romaNumber.charAt(i - 1));
            if (i > 0 && correntRoma > prevRoma){
                result -= prevRoma;
                result += correntRoma - prevRoma;
            } else {
                result += correntRoma;
            }
        }
        System.out.println(result);
    }
}