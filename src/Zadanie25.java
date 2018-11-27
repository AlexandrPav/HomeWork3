// Создайте массив из 4 случайных целых чисел из отрезка [10;99],
// выведите его на экран в строку. Определить и вывести на экран сообщение о том,
// является ли массив строго возрастающей последовательностью.
public class Zadanie25 {
    public static void main(String[] args) {
        int[] a = new int[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 90 + 10);
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                System.out.println("Не возрастающая последовательность ");
                break;
            }
            if (i == a[i]) {
                System.out.println("Возрастающая последовательность ");
            }

        }
    }
}