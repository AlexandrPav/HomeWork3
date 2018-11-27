// Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
public class Zadanie26 {
    public static void main(String[] args) {
        int[] fibonachi = new int[20];
        for (int i = 0; i < fibonachi.length; i++) {
            if (i < 2) {
                fibonachi[i] = 1;
            } else {
                fibonachi[i] = fibonachi[i - 1] + fibonachi[i - 2];
            }
            System.out.print(fibonachi[i] + " ");
        }
    }
}
