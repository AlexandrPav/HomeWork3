// Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
// выведите массивы на экран в двух отдельных строках.
// Посчитайте среднее арифметическое элементов каждого массива и сообщите,
// для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
public class Zadani24 {
    public static void main(String[] args) {
        double sumA = 0, sumB = 0;
        int[] a = new int[5];
        int[] b = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 6);
            System.out.print(a[i] + " ");
            sumA += (double)a[i] / a.length;

        }
        System.out.print("\n");
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 6);
            System.out.print(b[i] + " ");
            sumB += (double)b[i] / b.length;
        }
        System.out.println();
        System.out.println("Cреднее арифметическое массива А: " + sumA + " ");
        System.out.println("Cреднее арифметическое массива B: " + sumB + " ");

        if (sumA == sumB) {
            System.out.println("Массивы равны ");
        } else if (sumA > sumB) {
            System.out.println("Массив А больше массива В ");
        } else {
            System.out.println("Массив B больше массива A ");
        }
    }
}
