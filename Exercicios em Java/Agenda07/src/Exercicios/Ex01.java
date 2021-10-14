package Exercicios;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[]args){
        String produto;
        double valor;
        double desconto;
        
        Scanner leia = new Scanner(System.in);
       System.out.println("Padaria de Joaquim" +
               "\nO aniversário é nosso, mas quem ganha é você!");
       
       for(int quantidade = 1; quantidade <=10; quantidade++){
           System.out.println("\n-----+-----+-----+-----+-----+");
           System.out.print("Produto = "+ quantidade + "º");
           
           System.out.print("\nDigite o nome do produto = ");
           produto = leia.next();                   
                                 
           System.out.print("Digite o valor do produto = ");
           valor = leia.nextDouble();
           
           desconto = valor * 0.5;
           System.out.println("\nO produto "+ produto +
                   " recebeu desconto e ficou R$ " + desconto);
       }
    }
}
