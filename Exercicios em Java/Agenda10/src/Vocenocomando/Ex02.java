package Vocenocomando;
import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[]args){
        int matriza[][] = new int[2][2];
        int matrizb[][] = new int[2][2];
        int matrizc[][] = new int[2][2];
        int soma, linha, coluna;
        
        JOptionPane.showMessageDialog(null,"Soma de Matrizes");
        
        JOptionPane.showMessageDialog(null,"Valores para Matriz A");
        for(linha = 0; linha < 2; linha++){
            for(coluna = 0; coluna < 2; coluna++){
             matriza[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Linha "+(linha+1)
                        +"\nColuna "+(coluna+1)+"\nDigite um valor: "));
            }
        }
        
        for(linha = 0; linha < 2; linha++){
            for(coluna=0;coluna<2;coluna++){
                JOptionPane.showMessageDialog(null,"Linha "+(linha+1)+"\nColuna "+(coluna+1)+"\nValor digitado: "+matriza[linha][coluna]);
            }
        }
        
        JOptionPane.showMessageDialog(null,"Valores para Matriz B");
        for(linha = 0; linha < 2; linha++){
            for(coluna = 0; coluna < 2; coluna++){
             matrizb[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Linha "+(linha+1)
                        +"\nColuna "+(coluna+1)+"\nDigite um valor: "));
            }
        }
        
        for(linha = 0; linha < 2; linha++){
            for(coluna=0;coluna < 2;coluna++){
                JOptionPane.showMessageDialog(null,"Linha "+(linha+1)+"\nColuna "+(coluna+1)+"\nValor digitado: "+matrizb[linha][coluna]);
            }
        }
        JOptionPane.showMessageDialog(null,"Valores para Matriz C");
        for(linha = 0; linha < 2; linha++){
            for(coluna = 0; coluna < 2; coluna++){
             soma = matriza[linha][coluna] + matrizb[linha][coluna];
             matrizc[linha][coluna] = matrizc[linha][coluna] + soma;
            }
        }
        
        for(linha = 0; linha < 2; linha++){
            for(coluna = 0; coluna < 2; coluna++){
                JOptionPane.showMessageDialog(null,"Linha "+(linha+1)+"\nColuna "+(coluna+1)+"\nResultado da soma matriz A+B: "+matrizc[linha][coluna]);
            }
            
        }
        
        
    }
    
}
