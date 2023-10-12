/*
 ** Дано целое число N>0, найти сумму 1 + 1\2+1\3+…+1\N
 */
import java.util.Scanner;
public class Task3 {
    public static void main (String[] args) {
        Scanner scan = new Scanner( System.in);
        double sumX = 1;

        System.out.print("Введите число");
        int x = scan.nextInt();

        for (int i = 2; i <= x; i++) {
            sumX = sumX + 1.0/i;
        }
        System.out.println("Ответ:" + sumX);
    }
}
