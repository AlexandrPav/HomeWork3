import java.util.Scanner;

// Пользователь должен указать с клавиатуры чётное положительное число,
// а программа должна создать массив указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку.
// После этого программа должна определить и сообщить пользователю о том,
// сумма модулей какой половины массива больше: левой или правой, либо сообщить, что эти суммы модулей равны.
// Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода до тех пор,
// пока не будет указано корректное значение.
public class Zadanie210 {
    public static void main(String[] args) {
        int n = 0, s1 = 0, s2 = 0;
        int a;
        do {
            System.out.print("Введите число: ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0 && n % 2 == 0) {
                    int[] mas = new int[n];
                    for (int i = 0; i < mas.length; i++) {
                        mas[i] = (int) (Math.random() * 12 - 6);
                        System.out.print(mas[i] + " ");
                    }
                    a = mas.length / 2;
                    for (int i = 0; i < a; i++) {
                        s1 = s1 + Math.abs(mas[i]);
                    }
                    for (int i = a; i < mas.length; i++) {
                        s2 = s2 + Math.abs(mas[i]);
                    }
                    if (s1 < s2) {
                        System.out.print("Сумма модулей 1-ой половины больше ");
                    } else if (s1 > s2) {
                        System.out.print("Сумма модулей 2-ой половины больше ");
                    } else {
                        System.out.print("Сумма модулей равны ");
                    }
                }
            }
        } while (n <= 0 || n % 2 != 0);

    }
}
