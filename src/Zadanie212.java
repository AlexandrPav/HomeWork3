import java.util.Scanner;

// Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
// Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
// Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
// Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
public class Zadanie212 {
    public static void main(String[] args) {
        int a = 0, b = 0;
        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите число большее 3");
            if (scn.hasNextInt()) {
                a = scn.nextInt();
            } else System.out.println("Ошибка. Вы ввели не число!");
        }
        while (a < 4);
        int[] Mas1 = new int[a];
        for (int i = 0; i < Mas1.length; i++) {
            Mas1[i] = (int) (Math.random() * (a + 1));
            System.out.print(Mas1[i] + " ");
            if (Mas1[i] % 2 == 0 & Mas1[i] != 0) b++;
        }
        System.out.println(" ");
        if (b > 0) {
            int[] Mas2 = new int[b];
            for (int i = 0, c = 0; i < Mas1.length; i++) {
                if (Mas1[i] % 2 == 0 & Mas1[i] != 0) {
                    Mas2[c] = Mas1[i];
                    System.out.print(Mas2[c] + " ");
                }
            }
        }
    }
}
