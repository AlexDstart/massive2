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

        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(" Минимальная сумма трат за месяц составила " + min+" рублей "+ "  " +
                " Максимальная сумма затрат за месяц составила " + max+" рублей ");
        //task3
        int medium=0;
        for (int i = 0; i < arr.length; i++) {
            medium+=arr[i]/ arr.length;
        }
        System.out.println(" Средняя сумма составила " + medium+ " рублей ");
    }
}
