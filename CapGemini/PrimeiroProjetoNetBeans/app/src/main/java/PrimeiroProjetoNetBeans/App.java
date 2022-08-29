package PrimeiroProjetoNetBeans;

import java.util.Scanner;

public class App {
    public void getVerification() {
                
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o número que digitos que serão verificados: ");
        
        int num = scan.nextInt();
      
        while (num > 0){
        
            System.out.println("Digite um número: ");
            int numVerificar = scan.nextInt();
            
            if(numVerificar > 0){
                System.out.println("O número '" + numVerificar + "' é positivo");
            } else if(numVerificar < 0){
                System.out.println("O número '" + numVerificar + "' é negativo");
            } else {
                System.out.println("O número é zero");
            }    
            num--;
        }
    }

    public static void main(String[] args) {
       new App().getVerification();
    }
}
