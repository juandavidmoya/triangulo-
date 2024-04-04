import java.util.Scanner;
 public class operaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor1, valor2, valor3, valor4, suma, resta, multiplicacion, division;

        System.out.println("Ingress el primer valor:");
        valor1 = scanner.nextDouble();
        System.out.println("Ingress el segundo valor:");
        valor2 = scanner.nextDouble();
        System.out.println("Ingress el terser valor:");
        valor3 = scanner.nextDouble();
        System.out.println("Ingress el quarto valor:");
        valor4 = scanner.nextDouble();
        System.out.println("Ingress el quinto valor:");

        suma = valor1 + valor2;
        resta =  valor3 - valor4;
        multiplicacion = valor1 * valor4;
        division = (valor4 / (valor1 ));

        System.out.println("La suma de los valor's es: " + suma);
        System.out.println("La rests de los valor's es: " + resta);
        System.out.println("El result-ado de la multiplication es: " + multiplicacion);
        System.out.println("El result-ado de la division es: " + division);
    }
}