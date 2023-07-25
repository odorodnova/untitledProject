package lessons6_7_8;

public class Phone {
    final private String number;
    final private String model;
    final private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    public Phone() {
        this("someNumber", "someModel");
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + " с номера " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.print("Отправить сообщение на номера: ");
        for (String number : phoneNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("4815162342", "Some Samsung", 0.282);
        Phone phone2 = new Phone("88005553535", "iPhone 666");
        Phone phone3 = new Phone();

        System.out.println("Phone 1 - Number: " + phone1.getNumber() + ", Model: " + phone1.model + ", Weight: " + phone1.weight);
        System.out.println("Phone 2 - Number: " + phone2.getNumber() + ", Model: " + phone2.model + ", Weight: " + phone2.weight);
        System.out.println("Phone 3 - Number: " + phone3.getNumber() + ", Model: " + phone3.model + ", Weight: " + phone3.weight);

        phone1.receiveCall("Pakhom");
        phone2.receiveCall("Bratishka");
        phone3.receiveCall("Mychalkin", "666-8814");

        phone1.sendMessage("123-123-123", "666-666-666");
        phone2.sendMessage("888-888-888");
        phone3.sendMessage("000-000-000", "333-333-333", "555-555-555");
    }
}
