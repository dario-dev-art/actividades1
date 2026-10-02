import java.util.Scanner;
public class CalcularFactorial {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("INGRESA UN NÚMERO PARA CALCULAR SU FACTORIAL: ");
        
        int numero = scanner.nextInt();

            long factorial = 1;
            int i = 1;

            while (i <= numero) {
                factorial = factorial * i;
                i++;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

    }
