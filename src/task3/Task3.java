package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.util.Arrays.sort;
/**
 Создать программу, которая будет подсчитывать количество слов в предложении
 и выводить их в отсортированном виде. Предложение вводится вручную.
 Разделители пробел (“ ”)...
 */

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while (true) {

            s = reader.readLine();

            compar(words(s));
        }
    }

    public static String[] words(String d) {
        int a = -1, k = 0;

        char[] array = d.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                k++;
            }
        }
        String word[] = new String[k];
        k = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == ' ') {
                word[k] = (d.substring(a + 1, j));
                a = j;
                k++;
            }
        }
        return word;
    }

    public static void compar(String[] word) {
        for (int i = 0; i < word.length; i++) {
            sort(word);
        }
        for (String s : word) {
            System.out.println(s);

        }
        System.out.println("Количество слов в предложении:" + word.length);
    }
}






