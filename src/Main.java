import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

//Задача из экзаменационного билета №6

//Необходимо реализовать следующий метод:
//1. Получаем на входе массив чисел.
//2. Все четные числа увеличиваем на единицу.
//3. Возвращаем кусок списка с 3-го по 7-й элемент.

        int[] arrayOfRandomNumbers = generateRandomArray();
        System.out.println(Arrays.toString(arrayOfRandomNumbers));
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            changeEvenToOdd(arrayOfRandomNumbers);
        }
        printFragment(arrayOfRandomNumbers);

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[13];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        return arr;
    }

    public static void changeEvenToOdd(int[] arrayOfRandomNumbers) {
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            if (arrayOfRandomNumbers[i] % 2 == 0) {
                arrayOfRandomNumbers[i] = arrayOfRandomNumbers[i] + 1;
            } else {
                arrayOfRandomNumbers[i] = arrayOfRandomNumbers[i];
            }
        }
    }

    public static void printFragment(int[] arrayOfRandomNumbers) {
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            if (i >= 2 && i <= 6) {
                System.out.print(arrayOfRandomNumbers[i] + ", ");
            }
        }
    }

}

