package exemplo;
import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        //variaveis 
        int numero1;
        int numero2;
        int soma;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Programa Soma - Este programa calculará a soma entre dois números");
        
        System.out.println("Digite o primeiro valor!");
        
        numero1 = leitor.nextInt();
        
        System.out.println("Digite o segundo valor!");
        
        numero2 = leitor.nextInt();
        
        soma = numero1+numero2;
        
        System.out.println("A soma dos valores é = " + soma);
              
        
    }
    
}
