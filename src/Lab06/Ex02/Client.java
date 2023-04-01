package Lab06.Ex02;

public class Client implements Human {
    private String firstName;
    private String lastName;
    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bankName = bankName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public void info() {
        System.out.println("Имя клиента: " + firstName +
                '\n' + "Фамилия клиента: " + lastName +
                '\n' + "Банк клиента: " + bankName);
    }
}
