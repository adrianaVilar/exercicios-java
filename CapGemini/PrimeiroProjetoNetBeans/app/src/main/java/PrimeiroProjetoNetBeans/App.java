package PrimeiroProjetoNetBeans;

import java.util.Scanner;

public class App {
    public void getVerification() {
                
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o n�mero que digitos que ser�o verificados: ");
        
        int num = scan.nextInt();
      
        while (num > 0){
        
            System.out.println("Digite um n�mero: ");
            int numVerificar = scan.nextInt();
            
            if(numVerificar > 0){
                System.out.println("O n�mero '" + numVerificar + "' � positivo");
            } else if(numVerificar < 0){
                System.out.println("O n�mero '" + numVerificar + "' � negativo");
            } else {
                System.out.println("O n�mero � zero");
            }    
            num--;
        }
    }

    public static void main(String[] args) {
       new App().getVerification();
    }
}
