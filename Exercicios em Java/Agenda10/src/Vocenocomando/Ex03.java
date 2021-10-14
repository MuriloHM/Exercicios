package Vocenocomando;
import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[] args){
        String clientes[][] = new String[4][3];
        int linha, coluna;
        String saida = "Nome: ";
        
        JOptionPane.showMessageDialog(null, "Programa para armazenar dados");
        
        for(linha = 0; linha < 4; linha++){
            clientes[linha][0]=JOptionPane.showInputDialog("Cliente "+linha+"\nDigite seu nome: ");
            clientes[linha][1]=JOptionPane.showInputDialog("Cliente "+linha+"\nDigite sua cidade: ");
            clientes[linha][2]=JOptionPane.showInputDialog("Cliente "+linha+"\nDigite seu estado:");
        }
        JOptionPane.showMessageDialog(null, "Dados armazenados");
        for(linha = 0; linha < 4; linha++){
            for(coluna = 0; coluna < 3; coluna++){
                saida = saida.concat(clientes[linha][coluna]);
                if (coluna == 0){
                    saida = saida.concat("\nCidade: ");
                }
                if (coluna == 1){
                    saida = saida.concat("\nEstado: ");
                }
                               
            }
            JOptionPane.showMessageDialog(null,"Dados:\n"+saida);
            saida="Nome: ";
            
        }
                

    }
    
}
