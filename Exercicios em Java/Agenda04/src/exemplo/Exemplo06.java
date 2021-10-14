package exemplo;
import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[]args){
        String nome;

        String sobrenome;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Programa para cadastro, informe seu nome! \n");
        nome = leitor.next();
        
        System.out.println("\nBom, agora me informe seu sobrenome, por favor! \n");
        sobrenome = leitor.next();
        
        System.out.println("\nSeja bem vindo(a) " + sobrenome +", "+ nome + " !");

    }
}
