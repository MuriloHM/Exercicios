package forum;
import javax.swing.JOptionPane;

public class Forum05 {
    public static void main(String[]args){
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior ou menor que 10"));
        
        if(numero < 10){
            JOptionPane.showMessageDialog(null, "O número digitado é menor que 10");
        }else{
            if(numero >= 10){
                JOptionPane.showMessageDialog(null,"O número digitado é maior ou igual a 10");
            }
        }
        if((numero % 2) == 0){
                JOptionPane.showMessageDialog(null,"Além disso é divisível por 2");
            }
        
    }
        
    
}
