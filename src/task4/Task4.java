package task4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 Создать программу, которая подсчитывает сколько раз употребляется
 слово в тексте (без учета регистра) . Текст и слово вводится вручную...
 */

public class Task4 {

        public static void main(String[] args) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = null, word = null;
            System.out.println("Введите текст");
            while (true) {

                try {
                    s = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println("Введите слово");

                try {
                    word = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                search(s, word);
            }
        }

        public static void search(String s, String word) {
            int n = 0;
            s.toLowerCase();
            word.toLowerCase();
            String[] words = s.split(" ");
            for (String var : words) {
                if (word.equals(var))
                    n  ++;
            }
            System.out.println("Слово " + word + " встречается в тексте " + n + " раз");
        }
    }


