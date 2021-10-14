package VocenoComando;
import javax.swing.JOptionPane;

public class Ex05 {
    public static void main (String[]args){
        double moldavel;
        
        moldavel = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real"));
        JOptionPane.showMessageDialog(null, "Você digitou : "+ moldavel);
    }
}
