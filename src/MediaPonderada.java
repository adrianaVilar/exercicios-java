public class MediaPonderada {
    public static double calculaMediaPonderada(double n1, int p1, double n2, int p2, double n3, int p3) {
        return ( ( n1 * p1 ) + ( n2 * p2 ) + ( n3 * p3 ) )  / ( p1 + p2 + p3);
    }
}
