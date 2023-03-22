package Lab03;

public class Car {
    private String color;
    private String name;
    private Integer weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {
    }

    ;

    public void printCar() {
        System.out.println(color + " " + name + " " + weight);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
