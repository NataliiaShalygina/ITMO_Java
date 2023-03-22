package Lab03;

public class Main {
    public static void main(String[] args) {
        Study example = new Study("Изучение Java - это просто!");
        System.out.println(example.printCourse());

        Car toyota = new Car("Black", 800);
        Car reno = new Car("Brown", 1000);
        toyota.setName("Toyota Corolla");
        reno.setName("Reno Sandero");
        toyota.printCar();
        reno.printCar();

        House winterPalace = new House();
        winterPalace.setNameHouse("Зимний дворец");
        winterPalace.setNumber(3);
        winterPalace.setYear(1754);

        System.out.println(winterPalace.getNameHouse() + " " + winterPalace.getNumber() + " " + winterPalace.getYear() + " " + winterPalace.numberOfYear());

        House summerPalace = new House();
        summerPalace.setNameHouse("Летний дворец Петра I");
        summerPalace.setNumber(2);
        summerPalace.setYear(1703);

        System.out.println(summerPalace.getNameHouse() + " " + summerPalace.getNumber() + " " + summerPalace.getYear() + " " + summerPalace.numberOfYear());

        Tree boabPrisonTree = new Tree("Баобаб-тюрьма", 1500, true);
        Tree treeAnnaFrank = new Tree();
        Tree oldTjikko = new Tree("Старый Тикко", 9565);
    }
}

