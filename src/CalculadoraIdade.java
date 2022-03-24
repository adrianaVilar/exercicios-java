import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculadoraIdade {
    public static String calcularIdade (int anoNasc, int anoAtual) {
        int idadeAno = anoAtual - anoNasc;
        int idadeMes = idadeAno * 12;
        int idadeDia = idadeAno * 365;
        int idadeSemana = idadeAno * 52;
        return "Diferença entre anos: " + idadeAno + "\nEntre meses " + idadeMes + "\nEntre dias: " + idadeDia + "\nEntre semanas: " + idadeSemana;
    }
    public static String calcularIdade (int dia, int mes, int ano) {
        LocalDate agora = LocalDate.now();
        LocalDate nascimento = LocalDate.of(ano, mes, dia);
        long idadeMes = ChronoUnit.MONTHS.between(nascimento, agora);
        long idadeAno = ChronoUnit.YEARS.between(nascimento, agora);
        long idadeSemana = ChronoUnit.WEEKS.between(nascimento, agora);
        long idadeDia = ChronoUnit.DAYS.between(nascimento, agora);
        return "Diferença entre anos: " + idadeAno + "\nEntre meses " + idadeMes + "\nEntre dias: " + idadeDia + "\nEntre semanas: " + idadeSemana;
    }
}
