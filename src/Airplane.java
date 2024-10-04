public class Airplane extends Vehicle {
    String color;

    public Airplane(String name, String category, int Id, String color) {
        super(name,category,Id);
        this.color = color;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Id: " + Id);`
        System.out.println("Color: " + color);
    }
}
