package by.svetilnik.epam.d_classes.simpleClasses.task9;

public class Binding {
    private int id;
    private String name;

    public Binding(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

   public void setName(String name){
        this.name = name;
   }

   public int getId(){
        return id;
   }

   public String getName(){
        return name;
   }

    @Override
    public String toString() {
        return "Binding{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
