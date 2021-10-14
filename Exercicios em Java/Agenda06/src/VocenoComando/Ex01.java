package VocenoComando;
import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[]args){
        int opcao;
                
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Entre com o código do produto"));
              
        switch (opcao){
        case 100:
            JOptionPane.showMessageDialog(null, "Lápis preto nº2");
            break;
        case 150:
            JOptionPane.showMessageDialog(null,"Borracha branca");
            break;
        case 200:
            JOptionPane.showMessageDialog(null,"Caneta azul");
            break;
        case 230:
            JOptionPane.showMessageDialog(null,"Caneta vermelha");
            break;
        case 256:
            JOptionPane.showMessageDialog(null,"Giz de cera 12 unid");
            break;
        case 300:
            JOptionPane.showMessageDialog(null,"Cartolina branca");
            break;
        case 310:
            JOptionPane.showMessageDialog(null,"Resma de sulfite A4");
            break;
        case 400:
            JOptionPane.showMessageDialog(null,"Estojo escolar verde");
            break;
        case 470:
            JOptionPane.showMessageDialog(null,"Caderno universitário 100fls.");
            break;
        case 500:
            JOptionPane.showMessageDialog(null,"Caderno brochura 50fls.");
            break;
        default:
            JOptionPane.showMessageDialog(null,"Produto não cadastrado");   
            break;
        }
    }
}