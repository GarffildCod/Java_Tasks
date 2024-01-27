// Напишите метод, который вернет содержимое текущей папки в виде массива строк. 

// Напишите метод, который запишет массив, возвращенный 
// предыдущим методом в файл. 

// Обработайте ошибки с помощью try-catch конструкции. 
// В случае возникновения исключения, оно должно записаться в лог-файл.


public class Task05 {
    public static void main(String[] args) {
        String pathDir = "/Users/anna/User/Programmer/java/JavaDzOop/JavaLessonGb";
        File file = new File(pathDir);
        if (!(file.exists() || file.isDirectory())){
            return;
        }

        StringBuilder st = new StringBuilder();
        for(String fileName : file.list()){
            st.append(fileName).append(System.lineSeparator());
        }

        System.out.println(st);

    }
}