package controlefluxo;

import java.util.Scanner;

public class Contador{
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro parâmetro: ");
            int parametro1 = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            int parametro2 = terminal.nextInt();
            try {
                contador(parametro1,parametro2);
            } catch (ParametrosInvalidosException e) {
                System.out.println("O primeiro parâmetro precisa ser menor que o segundo");
                
            }
        } catch ( java.util.InputMismatchException e) {
            System.out.println("O parâmetro precisa ser um número inteiro");        
        }
        terminal.close();
    }
    static void contador(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1>parametro2){
            throw new ParametrosInvalidosException();
        }
        for(int i= parametro1;i<parametro2; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
    
}