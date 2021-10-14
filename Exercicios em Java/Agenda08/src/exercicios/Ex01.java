package exercicios;
import javax.swing.JOptionPane;

public class Ex01 {

    public static void main(String[] args) {
        int idade;
        int contador = 0;
        int qntA = 0;
        int qntD = 0;
        int qntE = 0;
        double porcentagem;
        String opiniao;
        double media;
        media = 0;
                
        while(contador < 100){
           idade = Integer.parseInt(JOptionPane.showInputDialog("----Cinema Incrivel----"+"\nDigite sua idade por favor: "));
           
           opiniao = JOptionPane.showInputDialog(("O que você achou do filme?"
                   +"\nEscolha a opção desejada!"
                   +"\nA - Ótimo"
                   +"\nB - Bom"
                   +"\nC - Regular"
                   +"\nD - Ruim"
                   +"\nE - Péssimo"));
           switch (opiniao){
               case "A":
                   JOptionPane.showMessageDialog(null,"Você escolheu Ótimo");
                   qntA = qntA + 1;
                   break;
                
               case "B":
                   JOptionPane.showMessageDialog(null,"Você escolheu Bom");
                   break;
               case "C":
                   JOptionPane.showMessageDialog(null,"Você escolheu Regular");
                   break;
               case "D":
                   JOptionPane.showMessageDialog(null,"Você escolheu Ruim");
                   qntD = qntD + 1;
                   media = media + idade;
                   break;
               case "E": 
                   JOptionPane.showMessageDialog(null,"Você escolheu Péssimo");
                   qntE = qntE + 1;
                   break;
               default :
                   JOptionPane.showMessageDialog(null,"Você digitou opção inválida");
                   
           }
           
                    
        contador++;
                    
        }
        //Processamento
        media = media / qntD;   
        porcentagem = qntE*100/100;
        
        //Saida
        JOptionPane.showMessageDialog(null, "Total de respostas *Ótimo: "+qntA
                +"\nMédia de idade das pessoas que responderam *Ruim: "+media
                +"\nPorcentagem de respostas *Péssimo: "+porcentagem+"%");
    }
    
}