// 4. В консоли запросить имя пользователя. В зависимости от 
// текущего времени, вывести приветствие вида:

// "Доброе утро, <Имя>!", если время от 05:00 до 11:59

// "Добрый день, <Имя>!", если время от 12:00 до 17:59;

// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;

// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

private static void task4() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите имя; ");
        String name = scr.nextLine();

        final Calendar calen = Calendar.getInstance();
        StringBuilder timeNow = (new StringBuilder().append(calen.get(Calendar.HOUR_OF_DAY))
                .append(":").append(calen.get(Calendar.MINUTE)).append(":")
                .append(calen.get(Calendar.SECOND)).append(" "));
        System.out.println(timeNow);
        int timeResult = (calen.get(Calendar.HOUR_OF_DAY));
        if (timeResult > 5 && timeResult < 12) {
            System.out.printf("Доброе утро, %s!", name);
        }
        if (timeResult > 12 && timeResult < 18) {
            System.out.printf("Добрый день, %s!", name);
        }
        if (timeResult > 18 && timeResult < 23) {
            System.out.printf("Добрый вечер, %s!", name);
        }
        if (timeResult > 0 && timeResult < 5) {
            System.out.printf("Доброй ночи, %s!", name);
        }
        if (timeResult == 24) {
            System.out.printf("Доброй ночи, %s!", name);
        }
        System.out.println();
    }