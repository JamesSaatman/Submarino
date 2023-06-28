import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();

        double kelvin = celsius + 273;
        double fahrenheit = (9.0 / 5.0 * celsius) + 32;

        System.out.println("Temperatura em Kelvin: " + kelvin);
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }
}
