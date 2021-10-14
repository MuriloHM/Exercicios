package exemplo;

public class Exemplo04 {
    public static void main (String []args){
        int numero1;

        int numero2;

        int numero3;

        int multiplica;

        int divide;

        numero1 = 7;

        numero2 = 4;

        numero3 = 2;

        System.out.println("Este programa servirá para multiplicar o resto da "+ "divisão  entre " 
                + numero1 + " e " + numero2 + " por " + numero3 + "\n");

        divide = numero1 % numero2;
        
        System.out.println("O resultado da divisão = "+divide+"\n");
        
        multiplica = divide * numero3;

        System.out.println("Resultado da multiplicação = " + multiplica);
       
    }
}
