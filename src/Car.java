public class Car extends Vehicle{
    String color;

    public Car(String color, String name, String category, int Id){
        super(name,category,Id);
        this.color = color;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Id: " + Id);
        System.out.println("Color: " + color);
    }

}
