package VocenoComando;
import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[]args){
        int [] numero = new int[5];
        int contador;
        String lista ="";
                
        for(contador = 0; contador < 5; contador++){
            numero[contador]=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        }
        for(contador = 4 ; contador >= 0 ; contador--){
            lista = lista + numero[contador]+"\n";
        }
        
            JOptionPane.showMessageDialog(null, "Os números digitados foram: "+ "\n"+lista);
        
    }
    
}
