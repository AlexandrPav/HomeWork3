// Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
// Определите какой элемент является в этом массиве максимальным и
// сообщите индекс его последнего вхождения в массив.
public class Zadanie27 {
    public static void main(String[] args) {
        int[] a = new int[12];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 31 - 16);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int max =a[0], index=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= max ) {
                max = a[i];
                index = i;
            }
        }
        System.out.println("Максимальный элемент массива " + max );
        System.out.println("Индекс его последнего вхождения в массив " + index);

    }
}
