package VocenoComando;
import javax.swing.JOptionPane;

public class Ex06 {
    public static void main(String[]args){
        double converte, milha, kilometro;
        kilometro = 1.609;
        
        milha = Double.parseDouble(JOptionPane.showInputDialog("Conversor de mi para km"+"\nDigite o valor em mi"));
        converte = milha * kilometro;
        JOptionPane.showMessageDialog(null,"O valor de mi para km: "+converte+" km");
    }
}
