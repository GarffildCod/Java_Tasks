// 4. Создать квадратный двумерный целочисленный массив 
// (количество строк и столбцов одинаковое), 
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами 
// (можно только одну из диагоналей, если обе сложно). Определить элементы 
// одной из диагоналей можно по следующему принципу: 
// индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

private static void task3() {
    Scanner inp = new Scanner(System.in);
    Random rndt = new Random();
    System.out.println("Введите размер массива");
    int num = inp.nextInt();
    int[][] arr = new int[num][num];
    for(int i = 0; i < num; i++){
        for(int j = 0; j < i; j++){
            arr[i][j] = rndt.nextInt(10) + 1;
        }
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.println(Arrays.toString(arr[i]));
    }
    for (int i = 0; i < num; i++) {
        arr[i][i] = 1;
    }
    System.out.println("");
    for(int i = 0; i < arr.length; i++){
        System.out.println(Arrays.toString(arr[i]));
    }
    }