package Forum;
import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[]args){
        String signo;
        
        signo = JOptionPane.showInputDialog("Olá, Seja bem-vindo(a)!"
                +"\nDigite o seu signo abaixo:");
        
        switch (signo){
            case "Áries":
                JOptionPane.showMessageDialog(null,"Então quer dizer que você é de " + signo+"!" 
                        +"\nNasceu entre 21 de março a 20 de abril sem dúvida." );
                break;
            case "Touro":
                JOptionPane.showMessageDialog(null, "Mas veja só, você é de " + signo+"!"
                +"\nPortanto nasceu entre 21 de abril a 20 de maio.");
                break;
            case "Gêmeos":
                JOptionPane.showMessageDialog(null, "Bacana! você é de " + signo +"!"
                +"\nVocê nasceu entre 21 de maio e 20 de junho.");
                break;
            case "Câncer":
                JOptionPane.showMessageDialog(null,"Opa, você é de "+ signo +"!"
                        +"\nNasceu entre os dias 21 de junho a 22 de julho!");
                break;
            case "Leão":
                JOptionPane.showMessageDialog(null,"Interessante, você é de "+ signo +"!"
                        +"\nNasceu entre os dias 23 de julho a 22 de agosto!");
                break;
            case "Virgem":
                JOptionPane.showMessageDialog(null,"Veja que bacana, você é de "+ signo +"!"
                        +"\nPortanto, nasceu entre os dias 23 de agosto a 22 de setembro!");
                break;
            case "Libra":
                JOptionPane.showMessageDialog(null,"Olha só! Você é de "+ signo +"!"
                        +"\nNascimento entre os dias 23 de setembro a 22 de outubro, com certeza!");
                break;
            case "Escorpião":
                JOptionPane.showMessageDialog(null,"Então tu és de "+ signo +"!"
                        +"\nJá sei quando nasceu, entre os dias 23 de outubro a 21 de novembro.");
                break;
            case "Sagitário":
                JOptionPane.showMessageDialog(null,"Opa, você é "+ signo +"!"
                        +"\nNasceu entre os dias 22 de novembro a 21 de dezembro");
                break;
            case "Capricórnio":
                 JOptionPane.showMessageDialog(null,"Olha você, de "+ signo +"!"
                        +"\nEntre os dias 22 de dezembro a 20 de janeiroo");
                break;   
            case "Aquário":
                JOptionPane.showMessageDialog(null,"Você é de "+ signo +"! Interessante!"
                        +"\nNasceu entre os dias 21 de agosto a 18 de fevereiro.");
                break;
            case "Peixes":
                JOptionPane.showMessageDialog(null,"Não sabia que você era de "+ signo +", bom saber!"
                        +"\nPortanto, nasceu entre os dias 19 de fevereiro a 20 de março.");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Você deve ter digitado algo errado, tente novamente mais tarde!"
                +"\nLembre-se, não esqueça da capitalização das palavras e os sinais de pontuação.");
                break;
        }
    }
    
}
