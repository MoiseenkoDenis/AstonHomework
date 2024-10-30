package ru.aston.homework.lesson_6;

public class Park {

    Attraction[] attractions;

    public Park(int numAttractions) {
        attractions = new Attraction[numAttractions];
    }

    public void addAttraction(String name, String workTime, int price) {
        for (int i = 0; i < attractions.length; i++) {
            if (attractions[i] == null) {
                attractions[i] = new Attraction(name, workTime, price);
                return;
            }
        }
        System.out.println("В парке нет свободных мест для аттракционов");
    }

    public void printAttractions() {
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                System.out.println("Название: " + attraction.name);
                System.out.println("Время работы: " + attraction.workTime);
                System.out.println("Стоимость: " + attraction.price);
                System.out.println("------------------");
            }
        }
    }


    public class Attraction {
        String name;
        String workTime;
        int price;

        public Attraction(String name, String workTime, int price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;
        }
    }
}
