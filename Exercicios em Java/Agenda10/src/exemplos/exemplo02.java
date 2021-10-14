package exemplos;
import javax.swing.JOptionPane;

public class exemplo02 {
    public static void main(String[]args){
        int mat [][] = {{1,2},{3,4}};
        
        for(int linha= 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 2; coluna++){
                JOptionPane.showMessageDialog(null,"Matriz"+"\n"+"Linha[ "+linha+ "] coluna[ "+ coluna+"] = "+mat[linha][coluna]);
            }
        }
    }
    
}
