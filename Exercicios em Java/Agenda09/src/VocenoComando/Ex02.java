package VocenoComando;
import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[]args){
        int [] numero = new int[10];
        String listapar = "";
        String listaimpar = "";
        int contador;
        


        for(contador = 0;contador < 6; contador++){
         numero[contador] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
         
        }
        
        listapar = "Lista de números pares:\n";
        listaimpar = "Lista de números impares:\n";        
        
        for(contador = 0; contador < 6;contador++){
            if(contador%2==0){
                listapar = listapar+(2*numero[contador])+"\n";
            }else{
                listaimpar = listaimpar+numero[contador]+"\n";
            }
        }
        JOptionPane.showMessageDialog(null,listapar+"\n\n\n"+listaimpar);
 
        
    }
}
 
