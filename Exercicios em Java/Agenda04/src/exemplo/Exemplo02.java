
package exemplo;

public class Exemplo02 {
    public static void main(String [] args){
        int numero1 = 7;
        
        int numero2 = 3;

        int soma = 0;

        int multiplica = 2;
        
        int resultado = 0;

        System.out.println("Este programa calculará a soma de dois números para depois o multiplicá-lo por 2");

        System.out.println("O primeiro número é 7");

        System.out.println("O segundo número é 3");

        soma = (numero1+numero2)+numero2;
        
        System.out.println("O resultado de (x1 + x2)+x2 é " + soma);

        resultado = soma * multiplica;

        System.out.println("O resultado da multiplicação é " + resultado);
    }
}
