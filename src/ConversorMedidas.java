public class ConversorMedidas {

    public static double converteParaPolega (double medida) {
        return medida * 12;
    }

    public static double converteParaJarda (double medida) {
        return medida / 3;
    }

    public static double converteParaMilha (double medida) {
        return medida / 3 / 1760;
    }

}
