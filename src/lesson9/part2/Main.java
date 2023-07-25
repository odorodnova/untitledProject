package lesson9.part2;

interface Position {
    void printPosition();
}

class Director implements Position {
    @Override
    public void printPosition() {
        System.out.println("Директор");
    }
}

class Worker implements Position {
    @Override
    public void printPosition() {
        System.out.println("Рабочий");
    }
}

class Accountant implements Position {
    @Override
    public void printPosition() {
        System.out.println("Бухгалтер");
    }
}

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        director.printPosition();
        worker.printPosition();
        accountant.printPosition();
    }
}
