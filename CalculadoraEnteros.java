import java.util.Scanner;

public class CalculadoraEnteros {
    public static void main(String[] args) {
        Scanner AreaScanner = new Scanner(System.in);

        System.out.println("CALCULADORA CON NUMEROS ENTEROS");
        System.out.println("Ingresa el primer numero entero");
        int num1 = AreaScanner.nextInt();
        System.out.println("Ingresa el segundo numero entero");
        int num2 = AreaScanner.nextInt();

        // DECLARAR VARIABLES Y OPERACIONES
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int modulo = num1 % num2;

        // MOSTRAR RESULTADOS
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división es: " + division);
        System.out.println("El resultado del módulo es: " + modulo);

        AreaScanner.close();
    }
}