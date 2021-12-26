import java.util.ArrayList;
import java.util.Scanner;
public class lab5 {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите размерность массива:");
            while (!console.hasNextInt()) {
                System.out.println("Введите неотрицательное число.");
                console.next();
            }
            n = console.nextInt();
        } while (n <= 0);
        ArrayList<Integer> list = new ArrayList<>();
        int m;
        System.out.println("Введите элементы массива:");
        for (m = 0; m < n; m++) {
            while (!console.hasNextInt()) {
                System.out.println("Введите число!");
                console.next();
            }
            int a = console.nextInt();
            list.add(a);
        }
        System.out.println(list);
        System.out.println("Введите число Х:");
        while (!console.hasNextInt()) {
            System.out.println("Введите число!");
            console.next();
        }
        float x = console.nextInt();
        int i;
        for (i = 0; i < list.size(); i++) {
            if (list.get(i) == x) {
                list.remove(i);
                break;
            }
        }
        System.out.print("Новый массив — " +list);
    }
}
