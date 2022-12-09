import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[30];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100_000) + 100_000;
        }

        //сумма трат за месяц
        int maxPay = 0;
        for (int i = 0; i < arr.length; i++) {
            maxPay += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + maxPay + " рублей");

        //task2
    }
}
