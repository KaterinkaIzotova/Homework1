/*
 * Создать двумерный  3х3 массив, заполнить его через scanner,
 * вывести на консоль введенный массив и удвоенный массив
 */
import java.util.Arrays;
import java.util.Scanner;
public class Task5 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int [][] twoArray = new int [3][3];

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.println("Введите число");
                twoArray[i][j] = scan.nextInt();
            }
        }

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {

                System.out.print(twoArray[i][j]);
            }
        }
    }
}
