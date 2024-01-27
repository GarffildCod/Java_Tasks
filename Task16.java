// Заполните список 10 случайными числами

// Отсортировать список методом sort() и вывести его на экран


public class Task01 {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            list.add(random.nextInt(100));
        }

//        Collections.sort(list, Comparator.reverseOrder());
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

    }
}