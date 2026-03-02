import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("This program will convert a temperature in Celsius to Fahrenheit\n\nEnter the desired temperature in Celsius: ");

        double celsius = input.nextDouble();
        double fahrenheit = (celsius *1.8) + 32;

        System.out.println(String.format("The temperature in fahrenheit is equal to: %.2f", fahrenheit));

        input.close();
    }
}
