package exemplos;
import javax.swing.JOptionPane;

public class Exemplo04 {
    public static void main(String[]args){
        String login,senha;
        
        login = JOptionPane.showInputDialog("Entre com o login");
        senha = JOptionPane.showInputDialog("Entre com a senha");
        
        if (login.equals("aluno") && senha.equals("aluno")){
            JOptionPane.showMessageDialog(null,"Acesso liberado");
        }else{
            JOptionPane.showMessageDialog(null,"Login ou Senha incorretos");
        }
        
    }
        
    
    
}
