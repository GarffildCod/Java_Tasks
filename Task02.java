// ### Задание 3

// Дан массив nums = [3,2,2,3] и число val = 3.

// Если в массиве есть числа, равные заданному, 
// нужно перенести эти элементы в конец массива.

// Таким образом, первые несколько (или все) элементов массива 
// должны быть отличны от заданного, а остальные - равны ему.

private static void ex3() {
        int[] nums = new int[]{3, 2, 3, 2, 3};
        int val = 3;
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == val)
                for (int j = 0; j < nums.length - 1; j++) {
                    if (nums[j] == val) {
                        temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }

        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }