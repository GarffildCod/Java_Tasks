// Написать программу, которая запросит пользователя ввести <Имя> в консоли.

package lasson;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Goodbye world");
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("Введите ваше имя?");
        String name = MyScanner.nextLine();
        System.out.println(String.format("Привет, %s!", name ));
    }
}