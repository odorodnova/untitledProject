package lesson2.cycles;

public class CycleFive {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(num);
            num -= 5;
        }
    }
}
