public class Task01Opti02 {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';
        int n = 5;
        String str = "" + a + b;
        str = str.repeat(n / 2) + ((n % 2 == 1) ? a : "");
        System.out.println(str);

    }
}