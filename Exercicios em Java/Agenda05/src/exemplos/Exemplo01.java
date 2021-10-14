package exemplos;
import javax.swing.JOptionPane;

public class Exemplo01 {
    public static void main(String[] args) {
        String auxiliar;
        int numeroInteiro;
        double numeroDouble;
        float numeroFloat;
        
        auxiliar = JOptionPane.showInputDialog("Entre com um número inteiro");
        
        //conversão do tipo string para inteiro – Integer.parseInt
        numeroInteiro = Integer.parseInt(auxiliar);
        numeroDouble = Double.parseDouble(auxiliar);
        numeroFloat = Float.parseFloat(auxiliar);
        
        JOptionPane.showMessageDialog(null,"O número inteiro é " + numeroInteiro);
        JOptionPane.showMessageDialog(null,"O número double é " + numeroDouble);
        JOptionPane.showMessageDialog(null,"O número float é " + numeroFloat);
        
        
    }
    
}
