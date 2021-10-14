package VocenoComando;
import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[]arg){
        int seleciona, submenu;
        
        seleciona = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 3"
                +"\n1 - Cadastrar usuário"
                +"\n2 - Alterar dados"
                +"\n3 - Excluir dados"));
        
        switch (seleciona){
            case 1:
                JOptionPane.showMessageDialog(null,"Cadastrando usuário");
                break;
            case 2:
                submenu=Integer.parseInt(JOptionPane.showInputDialog("Digite o que deseja alterar"
                        +"\n1 - Alterar nome"
                        +"\n2 - Alterar endereço"
                        +"\n3 - Alterar telefone"
                        +"\n4 - Alterar RG"));
            switch (submenu){
                case 1 :
                    JOptionPane.showMessageDialog(null,"Alterando nome");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Alterando endereço");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Alterando telefone");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Alterando RG");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida");
                    break;
                                    
            }
            
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