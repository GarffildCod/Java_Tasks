// Напишите метод, который сжимает строку.

// Пример: вход aaaabbbcdd.


public class Task02 {
    public static void main(String[] args) {

    String trash = "aaaabbbcdd";
    StringBuilder result = new StringBuilder();
    int counter = 0;
    for(int i = 0; i < trash.length() - 1; i++){
        if(trash.charAt(i) == trash.charAt(i + 1)){
            counter++;
        } else if (trash.charAt(i) == trash.charAt(i + 1) && counter == 1) {
            result.append(trash.charAt(i));
            counter = 1;
        } else{
            result.append(trash.charAt(i)).append(counter);
            counter = 0;
        }
    }
        result.append(trash.charAt(trash.length() - 1)).append(counter);
        System.out.println(result);
    }
}


public class Task02Opti {
    public static void main(String[] args) {
    /*
    Напишите метод, который сжимает строку.
    Пример: вход aaaabbbcdd.
     */
        String trash = "aaaabbbcddYYYYYoooooo00000";
        StringBuilder result = new StringBuilder();

        int counter = 1;

        for (int i = 0; i < trash.length() - 1 ; i++) {
            if ( trash.charAt(i + 1) != trash.charAt(i)) {
                result.append(trash.charAt(i));
                if (counter != 1) {
                    result.append(counter);
                }
                counter = 0;
            }

            counter++;
        }
        result.append((trash.charAt(trash.length() - 1))).append(counter);
        System.out.println(result);

    }
}