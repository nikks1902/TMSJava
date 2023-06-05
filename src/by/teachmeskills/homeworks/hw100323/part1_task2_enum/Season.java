package by.teachmeskills.homeworks.hw100323.part1_task2_enum;

public enum Season {
    WINTER("ЗИМА") {
    },
    SPRING("ВЕСНА") {
    },
    SUMMER("ЛЕТО") {
    },
    AUTUMN("ОСЕНЬ") {
    };

    final String season;

    Season(String season) {
        this.season = season;
    }

    public String information() {
        return this == SUMMER ? "Школа №888, учащихся 666, сейчас мы отдыхаем" : "Школа №888, учащихся 666, сейчас мы учимся";
    }
}
