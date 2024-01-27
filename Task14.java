// 1. Дана строка sql-запроса "select * from students where ". Сформируйте часть 
// WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в 
// виде json-строки.

// Если значение null, то параметр не должен попадать в запрос.

// Пример 1:

// Параметры для фильтрации: {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"}

// Результат: SELECT * FROM USER WHERE **name = 'Ivanov' and country = 'Russia' and city = 'Moscow'**;

// Пример 2:

// Параметры для фильтрации: {"name:null", "country:null", "city:null", "age:null"}

// Результат: SELECT * FROM USER;


private static void task1() {

        String[] Students = {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"};
        System.out.println(Arrays.toString(Students));
        String[] name = Students[0].split(":");
        String[] country = Students[1].split(":");
        String[] city = Students[2].split(":");
        String[] age = Students[3].split(":");

        String propusk = "null";
        StringBuilder writeFile = new StringBuilder();
        if (!Objects.equals(name[1], propusk)) {
            writeFile.append(" " + Students[0]);}
        if (!Objects.equals(country[1], propusk)) {
            writeFile.append(" " + Students[1]);}
        if (!Objects.equals(city[1], propusk)) {
            writeFile.append(" " + Students[2]);}
        if (!Objects.equals(age[1], propusk)) {
            writeFile.append(" " + Students[3]);}
        System.out.println("SELECT * FROM USER " + writeFile);

    }