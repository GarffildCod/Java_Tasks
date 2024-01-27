// **2. Каталог товаров книжного магазина сохранен в виде 
// двумерного списка List<ArrayList<String>> так, что на 0й 
// позиции каждого внутреннего списка содержится название жанра, 
// а на остальных позициях - названия книг. Напишите метод для 
// заполнения данной структуры(можно через консоль).**

// Пример:

// "Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".

// "Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".

// "Детектив", "Десять негритят".

// "Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал".


private static void task2() {

        Scanner iScanner = new Scanner(System.in);
        List<ArrayList<String>> bookList = new ArrayList<>();
        int Cool = 1;

        for (int i = 0; i < Cool; i++) {
            System.out.println("Введите Жанр книги: ");
            String inputGenre = iScanner.nextLine();
            ArrayList<String> bookGenre = new ArrayList<>();
            bookGenre.add(inputGenre);

            System.out.println("Введите количество книг в жанре: ");
            int bookinput = Integer.parseInt(iScanner.nextLine());

            for (int j = 0; j < bookinput; j++) {
                System.out.println("Введите название книги: ");
                String booktitle = iScanner.nextLine();
                bookGenre.add(booktitle);
            }
            bookList.add(bookGenre);
        }
        bookList.forEach(System.out::println);
    }