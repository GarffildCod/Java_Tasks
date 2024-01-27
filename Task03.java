// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

private static void ex4() {
        String str = "Добро пожаловать на курс по Java ";
        String[] words = str.split(" ");
        String temp = "";
        for(int i = 0; i < words.length / 2; i++){
            temp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = temp;
        }
        for(String j: words){
            System.out.print(j + " ");
        }
    }