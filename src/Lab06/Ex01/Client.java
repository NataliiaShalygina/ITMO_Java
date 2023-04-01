package Lab06.Ex01;

public class Client extends Human {
    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void info() {
        System.out.println("Имя клиента: " + firstName +
                '\n' + "Фамилия клиента: " + lastName +
                '\n' + "Банк клиента: " + bankName);
    }
}
