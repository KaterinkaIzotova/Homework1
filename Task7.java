/*
 * Распечатать все числа от 1 до 100, которые делятся на 5 без остатка.
 * Используем цикл do-while
 */
public class Task7 {
    public static void main (String[] args) {
        int counter = 1;
        do {
            if (counter % 5 == 0) {
                System.out.println(counter);
            }
            counter++;
        }
            while (counter <= 100) ;
    }
}
