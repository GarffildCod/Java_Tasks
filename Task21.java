package Lesson05;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class Task01 {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        Map<String, String> employeeMap = new HashMap<>(20);
        employeeMap.put("1234", "Иванов");
        employeeMap.put("1434", "Петров");
        employeeMap.put("1454", "Романов");

//        создание(заполнение) словаря
//        Такой способ создание коллекции - создает не изменяемую колекцию
        Map<Integer, String> testMap = Map.of(
                12, "A",
                13, "B",
                14, "C"
        );

//        Второй способ
//        Этим методом мы можем добавлять более чем 10 элементов
        Map<Integer, Integer> testMap2 = Map.ofEntries(
                Map.entry(12, 23),
                Map.entry(1234, 2332),
                Map.entry(144, 2332),
                Map.entry(1224, 2232),
                Map.entry(164, 245332),
                Map.entry(1214, 23332),
                Map.entry(1624, 32),
                Map.entry(11, 232)
        );


//        Распечатка словаря


        for (Map.Entry<String, String> entry: employeeMap.entrySet()){
            System.out.printf( "%s\t->\t%s%n", entry.getKey(), entry.getValue());

        }


        for (String key : employeeMap.keySet()) {
            System.out.printf( "%s\t->\t%s%n", key, employeeMap.get(key));
        }

        employeeMap.forEach((key, value) -> {
            System.out.printf( "%s\t->\t%s%n", key, value);
        });

    }
}