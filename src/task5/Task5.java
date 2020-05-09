package task5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 Написать программу, которая в последовательности от 0 до N, находит все числа-палиндромы
 (зеркальное значение равно оригинальному)..
 Длина последовательности вводится вручную и не должна превышать 100.
 */
public class Task5 {

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a ;
                a = Integer.parseInt(reader.readLine());

           System.out.println("В последовательности от 0 до " + a + " палиндромы:");
            if (a < 10) {
                for (int i = 0; i <= a; i++) {
                    System.out.print(i + ",");
                }
            } else {
                System.out.print("0,1,2,3,4,5,6,7,8,9,");
                for (int i = 10; i < a; i++) {
                    if ((i % 10) ==  (i / 10)) {
                        System.out.print(i + ",");
                    }
                }
            }
        }
    }


