/*
 * Создать двумерный  3х3 массив, заполнить его через scanner,
 * вывести на консоль введенный массив и удвоенный массив
 */
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
        String str = "";
        String str2 = "";
        for (int i=0; i<3; i++) {
            String tmp = "";
            String tmp2 = "";
            for (int j=0; j<3; j++) {
                tmp = tmp + " " + twoArray[i][j];
                tmp2 = tmp2 + " " + twoArray[i][j]*2;
            }
            str = str + "\n" + tmp;
            str2 = str2 + "\n" + tmp2;
        }
        System.out.println(str);
        System.out.println(str2);
    }
}
