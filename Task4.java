/*
 ** Реализовать консольную игру по типу “Кто хочет стать миллионером?”.
 * С помощью конструкций ветвлений switch\case или if\else. (3-5 вопросов, в каждом 4 варианта ответа)
 */
import java.util.Scanner;
public class Task4 {
    public static void main(String[] argx) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Сколько месяцев в году? ");
        System.out.println("Варианты ответа:  1  4  7  12");
        System.out.println("Введите ответ:");

        int x = scan.nextInt();
        switch (x) {
            case 1:
                System.out.println("Неверный ответ. Вы проиграли");
                break;
            case 4:
                System.out.println("Неверный ответ. Вы проиграли");
                break;
            case 7:
                System.out.println("Неверный ответ. Вы проиграли");
                break;
            case 12:
                System.out.println("Следующий вопрос");
                System.out.println("Сколько дней в неделе?");
                System.out.println("Варианты ответа:  1  2  10  7");
                System.out.println("Введите ответ:");

                int t = scan.nextInt();
                switch (t) {
                    case 1:
                        System.out.println("Неверный ответ. Вы проиграли");
                        break;
                    case 2:
                        System.out.println("Неверный ответ. Вы проиграли");
                        break;
                    case 10:
                        System.out.println("Неверный ответ. Вы проиграли");
                        break;
                    case 7:
                        System.out.println("Следующий вопрос");
                        System.out.println("Какого цвета трава?");
                        System.out.println("Варианты ответа:  белая  зеленая  фиолетовая  черная");
                        System.out.println("Введите ответ");

                        String y = scan.next();
                        if (y.equals("белая")) {
                            System.out.println("Неверный ответ. Вы проиграли");
                            break;
                        }
                        else if (y.equals("фиолетовая")) {
                            System.out.println("Неверный ответ. Вы проиграли");
                            break;
                        }
                        else if (y.equals("черная")) {
                            System.out.println("Неверный ответ. Вы проиграли");
                            break;
                        }
                        else if (y.equals("зеленая")) {
                            System.out.println("Следующий вопрос");
                            System.out.println("Что зимой и летом одним цветом?");
                            System.out.println("Варианты ответа:  ёлка  пальма роза берёза");
                            System.out.println("Введите ответ");

                            String z = scan.next();
                            if (z.equals("пальма")) {
                                System.out.println("Неверный ответ. Вы проиграли");
                                break;
                            }
                            else if (z.equals("берёза")) {
                                System.out.println("Неверный ответ. Вы проиграли");
                                break;
                            }
                            else if (z.equals("роза")) {
                                System.out.println("Неверный ответ. Вы проиграли");
                                break;
                            }
                            else if (z.equals("ёлка")) {
                                System.out.println("Верный ответ. Вы победили");
                            }
                        }
                }

        }

    }
}
