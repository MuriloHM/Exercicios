package Exercicios;
import javax.swing.JOptionPane;


public class Ex02 {

    public static void main(String[] args) {
        int numero[] = new int[3];
        int contador;
        double soma = 0;
        double divide=0;
        String lista = "";
        
        for(contador = 0; contador < 3 ; contador++){
            numero[contador] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número da sorte de 0 a 38"
                    +"\nDigite o "+(contador+1)+"º número:"));
            
        //Verifica se o número digitado está correto
            if(numero[contador] < 0 || numero[contador] > 38){
                JOptionPane.showMessageDialog(null, "Número inválido");
                contador--;
            }
            //Verifica se é dívisível por 4
            if (numero[contador]%4 == 0){
                soma = soma + numero[contador];
                JOptionPane.showMessageDialog(null,"A soma é "+ soma);
            
            }else{
                JOptionPane.showMessageDialog(null,"Não é divisível ");
            }
            
        }
        for(contador = 0;contador<3;contador++){
            lista = lista+numero[contador]+"\n";
        }
        //Divide soma por 3
        divide = soma/3;
       
        JOptionPane.showMessageDialog(null, "Os números da sorte são: "+"\n"+lista+"\n\n"
                +"A soma dos valores divisíveis por 4 é: "+soma
                +"\n\nO resultado da soma dividido por 3 é: "+divide);
        
        if(soma > 25){
            JOptionPane.showMessageDialog(null, "Você ganhou o prêmio máximo!");
        }else if(soma >= 20 && soma <=25){
            JOptionPane.showMessageDialog(null, "Você ganhou o prêmio comum.");
        }else{
            JOptionPane.showMessageDialog(null, "Não recebeu prêmio algum.");
        }
        
        
        
}
}