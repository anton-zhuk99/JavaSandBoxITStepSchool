package com.company.examples.module2.ex007_enum;

public enum Season {
    WINTER("Зима"), // new Season("Зима")
    SPRING("Весна"),
    SUMMER("Лето"),
    FALL("Осень");

    private String russianName;

    Season(String name) {
        russianName = name;
    }

    public String getRussianName() {
        return russianName;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}// FIFO - First In First Out
// ЗАДАНИЕ
// Перечисление Colour.
// сделайте два поля:
// 1. имя цвета на русском
// 2. hex-код этого цвета
// добавьте контруктор, который инициализирует эти значеня.
// добавьте методы, которые возвращают эти значения.
// по желанию, переопределить toString()