// ### **1. Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.**

// 1. Пусть дан список сотрудников:

// Иван Иванов

// Светлана Петрова

// Кристина Белова

// Анна Мусина

// Анна Крутова

// Иван Юрин

// Петр Лыков

// Павел Чернов

// Петр Чернышов

// Мария Федорова

// Марина Светлова

// Мария Савина

// Мария Рыкова

// Марина Лугова

// Анна Владимирова

// Иван Мечников

// Петр Петин

// Иван Ежов

// Создаем один джава класс с название ContactList


package homework555;
import java.util.Objects;

    public class ContactList {
        private String name;
        private String number;

        public ContactList(String name, String number) {
            this.name = name;
            this.number = number;
        }

        public String getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ContactList contact = (ContactList) o;
            return number == contact.number && Objects.equals(name, contact.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, number);
        }

        @Override
        public String toString() {
            return "Имя:" + name + ",номер телефона: " + number;
        }
    }


    // Создаем другой джава класс с название Main

    package homework555;

import java.util.List;
    public class Main {
        public static void main(String[] args) {
            PhoneBook phoneBook = new PhoneBook();

            addContact(phoneBook);
            phoneBook.showAllGroups();

            String name = String.valueOf(phoneBook.searchContact("Анна Крутова"));
            System.out.println(name);

        }

        public static void addContact(PhoneBook phoneBook) {
            phoneBook.addContactToGroup(new ContactList("Иван Иванов", "8918-011-80-94"), "Семья");
            phoneBook.addContactToGroup(new ContactList("Светлана Петрова", "8918-252-77-96"), "Семья");
            phoneBook.addContactToGroup(new ContactList("Кристина Белова", "8918-404-62-82"), "Друзья");
            phoneBook.addContactToGroup(new ContactList("Анна Мусина", "8918-271-74-23"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Анна Крутова", "8918-453-45-83"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Анна Крутова", "8918-354-15-15"), "Друзья");
            phoneBook.addContactToGroup(new ContactList("Иван Юрин", "8918-296-47-85"), "Друзья");
            phoneBook.addContactToGroup(new ContactList("Петр Лыков", "8918-678-10-26"), "Семья");
            phoneBook.addContactToGroup(new ContactList("Павел Чернов", "8918-709-28-20"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Петр Чернышов", "9918-753-27-92"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Мария Федорова", "8918-024-07-09"), "Друзья");
            phoneBook.addContactToGroup(new ContactList("Марина Светлова", "8918-831-41-27"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Мария Савина", "8918-155-41-47"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Мария Рыкова", "8918-307-08-58"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Марина Лугова", "8918-839-63-84"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Анна Владимирова", "8918-156-27-31"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Иван Мечников", "8918-156-27-31"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Петр Петин", "8918-873-01-82"), "Друзья");
            phoneBook.addContactToGroup(new ContactList("Иван Ежов", "8918-995-75-46"), "Семья");

        }

        public static void searchByGroup(PhoneBook phoneBook, String group) {
            List<ContactList> list = phoneBook.searchGroup(group);
            int i = 1;
            try {
                for (ContactList contact : list) {
                    System.out.println(i + "." + contact);
                    i++;
                }
            } catch (NullPointerException e) {
                System.out.println("Данной группы нет в списке");
            }
        }

    }


    // Создаем другой джава класс с название PhoneBook


    package homework555;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

    public class PhoneBook {
        private final Map<String, List<ContactList>> phoneBookMap = new HashMap<>();

        public void addNewGroup(String nameGroup) {
            if (!phoneBookMap.containsKey(nameGroup))
                phoneBookMap.put(nameGroup, new ArrayList<>());
        }

        public void addContactToGroup(ContactList contact, String group) {
            String[] strGroup = group.split(",");
            for (String s : strGroup) {
                addNewGroup(s);
                if (!phoneBookMap.get(s).contains(contact))
                    phoneBookMap.get(s).add(contact);
            }
        }

        public ContactList searchContact(String name) {
            System.out.println("\nПоиcк по Имени: " + name);
            StringBuilder sb = new StringBuilder();
            for (List<ContactList> contactList : phoneBookMap.values()) {
                for (ContactList contact : contactList) {
                    if (contact.getName().equals(name)) {
                        sb.append(contact);
                        return contact;
                    }
                }
            }
            System.out.println("Контакта нет в справочнике!");
            return null;
        }

        public List<ContactList> searchGroup(String group) {
            System.out.println("\nВсе контакты группы: " + group);
            return new ArrayList<>(phoneBookMap.get(group));
        }

        public void showAllGroups() {
            System.out.println("ТЕЛЕФОННЫЙ СПРАВОЧНИК по группам");
            for (Map.Entry<String, List<ContactList>> entryMap : phoneBookMap.entrySet()) {
                System.out.println("Группа: " + entryMap.getKey());
                showContacts(entryMap.getValue());
            }
        }

        public void showContacts(List<ContactList> contactList) {
            int i = 1;
            for (ContactList contact : contactList) {
                System.out.println(i + "." + contact);
                i++;
            }
            System.out.println();
        }


    }