package controle;

import java.time.LocalDate;

public class DesafioAnoBissexto {
    public static void main(String[] args) {
        //criar data agora e depois pegar o ano
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();

        if (anoAtual % 4 == 0) {
            System.out.println("O ano é bissexto.");
        } else {
            System.out.println("O ano não é bissexto.");
        }
    }
}
