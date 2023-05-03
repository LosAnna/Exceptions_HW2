/** Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */

package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import exceptions.Assist.ANSIConstants;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Task4 task4 = new Task4();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder text;
        System.out.print("Введите строку: ");
        text  = task4.inputText(reader);
        System.out.println(ANSIConstants.ANSI_GREEN + "Ввод принят: " + text.toString()
                + ANSIConstants.ANSI_RESET);
    }
    public StringBuilder inputText(BufferedReader r) throws IOException {
        StringBuilder s = new StringBuilder(r.readLine());
        if (s.length() == 0) {
            throw new IOException("Строка ввода не должна быть пустой!");
        }
        return s;
    }
}