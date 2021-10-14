package VocenoComando;
import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[]arg){
        int selecao;
        
        selecao = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 3"
                +"\n1 - Cadastrar usuário"
                +"\n2 - Alterar dados"
                +"\n3 - Excluir dados"));
        
        switch (selecao){
            case 1:
                JOptionPane.showMessageDialog(null,"Cadastrando usuário");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Alterando dados");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Excluindo usuário");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");
                break;
        }
    }
    
}
