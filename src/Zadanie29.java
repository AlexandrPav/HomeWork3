// Создайте массив из 11 случайных целых чисел из отрезка [-1;1],
// выведите массив на экран в строку. Определите какой элемент встречается
// в массиве чаще всего и выведите об этом сообщение на экран.
// Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
public class Zadanie29 {
    public static void main(String[] args) {
        int[] Mas1 = new int[11];
//        int a = 0;
//        int b = 0;
//        int c = 0;
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < Mas1.length; i++) {
            Mas1[i] = (int) (Math.random() * 4 - 2);
            System.out.print(Mas1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < Mas1.length; i++) {
            if (Mas1[i] == -1) {
                a++;
            } else if (Mas1[i] == 0) {
                b++;
            } else {
                c++;
            }

        }
        System.out.println();
        if (a > b && a > c) {
            System.out.println("Больше всего чисел -1, количество: " + a);
        } else if (b > a && b > c) {
            System.out.println("Больше всего чисел 0, количество: " + b);
        } else
            System.out.println("Больше всего чисел 1, количество: " + c);
    }
}
