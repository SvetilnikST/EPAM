package by.svetilnik.epam.d_classes.aggregationAndComposition.task5.enums;

public enum TypeFood {

    AllInclusive("Всё включено"),
    Breakfast("Завтрак"),
    Lunch("Обед"),
    Dinner("Ужин");

    private String title;

    TypeFood(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "TypeFood{" +
                "title='" + title + '\'' +
                '}';
    }
}
