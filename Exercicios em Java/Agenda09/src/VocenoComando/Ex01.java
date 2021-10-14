package VocenoComando;
import javax.swing.JOptionPane;

public class Ex01{
	public static void main(String[]args){
		double  notas[] = new double[5];
		double soma = 0;
		double media;
		int contador;
		
		for (contador = 0; contador < 5;contador++){
			notas[contador] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da " + (contador + 1) + "º atividade:"));
		}
		for (contador = 0;contador < 5; contador++){
			soma = soma + notas[contador];
		}
				
		media = soma/contador;
		
		if(media >= 5){
                    JOptionPane.showMessageDialog(null,"A média foi "+ media+"\nentão, passou de módulo!");
		}else{
                    JOptionPane.showMessageDialog(null,"A média foi "+ media+"\nentão, não passou de módulo.");			
		}
		
	}
}