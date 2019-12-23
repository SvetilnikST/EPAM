package by.svetilnik.epam.e_BasicsOfOOP.task3;

public enum Month {
    January("Январь", 31),
    February("Февраль", 28),
    Marth("Март", 31),
    April("Апрель", 30),
    May("Май", 31),
    June("Июнь", 30),
    July("Июль", 31),
    August("Август", 31),
    September("Сентябрь", 30),
    October("Октябрь", 31),
    November("Ноябрь", 30),
    December("Декабрь", 31);

    private String name;
    private int countDays;

    Month(String name, int countDays) {
        this.name = name;
        this.countDays = countDays;
    }

    public String getName() {
        return name;
    }

    public int getCountDays() {
        return countDays;
    }

    @Override
    public String toString() {
        return "NameMouth{" +
                "name='" + name + '\'' +
                '}';
    }

}
