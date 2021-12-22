import java.util.Scanner;

//Написать программу, выполняющую «сглаживание» вещественного массива A размерности N
//следующим образом: элемент AK заменяется на среднее арифметическое первых K исходных
//элементов массива A. На экран должны выводиться как оригинальное состояние массива, так и итоговое.
public class lab5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = input.nextInt();
        float[] AnOrigArray = new float[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            AnOrigArray[i] = input.nextFloat();
        }
        System.out.println("Введите номер А: ");
        float ArrayCopy[] = new float[AnOrigArray.length];
        for (int i = 0; i < AnOrigArray.length; i++) {
            ArrayCopy[i] = AnOrigArray[i];
        }
        int numberA = input.nextInt();
        int sum = 0;
        for (int i = 0; i < numberA; i++) {
            sum += AnOrigArray[i];
            AnOrigArray[numberA] = sum / (i+1);
        }
        for (int i = 0; i < ArrayCopy.length; i++) {
            System.out.print(ArrayCopy[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < AnOrigArray.length; i++) {
            System.out.print(AnOrigArray[i] + " ");

        }
        System.out.println();
    }
}

