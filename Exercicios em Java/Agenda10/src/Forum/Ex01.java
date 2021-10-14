package Forum;
import javax.swing.JOptionPane;
/**
 *
 * @author Murilo
 */
public class Ex01 {
    public static void main (String[]args){
    //String multa [][] = new String[4][3];
    int linha, coluna;
    String tipo ="";
    /*
    multa[1][1] = "7";
    multa[1][2] = "293";
    multa[2][1] = "5";
    multa[2][2] = "195";
    multa[3][1] = "4";
    multa[3][2] = "130";
    multa[4][1] = "3";
    multa[4][2] = "88";
    */
    String multa[][] = {{"","7","293"},{"","5","195"}, {"","4","130"},{"","3","88"}};
            
    tipo = JOptionPane.showInputDialog("Tipos de multa:"+"\n"+"-Gravissimo"+
            "\n-Grave"+
            "\n-Média"+
            "\n-Leve"+
            "\nInforme o tipo da multa: ");
    switch (tipo){
        case"Gravissimo":
            tipo = tipo + multa[0][0];
            JOptionPane.showMessageDialog(null, "O tipo da multa" + tipo);
            break;
        case "Grave":
    }
    
    }  
}
