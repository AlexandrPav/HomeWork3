// Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
// отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
public class Zadanie213 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) a++;
        }
        int[] Mas = new int[a];
        for (int i = 2, b = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                Mas[b] = i;
                System.out.print(Mas[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for (int i = 0; i < Mas.length; i++) {
            System.out.println(Mas[i]);
        }
    }
}
