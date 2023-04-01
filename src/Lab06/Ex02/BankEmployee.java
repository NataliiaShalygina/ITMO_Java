package Lab06.Ex02;

public class BankEmployee implements Human {
    private String firstName;
    private String lastName;
    private String bankName;

    public BankEmployee(String firstName, String lastName, String bankName) {
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
        System.out.println("Имя работника: " + firstName +
                '\n' + "Фамилия работника: " + lastName +
                '\n' + "Место работы (банк): " + bankName);
    }
}
