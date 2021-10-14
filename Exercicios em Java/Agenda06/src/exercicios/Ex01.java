package exercicios;
import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[]args){
        int mes;
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 12 para o mês desejado"));
        switch (mes){
            case 1:
                JOptionPane.showMessageDialog(null, "O mês digitado foi janeiro");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "O mês digitado foi fevereiro");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "O mês digitado foi março");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "O mês digitado foi abril");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "O mês digitado foi maio");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "O mês digitado foi junho");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "O mês digitado foi julho");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "O mês digitado foi agosto");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "O mês digitado foi setembro");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "O mês digitado foi outubro");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "O mês digitado foi novembro");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "O mês digitado foi dezembro");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Mês inválido");
                break;
        }
    }
}
