import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Программа рассчета суммы трех чисел");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int value1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int value2 = scanner.nextInt();
        System.out.println("Введите третье число");
        int value3 = scanner.nextInt();
        System.out.println("Сумма чисел " + (value1 + value2 + value3));
    }
}