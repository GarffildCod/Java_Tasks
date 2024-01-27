// 1. Написать метод, принимающий на вход два аргумента: 
// len и initialValue, и возвращающий 
// одномерный массив типа int длиной len, 
// каждая ячейка которого равна initialValue;


private static void task1() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int lenghtNum = inp.nextInt();
        int[] arr = new int[lenghtNum];
        for (int i = 0; i < lenghtNum; i++) {
            System.out.println("Введите элемент массива:");
            int initialValue = inp.nextInt();
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }