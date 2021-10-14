package exercicio01;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int eleitores;
        int brancos;
        int nulos;
        int validos;
        float percentualb;
        float percentualn;
        float percentualv;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Programa para calcular o percentual de votos dos eleitores\n");
        System.out.println("Digite o número total de eleitores: \n");
        eleitores = leitor.nextInt();
        System.out.println("Agora digite o número de votos válidos: \n");
        validos = leitor.nextInt();
        System.out.println("Agora digite o número de votos em branco: \n");
        brancos = leitor.nextInt();
        System.out.println("Por gentileza, digite os votos nulos: \n");
        nulos = leitor.nextInt();
        percentualv = (float)(validos*100/eleitores);
        percentualb = (float)(brancos*100/eleitores);
        percentualn = (float)(nulos*100/eleitores);
        System.out.println("O percentual de votos validos "+percentualv+"%\n");
        System.out.println("O percentual de votos brancos "+percentualb+"%\n");
        System.out.println("O percentual de votos nulos"+percentualn+"%");
    }
}
