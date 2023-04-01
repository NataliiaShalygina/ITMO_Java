package Lab06.Ex03;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(20, "Урал", 's', 100, 6, 33);
        truck.info(truck);
        truck.newWheels(8);
        truck.info(truck);
    }
}
