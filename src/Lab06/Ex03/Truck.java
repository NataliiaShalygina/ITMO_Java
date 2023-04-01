package Lab06.Ex03;

public class Truck extends Car {
    int numberWheels;
    int maxWeight;

    public void newWheels(int n) {
        this.numberWheels = n;
        System.out.println("Новое значение равно: " + numberWheels);
    }

    public Truck(int w, String m, char c, float s, int nW, int mW) {
        super(w, m, c, s);
        this.numberWheels = nW;
        this.maxWeight = mW;
    }

    public void info(Truck truck) {
        truck.outPut();
        System.out.println("Число колёс автомобиля: " + numberWheels);
        System.out.println("Максимальный вес: " + maxWeight);
    }
}

