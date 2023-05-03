/**  Если необходимо, исправьте данный код. */

package exceptions;

public class Task2 {
    /** В код добавлена обработка исключения в случае выхода за пределы массива. */
    public static void main(String[] args) {
        try {
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int d = 0;
            double catchedRes1 = intArray[10] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль запрещено!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Введенный индекс находится за пределами длины массива!");
        }
    }
}