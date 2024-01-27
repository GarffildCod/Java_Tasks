// **1. Создать список типа ArrayList<String>. 
// Поместить в него как строки, так и целые числа. Пройти по списку, 
// найти и удалить целые числа.**

// Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}


private static void task1() {

        ArrayList<String> differentThingsArr = new ArrayList<>(Arrays.asList("Яблоко", "11", "13", "Апельсин", "Дыня", "17"));
        System.out.println(differentThingsArr);
        ArrayList<String> orderlyArr = new ArrayList<>();

        for (int i = 0; i < differentThingsArr.size(); i++) {
            String lengthElem = differentThingsArr.get(i);
            try {
                Integer.parseInt(lengthElem);
                orderlyArr.add(lengthElem);
            }
            catch (Exception r) {
            }
        }
        differentThingsArr.removeAll(orderlyArr);
        System.out.println(differentThingsArr);
    }