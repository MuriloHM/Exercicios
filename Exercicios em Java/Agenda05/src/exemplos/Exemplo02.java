package exemplos;
import javax.swing.JOptionPane;

public class Exemplo02 {
    public static void main(String [] args){
        int dia;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número um número de 1 a 7"));
        
        if(dia == 1){
            JOptionPane.showMessageDialog(null,"Você escolheu Domingo");
        }else {
            if(dia == 2 ){
                JOptionPane.showMessageDialog(null,"Você escolheu Segunda-feira");
            }else{
                if(dia == 3){
                    JOptionPane.showMessageDialog(null,"Você escolheu Terça-feira");
                }else{
                    if(dia == 4){
                        JOptionPane.showMessageDialog(null,"Você escolheu Quarta-feira");
                    }else{
                        if(dia == 5){
                            JOptionPane.showMessageDialog(null, "Você escolheu Quinta-feira");
                        }else{
                            if(dia == 6){
                                JOptionPane.showMessageDialog(null,"Você escolheu Sexta-feira");
                            }else{
                                if(dia == 7){
                                    JOptionPane.showMessageDialog(null, "Você escolheu Sábado");
                                }else{
                                    JOptionPane.showMessageDialog(null,"Número inválido");
                                }
                            }
                        }
                    }
                }
            }
            
        }
    }
    
}
