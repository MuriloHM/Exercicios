package exemplo;
import java.util.Scanner;
public class Exemplo08 {
    public static void main(String[]args){
        float real;
        float dolar;
        float convert;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Olá, por favor escreva a quantidade em reais que possui para conversão: ");
        real = leitor.nextFloat();
        System.out.println("Você possui então R$"+real);
        System.out.println("Por favor, quanto está o dólar?");
        dolar = leitor.nextFloat();
        System.out.println("O dólar está R$"+dolar+"\n");
        convert = (real / dolar); 
        System.out.println("Resultado da conversão de reais para dólar, US$" +convert);

    }
}
