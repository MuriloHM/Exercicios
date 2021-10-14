package exercicio01;
import javax.swing.JOptionPane;

public class Ex01 {

    public static void main(String[] args) {
        int idade;
        
        idade = Integer.parseInt(JOptionPane.showInputDialog("Escreva a sua idade"));
        
        if (idade < 60){
            JOptionPane.showMessageDialog(null,"Você vai para a fila comum");
        }else{
            if(idade >= 60){
                if(idade >= 80){
                    JOptionPane.showMessageDialog(null, "Você vai para a fila de 80+");
                }else{
                    JOptionPane.showMessageDialog(null, "Você vai para a fila prioritária");
                }
            
            }
        }
}
   
}