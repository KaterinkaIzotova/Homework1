/*
 *Даны координаты точки X и Y, определить номер координатной четверти,
 * в которой находится точка
 */
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число х:");
        int x = scan.nextInt();

        System.out.print("Введите число у:");
        int y = scan.nextInt();

        if ((x > 0) && (x <= 3)) {
            if ((y > 0) && (y <= 3)) {
                System.out.print("Точка находится в 1 четверти.");
            }
            else if ((y < 0) && (y >= -3)) {
                System.out.print("Точка находится в 4 четверти.");
            }
        }
        else if ((x < 0) && (x >= -3)) {
            if ((y > 0) && (y <= 3)) {
                System.out.print("Точка находится во 2 четверти.");
            }
            else if ((y < 0) && (y >= -3)) {
                System.out.print("Точка находится в 3 четверти.");
            }
        }
    }
}