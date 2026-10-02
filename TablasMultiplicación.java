import java.util.Scanner;
public class TablasMultiplicación {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- TABLAS DE MULTIPLICAR ---");
        
        System.out.println("Ingrese un numero para ver su tabla de multiplicar: ");
        int numero = scanner.nextInt();        

        System.out.println(" --- Tabla del "+ numero + " --- ");

        for(int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero+ " X " + i + " = " + resultado);
        }

        scanner.close();
    }
}
