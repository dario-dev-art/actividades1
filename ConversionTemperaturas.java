
import java.util.Scanner; 

public class ConversionTemperaturas {
public static void main(String [] args) {

    Scanner scanner = new Scanner(System.in);


    System.out.println("Ingrese la temperatura en grados Celsius: ");
    double celsius = scanner.nextDouble();
    double fahrenheit = (celsius * 9/5) + 32;
    System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);



    System.out.println("Ingrese la temperatura en grados Fahrenheit: ");
    fahrenheit = scanner.nextDouble();
    celsius = (fahrenheit - 32) * 5/9;
    System.out.println("La temperatura en grados Celsius es: " + celsius);

}
}