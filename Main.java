/*O1=(+)
O2=(-)
i j = char
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть а:");
        int a = scanner.nextInt();
        System.out.println("Введіть b:");
        int b = scanner.nextInt();
        System.out.println("Введіть n:");
        int n = scanner.nextInt();
        System.out.println("Введіть m:");
        int m = scanner.nextInt();
        float c = 1614 % 3;
        float sum = 0;
        if (a <= c && n >= c) {
            System.out.println("Помилка!");
        } else if (a > n || b > m) {
            System.out.println("a та b не повинні привищувати n та m відповідно!");
        }else if(a>65536 || b>65536){
            System.out.println("Число не в діапазоні!");
        } else {
            for (char i = (char) a; i <= n; i++) {
                for (char j = (char) b; j <= m; j++) {
                    sum += (i - j) / (i + c);
                }
            }
            System.out.println("Результат:"+sum);
        }

    }
}

