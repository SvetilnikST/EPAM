package by.svetilnik.epam.d_classes.aggregationAndComposition.task5.enums;

public enum TypeVoucher {
    Relaxation("Отдых"),
    Excursion("Экскурсия"),
    Shopping("Шоппинг"),
    Therapy("Лечение");

    private String title;

    TypeVoucher(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "TypeVoucher{" +
                "title='" + title + '\'' +
                '}';
    }
}
