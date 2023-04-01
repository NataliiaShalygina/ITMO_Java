package Lab06.Ex01;

public class Main {
    public static void main(String[] args) {
        Human egorM = new Client("Егор", "Муркин", "ВБРР");
        Human annaS = new BankEmployee("Анна", "Шмель", "Сбербанк");
        info(egorM);
        info(annaS);
        egorM.info();
    }

    public static void info(Human ob) {
        ob.info();
    }
}



