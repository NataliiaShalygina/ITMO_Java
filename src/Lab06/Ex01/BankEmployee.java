package Lab06.Ex01;

public class BankEmployee extends Human {
    private String bankName;

    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void info() {
        System.out.println("Имя работника: " + firstName +
                '\n' + "Фамилия работника: " + lastName +
                '\n' + "Место работы (банк): " + bankName);
    }

}
