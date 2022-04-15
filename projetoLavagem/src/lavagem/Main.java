package lavagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Qual ítem você deseja lavar? \n 1 - Louça; \n 2 - Roupa.");

        Scanner scan = new Scanner(System.in);

        int desejaLavar = scan.nextInt();

        if (desejaLavar == 1) {
            Louca l1 = new Louca(false, false, false);

            System.out.println("Pressione 1 para lavar ou qualquer outra tecla para sair.");
            int lavar = scan.nextInt();

            if (lavar == 1) {
                l1.setLoucaLimpa(true);
                System.out.println("Pressione 1 para secar ou qualquer outra tecla para sair.");
                int secar = scan.nextInt();

                if (secar == 1) {
                    l1.setLoucaSeca(true);
                    System.out.println("Pressiona 1 para guardar ou qualquer outra tecla para sair.");
                    int guardar = scan.nextInt();

                    if (guardar == 1) {
                        l1.setLoucaGuardada(true);
                        System.out.println("A louça está:\nLimpa: " + l1.getLoucaLimpa() + "\n" + "Seca: "
                                + l1.getLoucaSeca() + "\nGuardada: " + l1.getLoucaGuardada());
                    } else {
                        System.out.println("A louça está:\nLimpa: " + l1.getLoucaLimpa() + "\nSeca: " +
                                l1.getLoucaSeca() + "\nGuardada: " + l1.getLoucaGuardada());
                    }
                }  else {
                    System.out.println("A louça está:\nLimpa: " + l1.getLoucaLimpa() + "\nSeca: " +
                            l1.getLoucaSeca() + "\nGuardada: " + l1.getLoucaGuardada());
                }
            }  else {
                System.out.println("A louça está:\nLimpa: " + l1.getLoucaLimpa() + "\nSeca: " +
                        l1.getLoucaSeca() + "\nGuardada: " + l1.getLoucaGuardada());
            }

        } else if (desejaLavar == 2) {
            Roupa r1 = new Roupa(false, false, false);

            System.out.println("Pressione 1 para lavar ou qualquer outra tecla para sair.");
            int lavar = scan.nextInt();

            if (lavar == 1) {
                r1.setLimpa(true);
                System.out.println("Pressione 1 para secar ou qualquer outra tecla para sair.");
                int secar = scan.nextInt();

                if (secar == 1) {
                    r1.setRoupaSeca(true);
                    System.out.println("Pressiona 1 para guardar ou qualquer " + "outra tecla para sair.");
                    int guardar = scan.nextInt();

                    if (guardar == 1) {
                        r1.setRoupaGuardada(true);
                        System.out.println("A roupa está:\nLimpa: " + r1.getRoupaLimpa() + "\n" + "Seca: " +
                                r1.getRoupaSeca() + "\nGuardada: " + r1.getRoupaGuardada());
                    } else {
                        System.out.println("A roupa está:\nLimpa: " + r1.getRoupaLimpa() + "\nSeca: " +
                                r1.getRoupaSeca() + "\nGuardada: " + r1.getRoupaGuardada());
                    }
                } else {
                    System.out.println("A roupa está:\nLimpa: " + r1.getRoupaLimpa() + "\nSeca: " +
                            r1.getRoupaSeca() + "\nGuardada: " + r1.getRoupaGuardada());
                }

            } else {
                System.out.println("A roupa está:\nLimpa: " + r1.getRoupaLimpa() + "\nSeca: " +
                        r1.getRoupaSeca() + "\nGuardada: " + r1.getRoupaGuardada());
            }
        }
    }
}