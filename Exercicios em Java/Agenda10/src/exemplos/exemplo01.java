package exemplos;
//import javax.swing.JOptionPane;
import java.util.Scanner;


public class exemplo01 {
    public static void main (String[]args){
        
        int matriz[][]=new int[2][4];
        int linha,coluna;
        String lista ="";
        
        Scanner leia = new Scanner (System.in);
        
        for(linha = 0;linha < 2; linha ++){
            for(coluna = 0; coluna < 4; coluna++){
                System.out.print("Digite um número: ");
                matriz[linha][coluna] = leia.nextInt();
            }
        }
        System.out.println("Valore digitados:");
        
        for(linha = 0;linha < 2; linha++){
            for(coluna = 0; coluna < 4; coluna++){
                lista += matriz[linha][coluna]+"|";
            }
            lista+="\n";
        }
        System.out.println(lista);
        /*double num [][] = new double[4][4];  
        int linha, coluna;
        String exibir="";
        JOptionPane.showMessageDialog(null,"Inserindo os dados da Matriz");
        
        for(linha = 0;linha < 4;linha++){
            for(coluna = 0;coluna < 4;coluna++){
                num[linha][coluna] = Double.parseDouble(JOptionPane.showInputDialog("Entre com o número"+"\nlinha "+""+linha
                        +"\ncoluna "+coluna));
            }
        }
        JOptionPane.showMessageDialog(null,"Mostrando os dados da matriz");
        
        for(linha = 0;linha < 4; linha++){
            for(coluna = 0;coluna < 4; coluna++){
                exibir+=num[linha][coluna]+" | ";
            }
            exibir+="\n";
        }
        JOptionPane.showMessageDialog(null,exibir);
        
        
        
        */
        }
        
    
    
}
