// • Дано четное число N (>0) и символы c1 и c2.

package Lesson02;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        char c1 = 'A';
        char c2 = 'B';
        Scanner cs = new Scanner(System.in);
        System.out.println("input number");
        int amountOfChar = cs.nextInt();
        String result = "";
        char temp = c2;
        for(int i = 0; i < amountOfChar; i++){
            if(temp == c1){
                result += c2;
                temp = c2;
            }else {
                result += c1;
                temp = c1;
            }
        }

    System.out.println(result);
        
    }
}