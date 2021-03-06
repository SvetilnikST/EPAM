package by.svetilnik.epam.d_classes.aggregationAndComposition.task5;

public enum TypeFood {

    AllInclusive("Всё включено"),
    Breakfast("Завтрак"),
    Lunch("Обед"),
    Dinner("Ужин");

    private String title;

    TypeFood(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "TypeFood{" +
                "title='" + title + '\'' +
                '}';
    }
}
