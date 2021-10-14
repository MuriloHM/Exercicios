package exemplo;
import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[]args){
        int numero1;

        int numero2;

        int resultado;

        Scanner leitor = new Scanner(System.in);


        System.out.println("__Programa de multiplicação__\n");

        System.out.println("Digite o primeiro número : \n");

        numero1 = leitor.nextInt();

        System.out.println("\nAgora digite o segundo número : \n");

        numero2 = leitor.nextInt();

        resultado = numero1 * numero2;

        System.out.println("\nO resultado da multiplicação é = " + resultado);
    }
}
