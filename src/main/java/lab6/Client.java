package lab6;

public class Client extends Human implements InterfaceHuman {
    private String bankName;

    public String getBankName() {
        return bankName;
    }

    public Client(String first_name, String last_name, String bankName) {
        super(first_name, last_name);
        this.bankName = bankName;
    }

    public void printFromAbstract() {
        System.out.println("Вывод информации о клиенте с использованием абстрактного класса -> ");
        System.out.println("Имя клиента: " + getFirst_name());
        System.out.println("Фамилия клиента: " + getLast_name());
        System.out.println("Название банка: " + getBankName());
        System.out.println("------------------------------");
    }

    public void printFromInterface() {
        System.out.println("Вывод информации о клиенте с использованием интерфейса -> ");
        System.out.println("Имя клиента: " + getFirst_name());
        System.out.println("Фамилия клиента: " + getLast_name());
        System.out.println("Название банка: " + getBankName());
        System.out.println("------------------------------");
    }
}
