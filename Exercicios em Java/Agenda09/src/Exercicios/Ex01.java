package Exercicios;
import javax.swing.JOptionPane;


public class Ex01 {

    public static void main(String[] args) {
        int numero[] = new int[3];
        int contador,soma = 0;
        String lista = "";
        
        for(contador = 0; contador<3 ; contador++){
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
        
        JOptionPane.showMessageDialog(null, "Os números da sorte são:"+"\n"+lista+"\n\n"
                +"A soma dos valores divisíveis por 4 é: "+soma);
        
        
}
}