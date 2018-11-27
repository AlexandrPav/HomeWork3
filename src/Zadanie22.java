//Создайте массив из 15 случайных целых чисел из отрезка [0;9].
// Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и
// выведете это количество на экран на отдельной строке.
public class Zadanie22 {
    public static void main(String[] args) {
        int[] a = new int[15];
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
            if (a[i] % 2 == 0) {
                b++;
            }
            System.out.println(a[i]);

        }
        System.out.println("Четных чисел: " + b);
    }
}
