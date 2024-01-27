// 2. Задать одномерный массив и найти 
// в нем минимальный и максимальный элементы ;

private static void task2() {
        int[] arr = new int[]{1, 2, 1, 9, 11, 7, 81, 43, 1, 4};
        Arrays.sort(arr);
        System.out.println("минимальный элементы: " + arr[0]);
        System.out.println("максимальный элементы: " + arr[arr.length - 1]);

    }