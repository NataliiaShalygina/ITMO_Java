package Lab06.Ex05;

public class Heir extends Parent {
    @Override
    public void AgeName() {
        System.out.println("Введите имя пользователя");
        System.out.println("Имя пользователя: " + Scaner());
    }
}
