package VocenoComando;
import javax.swing.JOptionPane;

public class Ex04 {
    public static void main(String[]args){
        float soma;

        float subtrai;

        float multiplica;

        float divide;

        float resto;

        int seleciona; 

        float a;

        float b;
        
        seleciona = Integer.parseInt(JOptionPane.showInputDialog("Calculadora básica"
                +"\n1 - Soma"
                +"\n2 - Subtração"
                +"\n3 - Multiplicação"
                +"\n4 - Divisão"
                +"\n5 - Resto da divisão"));
        switch(seleciona){
            case 1 :
            {
                a = Float.parseFloat(JOptionPane.showInputDialog("Você escolheu Soma"+"\nDigite o primeiro número "));
                b = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número "));
                soma = a + b;
                JOptionPane.showMessageDialog(null, "O resultado da Soma é = "+ soma);
            }
                break;
            
            case 2:
            {
                a = Float.parseFloat(JOptionPane.showInputDialog("Você escolheu Subtração"+"\nDigite o primeiro número"));
                b = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número"));
                subtrai = a - b;
                JOptionPane.showMessageDialog(null, "O resultado da Subtração é = "+ subtrai);
            }
                break;
            case 3:
            {
                a = Float.parseFloat(JOptionPane.showInputDialog("Você escolheu Multiplicação"+"\nDigite o primeiro número"));
                b = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor"));
                multiplica = a * b ;
                JOptionPane.showMessageDialog(null, "O resultado da Multiplicação é ="+multiplica);
            }
                break;
            case 4: 
            {
                a = Float.parseFloat(JOptionPane.showInputDialog("Você escolheu Divisão"+"\nDigite o primeiro número"));
                b = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor"));
                divide = a / b ;
                JOptionPane.showMessageDialog(null, "O resultado da Divisão é ="+divide);
            }
                break;
            case 5:
            {
                a = Float.parseFloat(JOptionPane.showInputDialog("Você escolheu Resto"+"\nDigite o primeiro número"));
                b = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor"));
                resto = a % b ;
                JOptionPane.showMessageDialog(null, "O resultado do Resto da Divisão é ="+resto);
            }
                break;
        }
        
    }
}
