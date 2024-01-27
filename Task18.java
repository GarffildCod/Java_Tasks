// - Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.


package Lesson03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Task02_2 {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",
                "Neptune", "Uranus", "Pluto"};
        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
        }
//        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        for(int i = 0; i < list.size(); i++) {
            for(int j =i + 1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                }
            }
        }
        System.out.println(list);
    }
}






// предыдущ ЗАДАН


- Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
- Вывести название каждой планеты и количество его повторений в списке.

// public class Task02 {
//     public static void main(String[] args) {

//         String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",
//                 "Neptune", "Uranus", "Pluto"};
//         Random random = new Random();
//         List<String> list = new ArrayList<>();
//         for (int i = 0; i < 100; i++) {
//             list.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
//         }
//         System.out.println(list);
//         list.sort(Comparator.naturalOrder());
//         int count;
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < planetsNamesStringArray.length; i++) {
//             count = 0;
//             for (var item :
//                     list) {
//                 if (item.equals(planetsNamesStringArray[i]))
//                     count++;
//             }
//             sb.append(planetsNamesStringArray[i]).append(": ").append(count).append("\n");
//         }
//         System.out.println(sb);
//     }
// }