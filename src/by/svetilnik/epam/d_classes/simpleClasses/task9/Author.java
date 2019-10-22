package by.svetilnik.epam.d_classes.simpleClasses.task9;

public class Author {
    private int id;
    private String name;
    private String surname;

    public Author(int id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
