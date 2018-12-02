// Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и
// третий массив из 10 действительных чисел.
// Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из
// первого массива с i-ым индексом к элементу из второго массива с i-ым индексом.
// Вывести все три массива на экран (каждый на отдельной строке),
// затем вывести количество целых элементов в третьем массиве.
public class Zadanie28 {


    public static void main(String[] args) {
        int[] Mas1 = new int[10];
        int[] Mas2 = new int[10];
        double[] Mas3 = new double[10];

        for (int i = 0; i < Mas1.length; i++) {
            Mas1[i] = (int) (Math.random() * 9) + 1;
            System.out.print(Mas1[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < Mas2.length; i++) {
            Mas2[i] = (int) (Math.random() * 9) + 1;
            System.out.print(Mas2[i] + " ");
        }

        System.out.println();

        Mas3[0] = (double) Mas1[0] / Mas2[0];
        Mas3[1] = (double) Mas1[1] / Mas2[1];
        Mas3[2] = (double) Mas1[2] / Mas2[2];
        Mas3[3] = (double) Mas1[3] / Mas2[3];
        Mas3[4] = (double) Mas1[4] / Mas2[4];
        Mas3[5] = (double) Mas1[5] / Mas2[5];
        Mas3[6] = (double) Mas1[6] / Mas2[6];
        Mas3[7] = (double) Mas1[7] / Mas2[7];
        Mas3[8] = (double) Mas1[8] / Mas2[8];
        Mas3[9] = (double) Mas1[9] / Mas2[9];
        System.out.print(Mas3[0] + "; " + Mas3[1] + "; " + Mas3[2] + "; " + Mas3[3] + "; " + Mas3[4] + "; " + Mas3[5] + "; " + Mas3[6] + "; " +
                Mas3[7] + "; " + Mas3[8] + "; " + Mas3[9]);
        System.out.println();
        System.out.print("Четные элементы: ");
        if (Mas1[0] % Mas2[0] == 0) {
            System.out.print("1 ");
        }
        if (Mas1[1] % Mas2[1] == 0) {
            System.out.print("2 ");
        }
        if (Mas1[2] % Mas2[2] == 0) {
            System.out.print("3 ");
        }
        if (Mas1[3] % Mas2[3] == 0) {
            System.out.print("4 ");
        }
        if (Mas1[4] % Mas2[4] == 0) {
            System.out.print("5 ");
        }
        if (Mas1[5] % Mas2[5] == 0) {
            System.out.print("6 ");
        }
        if (Mas1[6] % Mas2[6] == 0) {
            System.out.print("7 ");
        }
        if (Mas1[7] % Mas2[7] == 0) {
            System.out.print("8 ");
        }
        if (Mas1[8] % Mas2[8] == 0) {
            System.out.print("9 ");
        }
        if (Mas1[9] % Mas2[9] == 0) {
            System.out.print("10 ");
            System.out.println(" ");
        }


    }


}






