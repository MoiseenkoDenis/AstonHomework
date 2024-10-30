package ru.aston.homework.lesson_6;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Моисеенко Денис Сергеевич", "QA", "mois.denis@mail.ru",
                "+375 25 777 88 99", 1400, 24);
        System.out.println("TASK 1:");
        System.out.println(person);

        System.out.println("\nTASK 2:");
        Person[] persons = new Person[5];
        persons[0] = new Person("Иванов Иван Иванович", "Инженер", "hahayix383@regishub.com",
                "+375 25 111 22 55", 900, 22);
        persons[1] = new Person("Петров Петр Петрович", "Техник-программист", "sopevas870@evasud.com",
                "+375 25 222 33 44", 2300, 24);
        persons[2] = new Person("Васильев Василий Васильевич", "Бизнес аналитик", "sopevas870@evasud.com",
                "+375 25 100 99 99", 1650, 21);
        persons[3] = new Person("Семенов Семен Семенович", "Продакт-менеджер", "sopevas870@evasud.com",
                "+375 25 321 43 54", 1800, 27);
        persons[4] = new Person("Пупкин Василий Юлианович", "Менеджер по продажам", "kavos60378@evasud.com",
                "+375 25 456 23 39", 1450, 28);
        System.out.println(persons[0]);
        System.out.println(persons[1]);
        System.out.println(persons[2]);
        System.out.println(persons[3]);
        System.out.println(persons[4]);

        System.out.println("\nTASK 3:");
        Park park = new Park(5);

        park.addAttraction("Карусель", "10:00 - 20:00", 100);
        park.addAttraction("Американские горки", "11:00 - 21:00", 200);
        park.addAttraction("Колесо обозрения", "12:00 - 22:00", 150);

        park.printAttractions();


    }
}
