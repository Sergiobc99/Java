public class ImprimirChars {
    public static void main(String[] args) {
        imprimir('*', 5);
    }

    public static void imprimir (char symbol, int filas) {
        for (int i = 0; i < filas; i++) {
            System.out.print(symbol);
        }
    }
}