/*
 *	Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while.
 */
public class Task6 {
    public static void main (String[] args) {
        int counter = 1;
        while (counter < 11) {
            System.out.println("Task"+counter);
            counter++;
        }
    }
}
