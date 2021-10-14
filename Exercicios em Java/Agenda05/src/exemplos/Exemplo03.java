package exemplos;
import javax.swing.JOptionPane;

public class Exemplo03 {
    public static void main(String[]args){
        String nome;
        
        nome = JOptionPane.showInputDialog("Entre com um nome");
        
        if (nome.equals("Jose")){
            JOptionPane.showMessageDialog(null,"O nome digitado é José");
        }else{
            JOptionPane.showMessageDialog(null, "O nome digitado foi "+ nome);
        }
    }
    
}
