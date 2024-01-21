import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Сколько градусов по Цельсию сейчас здесь?");

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        int celsius = scanner.nextInt();  // Read user input
        System.out.println("Температура по Цельсию: " + celsius);  // Output user input

        double result = (celsius * 9.0/5) + 32;
        System.out.println("Температура по Фаренгейту = " + result);



    }
}
