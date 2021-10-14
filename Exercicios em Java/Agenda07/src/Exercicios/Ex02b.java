package Exercicios;

public class Ex02b {
    public static void main(String[]args){
        int resultado;
        System.out.println("Tabuada de 6 até 10");
        
        
        for(int contador = 6; contador <= 10; contador++){
            if (contador == 6){
                System.out.println("\n____Tabuada do "+ contador +"____");
                for(int num = 0; num <= 10; num++){
                    resultado = contador * num;
                    System.out.print("\n"+contador+" x "+num+" = "
                            +resultado+"\n");
                }
            }
            if (contador == 7){
                    System.out.println("\n____Tabuada do "+ contador +"____");
                for(int num = 0; num <= 10; num++){
                    resultado = contador * num;
                    System.out.print("\n"+contador+" x "+num+" = "
                            +resultado+"\n");
                }
            }
            if (contador == 8){
                    System.out.println("\n____Tabuada do "+ contador +"____");
                for(int num = 0; num <= 10; num++){
                    resultado = contador * num;
                    System.out.print("\n"+contador+" x "+num+" = "
                            +resultado+"\n");
                }
            }
            if (contador == 9){
                    System.out.println("\n____Tabuada do "+ contador +"____");
                for(int num = 0; num <= 10; num++){
                    resultado = contador * num;
                    System.out.print("\n"+contador+" x "+num+" = "
                            +resultado+"\n");
                }
            }
            if (contador == 10){
                    System.out.println("\n____Tabuada do "+ contador +"____");
                for(int num=  0; num <= 10; num++){
                    resultado = contador * num;
                    System.out.print("\n"+contador+" x "+num+" = "
                            +resultado+"\n");
                }
            }
        }
    }
}
