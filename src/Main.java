public class Main{
    public static void main(String[] args){

        Car mycar = new Car("Red","Audi","Toyota",33);
        Airplane myairplane = new Airplane("Fly Emirates","Emmi",77,"White");

        mycar.displayDetails();
        myairplane.displayDetails();

        mycar.computeValue(30,1.5);
        myairplane.computeValue(100,0.8);

        System.out.println("Computed car Value");
        System.out.println("Computed airplane value");
    }
}