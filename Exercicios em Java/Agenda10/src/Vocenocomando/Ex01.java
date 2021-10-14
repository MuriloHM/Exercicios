package Vocenocomando;
import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[]args){
        double notas [][] = new double [10][4];
        int linha, coluna;
        double media = 0;
        String exiba = "";
        
//Entrada de dados
        JOptionPane.showMessageDialog(null, "Programa para médias");
        
        for(linha = 0;  linha < 10; linha++){
            for(coluna = 0; coluna < 3; coluna++){
                notas[linha][coluna] = Double.parseDouble(JOptionPane.showInputDialog("Digite a "+(coluna+1)+"º nota do "+ (linha+1) + "º aluno" ));
            }
        }
        
//Calculando médias
        
        for(linha = 0; linha < 10; linha++){
            for(coluna = 0; coluna < 3; coluna++){
                media = media + notas[linha][coluna];
            }
            notas[linha][3] = media / 3;
            //zera média para entrar a nota do próximo aluno
            media = 0;
        }
        
      
//Saida de dados
        JOptionPane.showMessageDialog(null, "Menções dos alunos");
        for(linha = 0; linha < 10; linha++){
            for(coluna = 0; coluna < 3; coluna++){
                JOptionPane.showMessageDialog(null, "Aluno "+(linha + 1)+"\n"+"Atividade "+(coluna+1)+"\n"+"\nNota= "+ notas[linha][coluna]);
            }
            JOptionPane.showMessageDialog(null,"Média =  "+notas[linha][3]);
        }
        
                
    }
    
}
